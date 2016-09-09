-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-09-2016 a las 18:09:52
-- Versión del servidor: 5.6.17
-- Versión de PHP: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `ott`
--
CREATE DATABASE IF NOT EXISTS `ott` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `ott`;

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `guardarCluster`(IN Nombre VARCHAR(80))
BEGIN
	INSERT INTO cluster(nombre) VALUES (Nombre);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `login`(IN `usuar` VARCHAR(255), IN `pass` VARCHAR(255), OUT `exito` BOOLEAN)
BEGIN 
Declare x int default 0;
SELECT count(*) into x from administradores where usuario = usuar and contrasena = pass;
if  x > 0 and x < 2 then  
set exito = true;
else 
set exito = false;
end if;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administradores`
--

CREATE TABLE IF NOT EXISTS `administradores` (
  `idAdministradores` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) NOT NULL,
  `contrasena` varchar(45) NOT NULL,
  `usuario` varchar(45) DEFAULT NULL,
  `apellido_paterno` varchar(45) DEFAULT NULL,
  `apellido_materno` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idAdministradores`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `administradores`
--

INSERT INTO `administradores` (`idAdministradores`, `Nombre`, `contrasena`, `usuario`, `apellido_paterno`, `apellido_materno`) VALUES
(1, 'Marco Antonio Arcos', '123456', 'marco', 'Arcos', 'Martinez'),
(2, 'Omar', '123456789', 'omar@bd.com', 'Segura', 'Gaona'),
(3, 'gil', 'gil', 'gil', 'gil', 'gil');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `centro_investigacion`
--

CREATE TABLE IF NOT EXISTS `centro_investigacion` (
  `idCentroInvestigacion` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(70) NOT NULL,
  `calle` varchar(70) DEFAULT NULL,
  `colonia` varchar(70) DEFAULT NULL,
  `municipio` varchar(70) DEFAULT NULL,
  `estado` varchar(70) DEFAULT NULL,
  `pais` varchar(70) DEFAULT NULL,
  `telefono` varchar(70) DEFAULT NULL,
  PRIMARY KEY (`idCentroInvestigacion`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `centro_investigacion`
--

INSERT INTO `centro_investigacion` (`idCentroInvestigacion`, `nombre`, `calle`, `colonia`, `municipio`, `estado`, `pais`, `telefono`) VALUES
(1, 'CEDITTEC', 'AUTOPISTA mexico acapulco', 'Xoc', 'Xochitepec', 'morelos', 'mexico', '7777891234'),
(2, 'UAEM', 'universidad no 4', 'universidad', 'cuernavaca', 'morelos', 'mexico', '7771234567');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cluster`
--

CREATE TABLE IF NOT EXISTS `cluster` (
  `idCluster` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`idCluster`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `cluster`
--

INSERT INTO `cluster` (`idCluster`, `nombre`) VALUES
(1, 'Vivienda'),
(2, 'Computacion'),
(3, 'Automotriz'),
(4, 'Salud');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estatus`
--

CREATE TABLE IF NOT EXISTS `estatus` (
  `idEstatus` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idEstatus`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `estatus`
--

INSERT INTO `estatus` (`idEstatus`, `Descripcion`) VALUES
(1, 'Prototipo funcional');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estatus_oferta`
--

CREATE TABLE IF NOT EXISTS `estatus_oferta` (
  `idEstatus` int(11) NOT NULL,
  `idOferta` int(11) NOT NULL,
  PRIMARY KEY (`idEstatus`,`idOferta`),
  KEY `fk_Estatus_has_Oferta_Oferta1_idx` (`idOferta`),
  KEY `fk_Estatus_has_Oferta_Estatus1_idx` (`idEstatus`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `estatus_oferta`
--

INSERT INTO `estatus_oferta` (`idEstatus`, `idOferta`) VALUES
(1, 1),
(1, 2),
(1, 3),
(1, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estatus_patente`
--

CREATE TABLE IF NOT EXISTS `estatus_patente` (
  `idEstatus_patente` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idEstatus_patente`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `estatus_patente`
--

INSERT INTO `estatus_patente` (`idEstatus_patente`, `descripcion`) VALUES
(1, 'Solicitud'),
(2, 'Otorgada');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `investigador`
--

CREATE TABLE IF NOT EXISTS `investigador` (
  `idInvestigador` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido_paterno` varchar(45) DEFAULT NULL,
  `apellido_materno` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idInvestigador`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `investigador`
--

INSERT INTO `investigador` (`idInvestigador`, `nombre`, `apellido_paterno`, `apellido_materno`) VALUES
(1, 'Marco', 'Arcos', 'Martinez'),
(2, 'JuanNose', 'Marti', 'G');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `investigador_centro`
--

CREATE TABLE IF NOT EXISTS `investigador_centro` (
  `idInvestigador` int(11) NOT NULL,
  `idCentro` int(11) NOT NULL,
  PRIMARY KEY (`idInvestigador`,`idCentro`),
  KEY `fk_Investigador_has_Centro_investigacion_Centro_investigaci_idx` (`idCentro`),
  KEY `fk_Investigador_has_Centro_investigacion_Investigador_idx` (`idInvestigador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `investigador_centro`
--

INSERT INTO `investigador_centro` (`idInvestigador`, `idCentro`) VALUES
(1, 1),
(2, 1),
(2, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `oferta`
--

CREATE TABLE IF NOT EXISTS `oferta` (
  `idOferta` int(11) NOT NULL AUTO_INCREMENT,
  `Titulo` varchar(80) NOT NULL,
  `Descripcion` text,
  `Antecedente` text,
  `Ventajas` text,
  `Mercado` text,
  `Cluster_idCluster` int(11) NOT NULL,
  `Administradores_idAdministradores` int(11) NOT NULL,
  PRIMARY KEY (`idOferta`,`Cluster_idCluster`,`Administradores_idAdministradores`),
  KEY `fk_Oferta_Cluster1_idx` (`Cluster_idCluster`),
  KEY `fk_Oferta_Administradores1_idx` (`Administradores_idAdministradores`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=6 ;

--
-- Volcado de datos para la tabla `oferta`
--

INSERT INTO `oferta` (`idOferta`, `Titulo`, `Descripcion`, `Antecedente`, `Ventajas`, `Mercado`, `Cluster_idCluster`, `Administradores_idAdministradores`) VALUES
(1, 'marco', 'marcod	', 'marcoa', 'marv', 'mrm', 3, 1),
(2, 'Titluo', 'des', 'Ant', 'Ventaja', 'mercado', 3, 1),
(3, 'q', 'q	q', '	q', 'q', 'q', 2, 1),
(4, 'a', 'a', 'a', 'a', 'a', 1, 1),
(5, 'Autos Hibridos', 'Autos lala', 'antencedes', 'vanetaja', 'automotriz', 3, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `oferta_investigador`
--

CREATE TABLE IF NOT EXISTS `oferta_investigador` (
  `idOferta` int(11) NOT NULL,
  `idInvestigador` int(11) NOT NULL,
  PRIMARY KEY (`idOferta`,`idInvestigador`),
  KEY `fk_Oferta_has_Investigador_Investigador1_idx` (`idInvestigador`),
  KEY `fk_Oferta_has_Investigador_Oferta1_idx` (`idOferta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `patente`
--

CREATE TABLE IF NOT EXISTS `patente` (
  `idPatente` int(11) NOT NULL AUTO_INCREMENT,
  `clave` varchar(80) NOT NULL,
  `Oferta_idOferta` int(11) NOT NULL,
  `fk_idEstatus` int(11) NOT NULL,
  PRIMARY KEY (`idPatente`,`fk_idEstatus`),
  KEY `fk_Patente_Oferta1_idx` (`Oferta_idOferta`),
  KEY `fk_Patente_Estatus_patente1_idx` (`fk_idEstatus`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `patente`
--

INSERT INTO `patente` (`idPatente`, `clave`, `Oferta_idOferta`, `fk_idEstatus`) VALUES
(2, '101', 2, 2),
(3, '101', 1, 1),
(4, '100001', 5, 1);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `estatus_oferta`
--
ALTER TABLE `estatus_oferta`
  ADD CONSTRAINT `fk_Estatus_has_Oferta_Estatus1` FOREIGN KEY (`idEstatus`) REFERENCES `estatus` (`idEstatus`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Estatus_has_Oferta_Oferta1` FOREIGN KEY (`idOferta`) REFERENCES `oferta` (`idOferta`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `investigador_centro`
--
ALTER TABLE `investigador_centro`
  ADD CONSTRAINT `fk_Investigador_has_Centro_investigacion_Centro_investigacion1` FOREIGN KEY (`idCentro`) REFERENCES `centro_investigacion` (`idCentroInvestigacion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Investigador_has_Centro_investigacion_Investigador` FOREIGN KEY (`idInvestigador`) REFERENCES `investigador` (`idInvestigador`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `oferta`
--
ALTER TABLE `oferta`
  ADD CONSTRAINT `fk_Oferta_Administradores1` FOREIGN KEY (`Administradores_idAdministradores`) REFERENCES `administradores` (`idAdministradores`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Oferta_Cluster1` FOREIGN KEY (`Cluster_idCluster`) REFERENCES `cluster` (`idCluster`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `oferta_investigador`
--
ALTER TABLE `oferta_investigador`
  ADD CONSTRAINT `fk_Oferta_has_Investigador_Investigador1` FOREIGN KEY (`idInvestigador`) REFERENCES `investigador` (`idInvestigador`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Oferta_has_Investigador_Oferta1` FOREIGN KEY (`idOferta`) REFERENCES `oferta` (`idOferta`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `patente`
--
ALTER TABLE `patente`
  ADD CONSTRAINT `fk_Patente_Estatus_patente1` FOREIGN KEY (`fk_idEstatus`) REFERENCES `estatus_patente` (`idEstatus_patente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Patente_Oferta1` FOREIGN KEY (`Oferta_idOferta`) REFERENCES `oferta` (`idOferta`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
