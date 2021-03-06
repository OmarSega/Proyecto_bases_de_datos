



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gil
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class conexion{

    private static String ipAddress;
    private static String dbName;
    private static String user;
    private static String password;
    private static String service;
    private static ResourceBundle dbProperties;

    public static Connection getConexion() throws SQLException {
        try{ 
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        if (dbProperties == null) {
            dbProperties = ResourceBundle.getBundle("propiedades");
            ipAddress = dbProperties.getString("ip_address");
            dbName = dbProperties.getString("db_name");
            user = dbProperties.getString("user");
            password = dbProperties.getString("password");
            service = dbProperties.getString("service");
        }
       
        return DriverManager.getConnection("jdbc:mysql://" + ipAddress + 
                ":" + service + "/" + dbName, user, password);
    }
}