/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paulmuller.proymaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LABH39
 */
public class frmConexion extends javax.swing.JFrame {

    private static Connection con;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="";
    private static final String url="jdbc:mysql://localhost:3306/BDMVC?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    public frmConexion() {
        initComponents();
    }

    public void conector(){
        con=null;
        try{
            Class.forName(driver);
            con=(Connection) DriverManager.getConnection(url,user,pass);
            if(con!=null){
                lblMensaje.setText("Conexion Establecida");
            }
        }catch(ClassNotFoundException |SQLException e){
            lblMensaje.setText("Error de Conexion "+e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConectar = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        lblMensaje.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConectar)
                .addGap(32, 32, 32)
                .addComponent(lblMensaje)
                .addContainerGap(247, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConectar)
                    .addComponent(lblMensaje))
                .addContainerGap(266, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        conector();
    }//GEN-LAST:event_btnConectarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmConexion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectar;
    private javax.swing.JLabel lblMensaje;
    // End of variables declaration//GEN-END:variables
}
