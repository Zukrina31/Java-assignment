/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yibei
 */
public class car_info extends javax.swing.JFrame {

    /**
     * Creates new form car_info
     */
    public car_info() {
        initComponents();
        setMinimumSize(new java.awt.Dimension(1366, 796));
        table.setAutoCreateRowSorter(true);
        FileReader file;
        try {
            file = new FileReader("carinfo.txt");
            BufferedReader reader = new BufferedReader(file);
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            Object[] tableLines = reader.lines().toArray();
            for(int i = 0; i<tableLines.length; i++){
                String line = tableLines[i].toString().trim();
                String[] carInfo = line.split(",");
                model.addRow(carInfo);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(car_info.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    String username;
    
    public car_info(String username) {
        initComponents();
        setMinimumSize(new java.awt.Dimension(1366, 796));
        this.username = username;
        table.setAutoCreateRowSorter(true);
        FileReader file;
        try {
            file = new FileReader("carinfo.txt");
            BufferedReader reader = new BufferedReader(file);
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            Object[] tableLines = reader.lines().toArray();
            for(int i = 0; i<tableLines.length; i++){
                String line = tableLines[i].toString().trim();
                String[] carInfo = line.split(",");
                model.addRow(carInfo);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(car_info.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        background = new javax.swing.JLabel();
        logoutBT = new javax.swing.JButton();
        returnBT = new javax.swing.JButton();
        addBT = new javax.swing.JButton();
        editBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        table.setAutoCreateRowSorter(true);
        table.setBackground(new java.awt.Color(129, 163, 163));
        table.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "BRAND", "NAME", "PRICE(RM)", "NUMBER"
            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 200, 1120, 402);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/car_info.png"))); // NOI18N
        background.setText("jLabel1");
        background.setMaximumSize(new java.awt.Dimension(1366, 768));
        background.setMinimumSize(new java.awt.Dimension(1366, 768));
        background.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(background);
        background.setBounds(0, 0, 1360, 770);

        logoutBT.setText("jButton1");
        logoutBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTActionPerformed(evt);
            }
        });
        getContentPane().add(logoutBT);
        logoutBT.setBounds(1210, 30, 130, 60);

        returnBT.setText("jButton1");
        returnBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBTActionPerformed(evt);
            }
        });
        getContentPane().add(returnBT);
        returnBT.setBounds(20, 30, 140, 60);

        addBT.setText("jButton1");
        addBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTActionPerformed(evt);
            }
        });
        getContentPane().add(addBT);
        addBT.setBounds(80, 660, 160, 70);

        editBT.setText("jButton1");
        editBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBTActionPerformed(evt);
            }
        });
        getContentPane().add(editBT);
        editBT.setBounds(280, 650, 170, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBTActionPerformed
        // back to admin menu
        this.setVisible(false);
        new Adminpage(this.username).setVisible(true);
    }//GEN-LAST:event_returnBTActionPerformed

    private void logoutBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTActionPerformed
        // logout to start page
        Startpage startPage = new Startpage();
        this.setVisible(false);
        startPage.setVisible(true);
    }//GEN-LAST:event_logoutBTActionPerformed

    private void addBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTActionPerformed
        // go to add car page
        new add_car(this.username).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addBTActionPerformed

    private void editBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBTActionPerformed
        // GO TO EDIT PAGE
        new edit_car(this.username).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editBTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(car_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(car_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(car_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(car_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new car_info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBT;
    private javax.swing.JLabel background;
    private javax.swing.JButton editBT;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutBT;
    private javax.swing.JButton returnBT;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}