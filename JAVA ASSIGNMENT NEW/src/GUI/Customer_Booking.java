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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yibei
 */
public class Customer_Booking extends javax.swing.JFrame {

    /**
     * Creates new form Customer_Booking
     */
    String username;

    public Customer_Booking() {
        initComponents();
        setMinimumSize(new java.awt.Dimension(1366, 796));
        table.setAutoCreateRowSorter(true);
        FileReader file;
        try {
            file = new FileReader("carinfo.txt");
            BufferedReader reader = new BufferedReader(file);
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] tableLines = reader.lines().toArray();
            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] carInfo = line.split(",");
                model.addRow(carInfo);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(car_info.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Customer_Booking(String username) {
        initComponents();
        setMinimumSize(new java.awt.Dimension(1366, 796));
        this.username = username;
        table.setAutoCreateRowSorter(true);
        FileReader file;
        try {
            file = new FileReader("carinfo.txt");
            BufferedReader reader = new BufferedReader(file);
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] tableLines = reader.lines().toArray();
            for (int i = 0; i < tableLines.length; i++) {
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
        locationTF = new javax.swing.JTextField();
        pdateTF = new javax.swing.JTextField();
        time1TF = new javax.swing.JTextField();
        ddateTF = new javax.swing.JTextField();
        time2TF = new javax.swing.JTextField();
        background = new javax.swing.JLabel();
        logoutBT = new javax.swing.JButton();
        bookBT = new javax.swing.JButton();
        returnBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        table.setBackground(new java.awt.Color(255, 204, 102));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CAR ID", "BRAND", "NAME", "PRICE (RM)"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 330, 1240, 402);

        locationTF.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        locationTF.setBorder(null);
        locationTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationTFActionPerformed(evt);
            }
        });
        getContentPane().add(locationTF);
        locationTF.setBounds(140, 200, 220, 60);

        pdateTF.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        pdateTF.setBorder(null);
        getContentPane().add(pdateTF);
        pdateTF.setBounds(420, 200, 130, 70);

        time1TF.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        time1TF.setBorder(null);
        time1TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time1TFActionPerformed(evt);
            }
        });
        getContentPane().add(time1TF);
        time1TF.setBounds(600, 200, 90, 50);

        ddateTF.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        ddateTF.setBorder(null);
        getContentPane().add(ddateTF);
        ddateTF.setBounds(740, 200, 130, 70);

        time2TF.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        time2TF.setBorder(null);
        getContentPane().add(time2TF);
        time2TF.setBounds(920, 200, 90, 50);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/booking_car.png"))); // NOI18N
        background.setText("jLabel1");
        background.setMaximumSize(new java.awt.Dimension(1366, 768));
        background.setMinimumSize(new java.awt.Dimension(1366, 768));
        background.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(background);
        background.setBounds(0, -10, 1370, 800);

        logoutBT.setText("jButton1");
        logoutBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTActionPerformed(evt);
            }
        });
        getContentPane().add(logoutBT);
        logoutBT.setBounds(1200, 20, 130, 60);

        bookBT.setText("jButton1");
        bookBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBTActionPerformed(evt);
            }
        });
        getContentPane().add(bookBT);
        bookBT.setBounds(1050, 160, 270, 120);

        returnBT.setText("jButton1");
        returnBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBTActionPerformed(evt);
            }
        });
        getContentPane().add(returnBT);
        returnBT.setBounds(20, 20, 150, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void time1TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time1TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_time1TFActionPerformed

    private void locationTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationTFActionPerformed

    private void logoutBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTActionPerformed
        // TODO add your handling code here:
        Startpage startPage = new Startpage();
        startPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutBTActionPerformed


    private void bookBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBTActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int row = table.getSelectedRow();
        String carID = model.getValueAt(row, 0).toString();
        String carBrand = model.getValueAt(row, 1).toString();
        String carName = model.getValueAt(row, 2).toString();
        String location = locationTF.getText();
        String puDate = pdateTF.getText();
        String puTime = time1TF.getText();
        String doDate = ddateTF.getText();
        String doTime = time2TF.getText();
        if (location.isEmpty() || puDate.isEmpty() || puTime.isEmpty() || doDate.isEmpty() || doTime.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill up all the details");
        }else {
            try {
                FileWriter writer = new FileWriter("cusbooking.txt", true);
                writer.write(carID + "," + carBrand + "," + carName + "," + location + "," + puDate + "," + puTime + "," + doDate + "," + doTime + "," + "waiting" + "," + "nopayment" + "," + "nopickup" + this.username);
                writer.write(System.getProperty("line.separator"));
                writer.close();
                JOptionPane.showMessageDialog(null, "Successful and please wait for confirmation~");
            } catch (IOException ex) {
                Logger.getLogger(add_car.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Failed, Please try again.");
            }
        }

    }//GEN-LAST:event_bookBTActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMouseClicked

    private void returnBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBTActionPerformed
        // TODO add your handling code here:
        new Customerpage(this.username).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnBTActionPerformed

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
            java.util.logging.Logger.getLogger(Customer_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton bookBT;
    private javax.swing.JTextField ddateTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField locationTF;
    private javax.swing.JButton logoutBT;
    private javax.swing.JTextField pdateTF;
    private javax.swing.JButton returnBT;
    private javax.swing.JTable table;
    private javax.swing.JTextField time1TF;
    private javax.swing.JTextField time2TF;
    // End of variables declaration//GEN-END:variables
}
