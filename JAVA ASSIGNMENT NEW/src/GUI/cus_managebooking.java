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
public class cus_managebooking extends javax.swing.JFrame {

    /**
     * Creates new form cus_managebooking
     */
    String username;
    String price;
    String carplates;

    public cus_managebooking() {
        initComponents();
        setMinimumSize(new java.awt.Dimension(1366, 796));
        displayTable();
    }

    public cus_managebooking(String username) {
        initComponents();
        setMinimumSize(new java.awt.Dimension(1366, 796));
        this.username = username;
        displayTable();
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
        returnBT = new javax.swing.JButton();
        cancelationBT = new javax.swing.JButton();
        paymentBT = new javax.swing.JButton();
        logoutBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        table.setAutoCreateRowSorter(true);
        table.setBackground(new java.awt.Color(7, 48, 28));
        table.setForeground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CarID", "Brand", "Name", "Location", "Pickup Date", "Pickup Time", "Dropoff Date", "Dropoff Time", "Confirmation Status", "Payment Status", "Car Status", "Car Plate", "Total Price"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 422, 1340, 230);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/cus_managebooking.png"))); // NOI18N
        background.setText("jLabel1");
        background.setMaximumSize(new java.awt.Dimension(1366, 768));
        background.setMinimumSize(new java.awt.Dimension(1366, 768));
        background.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(background);
        background.setBounds(0, -20, 1540, 810);

        returnBT.setText("jButton1");
        returnBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBTActionPerformed(evt);
            }
        });
        getContentPane().add(returnBT);
        returnBT.setBounds(30, 20, 150, 60);

        cancelationBT.setText("jButton1");
        cancelationBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelationBTActionPerformed(evt);
            }
        });
        getContentPane().add(cancelationBT);
        cancelationBT.setBounds(550, 690, 130, 60);

        paymentBT.setText("jButton1");
        paymentBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentBTActionPerformed(evt);
            }
        });
        getContentPane().add(paymentBT);
        paymentBT.setBounds(730, 690, 120, 60);

        logoutBT.setText("jButton1");
        logoutBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTActionPerformed(evt);
            }
        });
        getContentPane().add(logoutBT);
        logoutBT.setBounds(1190, 10, 140, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static void updateFile(DefaultTableModel model) {
        try {
            FileWriter fw = new FileWriter("cusbooking.txt");

            for (int row = 0; row < model.getRowCount(); row++) {
                for (int col = 0; col < model.getColumnCount(); col++) {
                    fw.write(model.getValueAt(row, col) + ",");
                }
                fw.write("\r\n");
            }

            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("File Updated...");
    }

    public void displayTable() {
        try {
            FileReader file;
            file = new FileReader("cusbooking.txt");
            BufferedReader reader = new BufferedReader(file);
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            Object[] tableLines = reader.lines().toArray();
            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] cusBook = line.split(",");
                if (this.username.equals(cusBook[11])) {
                    String bookInfo = cusBook[0] + "," + cusBook[1] + "," + cusBook[2] + "," + cusBook[3] + "," + cusBook[4] + "," + cusBook[4] + ","
                            + cusBook[6] + "," + cusBook[7] + "," + cusBook[8] + "," + cusBook[9] + "," + cusBook[10] + "," + cusBook[12] + "," + cusBook[14];
                    String[] magBook = bookInfo.split(",");
                    model.addRow(magBook);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(car_status.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void logoutBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTActionPerformed
        // TODO add your handling code here:
        Startpage startPage = new Startpage();
        startPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutBTActionPerformed

    private void returnBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBTActionPerformed
        // TODO add your handling code here:
        new Customerpage(this.username).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnBTActionPerformed

    private void cancelationBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelationBTActionPerformed
        // TODO add your handling code here:
        if (table.getSelectedRowCount() == 1) {
            int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                String ans = JOptionPane.showInputDialog("Please enter your password");
                try {
                    String line;
                    FileReader file = new FileReader("customerinfo.txt");
                    BufferedReader reader = new BufferedReader(file);
                    int flag = 1;
                    while ((line = reader.readLine()) != null) {
                        String[] info = line.split(",");
                        if (info[2].trim().equals(this.username) && info[5].trim().equals(ans)) {
                            flag = 0;
                            DefaultTableModel model = (DefaultTableModel) table.getModel();
                            if (table.getSelectedRowCount() == 1) {
                                model.removeRow(table.getSelectedRow());
                                updateFile(model);
                            }
                        }
                    }
                    if (flag == 1) {
                        JOptionPane.showMessageDialog(null, "Wrong password, please try again");
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(cus_managebooking.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(cus_managebooking.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else
            JOptionPane.showMessageDialog(null, "Please select a row");
    }//GEN-LAST:event_cancelationBTActionPerformed

    private void paymentBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentBTActionPerformed
        // TODO add your handling code here:
        String line;
        int flag = 1;
        int row = table.getSelectedRow();
        if (table.getSelectedRowCount() == 1) {
            if (table.getValueAt(row, 8).toString().equals("accept") && table.getValueAt(row, 9).toString().equals("nopayment")) {
                flag = 0;
                new cus_payment(this.username, this.price, this.carplates).setVisible(true);
                this.setVisible(false);
                
            } else {
                flag = 0;
                JOptionPane.showMessageDialog(null, "Please select a row");
            }
            if (flag == 1) {
                JOptionPane.showMessageDialog(null, "Please wait for confirmation or you have ald paid");

            }
        }
    }//GEN-LAST:event_paymentBTActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int row = table.getSelectedRow();
        String totalprice = table.getValueAt(row, 12).toString();
        this.price = totalprice;
        String cPlates = table.getValueAt(row, 11).toString();
        this.carplates = cPlates;
    }//GEN-LAST:event_tableMouseClicked

    /**
     * @param args the command line arguments
     */
    /**
     * @param args the command line arguments
     */
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(cus_managebooking.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cus_managebooking.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cus_managebooking.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cus_managebooking.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cus_managebooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton cancelationBT;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutBT;
    private javax.swing.JButton paymentBT;
    private javax.swing.JButton returnBT;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}