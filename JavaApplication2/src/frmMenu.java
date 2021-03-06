
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.logging.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marco
 */
public class frmMenu extends javax.swing.JInternalFrame {
    static String investigador[];
   DefaultTableModel modeloTabla, modeloCentros, modeloInvestigadores, modeloOfertas, modeloPatentes;
    public frmMenu(String investigador[]) {
        this.investigador = investigador;
        modeloTabla = new DefaultTableModel(null, getColumnasCluster());
        modeloCentros = new DefaultTableModel(null, getColumnasCentros());
        modeloInvestigadores = new DefaultTableModel(null, getColumnasInvestigadores());
        modeloOfertas = new DefaultTableModel(null, getColumnasOfertas());
        modeloPatentes = new DefaultTableModel(null, getColumnasPatentes());
        
        initComponents();
        
    }
    public String[] getColumnasCluster(){
        return new String[] {"Codigo Cluster", "Nombre Cluster"};
    }
    public String[] getColumnasCentros(){
        return new String[] {"ID","Nombre", "Calle", "Colonia", "Municipio", "Estado", "Pais", "Telefono"};
    }
    public String[] getColumnasInvestigadores(){
        return new String[] {"ID","Nombre", "Apellido Paterno", "Apellido Materno"};
    }
    public String[] getColumnasOfertas(){
        return new String[] {"ID","Titulo", "Descripcion", "Antecedentes", "Ventajas", "Mercado", "ID Cluster"};
    }
    public String[] getColumnasPatentes(){
        return new String[] {"ID","clave", "ID oferta", "Estatus"};
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnAddCentro = new javax.swing.JButton();
        editCentros = new javax.swing.JButton();
        btnActualizarCentros = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnAddInvest = new javax.swing.JButton();
        editInvestigador = new javax.swing.JButton();
        btnActualizarInvestigador = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnAddOferta = new javax.swing.JButton();
        editOferta = new javax.swing.JButton();
        btnActualizarOferta = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaOferta = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        btnAddOferta2 = new javax.swing.JButton();
        editOferta2 = new javax.swing.JButton();
        btnActualizarOferta2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Centro de Administracion");

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Editar");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Actualizar");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(modeloTabla);
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Clusters", new javax.swing.ImageIcon(getClass().getResource("/images/db.png")), jPanel1); // NOI18N

        jTable2.setModel(modeloCentros);
        jScrollPane3.setViewportView(jTable2);

        btnAddCentro.setText("Agregar");
        btnAddCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCentroActionPerformed(evt);
            }
        });

        editCentros.setText("Editar");
        editCentros.setToolTipText("");
        editCentros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCentrosActionPerformed(evt);
            }
        });

        btnActualizarCentros.setText("Actualizar");
        btnActualizarCentros.setToolTipText("");
        btnActualizarCentros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCentrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnActualizarCentros, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(editCentros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAddCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editCentros, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizarCentros, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Centros de Investigacion", new javax.swing.ImageIcon(getClass().getResource("/images/agency.png")), jPanel2); // NOI18N

        btnAddInvest.setText("Agregar");
        btnAddInvest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddInvestActionPerformed(evt);
            }
        });

        editInvestigador.setText("Editar");
        editInvestigador.setToolTipText("");
        editInvestigador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editInvestigadorActionPerformed(evt);
            }
        });

        btnActualizarInvestigador.setText("Actualizar");
        btnActualizarInvestigador.setToolTipText("");
        btnActualizarInvestigador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarInvestigadorActionPerformed(evt);
            }
        });

        jTable3.setModel(modeloInvestigadores);
        jScrollPane4.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnActualizarInvestigador, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(editInvestigador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddInvest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAddInvest, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editInvestigador, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizarInvestigador, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Investigadores", new javax.swing.ImageIcon(getClass().getResource("/images/investigation.png")), jPanel3); // NOI18N

        btnAddOferta.setText("Agregar");
        btnAddOferta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOfertaActionPerformed(evt);
            }
        });

        editOferta.setText("Editar");
        editOferta.setToolTipText("");
        editOferta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editOfertaActionPerformed(evt);
            }
        });

        btnActualizarOferta.setText("Actualizar");
        btnActualizarOferta.setToolTipText("");
        btnActualizarOferta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarOfertaActionPerformed(evt);
            }
        });

        tablaOferta.setModel(modeloOfertas);
        jScrollPane5.setViewportView(tablaOferta);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnActualizarOferta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editOferta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddOferta, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnAddOferta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editOferta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizarOferta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(94, 94, 94))
        );

        jTabbedPane1.addTab("Ofertas", new javax.swing.ImageIcon(getClass().getResource("/images/offert.png")), jPanel4); // NOI18N

        jTable6.setModel(modeloPatentes);
        jScrollPane7.setViewportView(jTable6);

        btnAddOferta2.setText("Agregar");
        btnAddOferta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOferta2ActionPerformed(evt);
            }
        });

        editOferta2.setText("Editar");
        editOferta2.setToolTipText("");
        editOferta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editOferta2ActionPerformed(evt);
            }
        });

        btnActualizarOferta2.setText("Actualizar");
        btnActualizarOferta2.setToolTipText("");
        btnActualizarOferta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarOferta2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnActualizarOferta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editOferta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddOferta2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnAddOferta2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editOferta2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizarOferta2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(94, 94, 94))
        );

        jTabbedPane1.addTab("Patentes", new javax.swing.ImageIcon(getClass().getResource("/images/patent.png")), jPanel5); // NOI18N

        jButton4.setText("Cerrar sesión");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton4)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Clusters");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        modeloTabla.getDataVector().removeAllElements();
        /*int row = modeloTabla.getRowCount();
        for (int j = 0; row > j; j++) {
            modeloTabla.removeRow(j);
        }*/
        
        try {
            Connection con = conexion.getConexion();
            Statement st = con.createStatement();
            String query = "SELECT * FROM Cluster" ;  
            ResultSet rr = st.executeQuery(query);
            Object datos[] = new Object[2];
            while(rr.next()){
                for (int i = 0; i < 2; i++){
                    datos[i] = rr.getObject(i + 1);
                }
                modeloTabla.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        frmAddCluster j = new frmAddCluster();
       
        j.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRowCount() > 0) {
            frmEditCluster edit = new frmEditCluster(modeloTabla.getValueAt(jTable1.getSelectedRow(), 1).toString());
            edit.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null,"Seleccione un cluster porfavor");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAddCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCentroActionPerformed
        // TODO add your handling code here:
        frmAddCentro f = new frmAddCentro();
        f.setVisible(true);
    }//GEN-LAST:event_btnAddCentroActionPerformed

    private void editCentrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCentrosActionPerformed
        // TODO add your handling code here:
        if (jTable2.getSelectedRowCount() > 0) {
            String id = modeloCentros.getValueAt(jTable2.getSelectedRow(), 0).toString();
            String nombre = modeloCentros.getValueAt(jTable2.getSelectedRow(), 1).toString();
            String calle = modeloCentros.getValueAt(jTable2.getSelectedRow(), 2).toString();
            String colonia = modeloCentros.getValueAt(jTable2.getSelectedRow(), 3).toString();
            String municipio = modeloCentros.getValueAt(jTable2.getSelectedRow(), 4).toString();
            String estado = modeloCentros.getValueAt(jTable2.getSelectedRow(), 5).toString();
            String pais = modeloCentros.getValueAt(jTable2.getSelectedRow(), 6).toString();
            String telefono = modeloCentros.getValueAt(jTable2.getSelectedRow(), 7).toString();
            String centro [] = {id , nombre, calle, colonia, municipio, estado, pais, telefono};
            frmEditCentro f = new frmEditCentro(centro);
            f.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null,"Seleccione un centro porfavor");
        }
    }//GEN-LAST:event_editCentrosActionPerformed

    private void btnActualizarCentrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCentrosActionPerformed
        // TODO add your handling code here:
        modeloCentros.getDataVector().removeAllElements();
        
        try {
            Connection con = conexion.getConexion();
            Statement st = con.createStatement();
            String query = "SELECT * FROM Centro_investigacion" ;  
            ResultSet rr = st.executeQuery(query);
            Object datos[] = new Object[8];
            while(rr.next()){
                for (int i = 0; i < 8; i++){
                    datos[i] = rr.getObject(i + 1);
                }
                modeloCentros.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActualizarCentrosActionPerformed

    private void btnAddInvestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddInvestActionPerformed
        // TODO add your handling code here:
        frmAddInvestigador f = new frmAddInvestigador();
                f.setVisible(true);
        
    }//GEN-LAST:event_btnAddInvestActionPerformed

    private void editInvestigadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editInvestigadorActionPerformed
        // TODO add your handling code here:
        if (jTable3.getSelectedRowCount() > 0) {
            frmEditInvestigador f = new frmEditInvestigador(new String[] {
                modeloInvestigadores.getValueAt(jTable3.getSelectedRow(), 0).toString(),
                modeloInvestigadores.getValueAt(jTable3.getSelectedRow(), 1).toString(),
                modeloInvestigadores.getValueAt(jTable3.getSelectedRow(), 2).toString(),
                modeloInvestigadores.getValueAt(jTable3.getSelectedRow(), 3).toString()

            });
            f.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null,"Seleccione un investigador porfavor");
        }
    }//GEN-LAST:event_editInvestigadorActionPerformed

    private void btnActualizarInvestigadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarInvestigadorActionPerformed
        // TODO add your handling code here:
        modeloInvestigadores.getDataVector().removeAllElements();
        
        try {
            Connection con = conexion.getConexion();
            Statement st = con.createStatement();
            String query = "SELECT * FROM Investigador" ;  
            ResultSet rr = st.executeQuery(query);
            Object datos[] = new Object[4];
            while(rr.next()){
                for (int i = 0; i < 4; i++){
                    datos[i] = rr.getObject(i + 1);
                }
                modeloInvestigadores.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActualizarInvestigadorActionPerformed

    private void btnAddOfertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOfertaActionPerformed
        // TODO add your handling code here:
        frmAddOferta f = new frmAddOferta(investigador);
        f.setVisible(true);
        
    }//GEN-LAST:event_btnAddOfertaActionPerformed

    private void editOfertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editOfertaActionPerformed
        // TODO add your handling code here:
        if (tablaOferta.getSelectedRowCount() > 0) {
            String id = modeloOfertas.getValueAt(tablaOferta.getSelectedRow(), 0).toString();
            String titulo = modeloOfertas.getValueAt(tablaOferta.getSelectedRow(), 1).toString();
            String descripcion = modeloOfertas.getValueAt(tablaOferta.getSelectedRow(), 2).toString();
            String antecedentes = modeloOfertas.getValueAt(tablaOferta.getSelectedRow(), 3).toString();
            String ventajas = modeloOfertas.getValueAt(tablaOferta.getSelectedRow(), 4).toString();
            String mercado = modeloOfertas.getValueAt(tablaOferta.getSelectedRow(), 5).toString();
            String cluster = modeloOfertas.getValueAt(tablaOferta.getSelectedRow(), 6).toString();
            
            String centro [] = {id , titulo, descripcion, antecedentes, ventajas, mercado, cluster};
            frmEditOfertas f = new frmEditOfertas(centro);
            f.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null,"Seleccione una oferta porfavor");
        }
    }//GEN-LAST:event_editOfertaActionPerformed

    private void btnActualizarOfertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarOfertaActionPerformed
        // TODO add your handling code here:
        modeloOfertas.getDataVector().removeAllElements();
        
        try {
            Connection con = conexion.getConexion();
            Statement st = con.createStatement();
            String query = "SELECT * FROM Oferta " ;  
            ResultSet rr = st.executeQuery(query);
            Object datos[] = new Object[7];
            while(rr.next()){
                for (int i = 0; i < 7; i++){
                    datos[i] = rr.getObject(i + 1);
                }
                modeloOfertas.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActualizarOfertaActionPerformed

    private void btnAddOferta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOferta2ActionPerformed
        // TODO add your handling code here:
        frmAddPatente f = new frmAddPatente();
        f.setVisible(true);
    }//GEN-LAST:event_btnAddOferta2ActionPerformed

    private void editOferta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editOferta2ActionPerformed
        // TODO add your handling code here:
        if (jTable6.getSelectedRowCount() > 0) {
            String id = modeloPatentes.getValueAt(jTable6.getSelectedRow(), 0).toString();
            String clave = modeloPatentes.getValueAt(jTable6.getSelectedRow(), 1).toString();
            String idOferta = modeloPatentes.getValueAt(jTable6.getSelectedRow(), 2).toString();
            String idEstatus = modeloPatentes.getValueAt(jTable6.getSelectedRow(), 3).toString();
            
            
            String centro [] = {id , clave, idOferta, idEstatus};
            frmEditPatente f = new frmEditPatente(centro);
            f.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null,"Seleccione una oferta porfavor");
        }
    }//GEN-LAST:event_editOferta2ActionPerformed

    private void btnActualizarOferta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarOferta2ActionPerformed
        // TODO add your handling code here:
         modeloPatentes.getDataVector().removeAllElements();
        
        try {
            Connection con = conexion.getConexion();
            Statement st = con.createStatement();
            String query = "SELECT * FROM Patente " ;  
            ResultSet rr = st.executeQuery(query);
            Object datos[] = new Object[4];
            while(rr.next()){
                for (int i = 0; i < 4; i++){
                    datos[i] = rr.getObject(i + 1);
                }
                modeloPatentes.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActualizarOferta2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        frmInicio f = new frmInicio();
        f.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCentros;
    private javax.swing.JButton btnActualizarInvestigador;
    private javax.swing.JButton btnActualizarOferta;
    private javax.swing.JButton btnActualizarOferta2;
    private javax.swing.JButton btnAddCentro;
    private javax.swing.JButton btnAddInvest;
    private javax.swing.JButton btnAddOferta;
    private javax.swing.JButton btnAddOferta2;
    private javax.swing.JButton editCentros;
    private javax.swing.JButton editInvestigador;
    private javax.swing.JButton editOferta;
    private javax.swing.JButton editOferta2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable tablaOferta;
    // End of variables declaration//GEN-END:variables
}

