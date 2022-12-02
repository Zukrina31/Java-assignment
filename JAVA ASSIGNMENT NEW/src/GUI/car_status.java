/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yibei
 */
public class car_status extends javax.swing.JFrame {

    /**
     * Creates new form car_status
     */
    String username;
    String cusUsername;
    String carPlate;

    public car_status() {
        initComponents();
        setMinimumSize(new java.awt.Dimension(1366, 796));
        table.setAutoCreateRowSorter(true);
        displayTable();
    }

    public car_status(String username) {
        initComponents();
        setMinimumSize(new java.awt.Dimension(1366, 796));
        this.username = username;
        table.setAutoCreateRowSorter(true);
        displayTable();
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
                if (!(cusBook[9].equals("nopayment"))) {
                    String bookInfo = cusBook[11] + "," + cusBook[0] + "," + cusBook[1] + "," + cusBook[2] + "," + cusBook[3] + "," + cusBook[4]
                            + "," + cusBook[5] + "," + cusBook[6] + "," + cusBook[7] + "," + cusBook[10] + "," + cusBook[12];
                    String[] carStatus = bookInfo.split(",");
                    model.addRow(carStatus);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(car_status.class.getName()).log(Level.SEVERE, null, ex);
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
        usernameTF = new javax.swing.JTextField();
        dateTF = new javax.swing.JTextField();
        background = new javax.swing.JLabel();
        returnBT = new javax.swing.JButton();
        searchBT = new javax.swing.JButton();
        pickupBT = new javax.swing.JButton();
        returnedBT = new javax.swing.JButton();
        nopickupBT = new javax.swing.JButton();
        logoutBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "CarID", "Brand", "Name", "Location", "Pickup Date", "Pickup Time", "Dropoff Date", "Dropoff Time", "Car Status", "Car Plate"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 422, 1130, 330);

        usernameTF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        usernameTF.setBorder(null);
        getContentPane().add(usernameTF);
        usernameTF.setBounds(190, 180, 320, 40);

        dateTF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        dateTF.setBorder(null);
        getContentPane().add(dateTF);
        dateTF.setBounds(190, 280, 320, 40);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/car_status.png"))); // NOI18N
        background.setText("jLabel1");
        background.setMaximumSize(new java.awt.Dimension(1366, 768));
        background.setMinimumSize(new java.awt.Dimension(1366, 768));
        background.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(background);
        background.setBounds(0, -30, 1366, 820);

        returnBT.setText("jButton1");
        returnBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBTActionPerformed(evt);
            }
        });
        getContentPane().add(returnBT);
        returnBT.setBounds(20, 20, 130, 60);

        searchBT.setText("jButton1");
        searchBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTActionPerformed(evt);
            }
        });
        getContentPane().add(searchBT);
        searchBT.setBounds(280, 350, 130, 50);

        pickupBT.setText("jButton1");
        pickupBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickupBTActionPerformed(evt);
            }
        });
        getContentPane().add(pickupBT);
        pickupBT.setBounds(1200, 450, 130, 50);

        returnedBT.setText("jButton1");
        returnedBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnedBTActionPerformed(evt);
            }
        });
        getContentPane().add(returnedBT);
        returnedBT.setBounds(1200, 560, 130, 50);

        nopickupBT.setText("jButton1");
        nopickupBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nopickupBTActionPerformed(evt);
            }
        });
        getContentPane().add(nopickupBT);
        nopickupBT.setBounds(1200, 660, 130, 60);

        logoutBT.setText("jButton1");
        logoutBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTActionPerformed(evt);
            }
        });
        getContentPane().add(logoutBT);
        logoutBT.setBounds(1190, 10, 150, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTActionPerformed
        // TODO add your handling code here:
        new Startpage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutBTActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int row = table.getSelectedRow();
        this.cusUsername = model.getValueAt(row, 0).toString();
        this.carPlate = model.getValueAt(row, 10).toString();
    }//GEN-LAST:event_tableMouseClicked

    private void pickupBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickupBTActionPerformed
        // TODO add your handling code here:
        ArrayList<String> tempArray = new ArrayList<>();
        FileReader file;
        try {
            file = new FileReader("cusbooking.txt");
            BufferedReader reader = new BufferedReader(file);
            String line;
            String[] info;
            while ((line = reader.readLine()) != null) {
                info = line.split(",");
                if (info[11].equals(this.cusUsername) & info[12].equals(this.carPlate)) {
                    tempArray.add(info[0] + "," + info[1] + "," + info[2] + "," + info[3] + "," + info[4] + "," + info[5] + "," + info[6]
                            + "," + info[7] + "," + info[8] + "," + info[9] + "," + "pickup" + "," + info[11] + "," + info[12] + "," + info[13] +
                            "," + info[14] + "," + info[15]);
                } else {
                    tempArray.add(line);
                }
            }
            file.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(car_status.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(car_status.class.getName()).log(Level.SEVERE, null, ex);
        }
        try ( PrintWriter pr = new PrintWriter("cusbooking.txt")) {
            for (String str : tempArray) {
                pr.println(str);
            }
            pr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(car_status.class.getName()).log(Level.SEVERE, null, ex);
        }
        displayTable();
    }//GEN-LAST:event_pickupBTActionPerformed

    private void returnedBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnedBTActionPerformed
        // TODO add your handling code here:
        ArrayList<String> tempArray = new ArrayList<>();
        FileReader file;
        try {
            file = new FileReader("cusbooking.txt");
            BufferedReader reader = new BufferedReader(file);
            String line;
            String[] info;
            while ((line = reader.readLine()) != null) {
                info = line.split(",");
                if (info[11].equals(this.cusUsername) & info[12].equals(this.carPlate)) {
                    tempArray.add(info[0] + "," + info[1] + "," + info[2] + "," + info[3] + "," + info[4] + "," + info[5] + "," + info[6]
                            + "," + info[7] + "," + info[8] + "," + info[9] + "," + "returned" + "," + info[11] + "," + info[12] + "," + info[13] +
                            "," + info[14] + "," + info[15]);
                } else {
                    tempArray.add(line);
                }
            }
            file.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(car_status.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(car_status.class.getName()).log(Level.SEVERE, null, ex);
        }
        try ( PrintWriter pr = new PrintWriter("cusbooking.txt")) {
            for (String str : tempArray) {
                pr.println(str);
            }
            pr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(car_status.class.getName()).log(Level.SEVERE, null, ex);
        }
        displayTable();
    }//GEN-LAST:event_returnedBTActionPerformed

    private void nopickupBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nopickupBTActionPerformed
        // TODO add your handling code here:
        ArrayList<String> tempArray = new ArrayList<>();
        FileReader file;
        try {
            file = new FileReader("cusbooking.txt");
            BufferedReader reader = new BufferedReader(file);
            String line;
            String[] info;
            while ((line = reader.readLine()) != null) {
                info = line.split(",");
                if (info[11].equals(this.cusUsername) & info[12].equals(this.carPlate)) {
                    tempArray.add(info[0] + "," + info[1] + "," + info[2] + "," + info[3] + "," + info[4] + "," + info[5] + "," + info[6]
                            + "," + info[7] + "," + info[8] + "," + info[9] + "," + "nopickup" + "," + info[11] + "," + info[12] + "," + info[13] +
                            "," + info[14] + "," + info[15]);
                } else {
                    tempArray.add(line);
                }
            }
            file.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(car_status.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(car_status.class.getName()).log(Level.SEVERE, null, ex);
        }
        try ( PrintWriter pr = new PrintWriter("cusbooking.txt")) {
            for (String str : tempArray) {
                pr.println(str);
            }
            pr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(car_status.class.getName()).log(Level.SEVERE, null, ex);
        }
        displayTable();
    }//GEN-LAST:event_nopickupBTActionPerformed

    private void returnBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBTActionPerformed
        // TODO add your handling code here:
        new Adminpage(this.username).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnBTActionPerformed

    private void searchBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTActionPerformed
        // TODO add your handling code here:
        String name = usernameTF.getText();
        String date = dateTF.getText();
        FileReader file;
        try {
            file = new FileReader("cusbooking.txt");
            BufferedReader br = new BufferedReader(file);
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            Object[] tableLines = br.lines().toArray();
            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] cusBook = line.split(",");
                if (!(cusBook[9].equals("nopayment"))) {
                    if (cusBook[11].equals(name) | cusBook[4].equals(date)) {
                        String bookInfo = cusBook[11] + "," + cusBook[0] + "," + cusBook[1] + "," + cusBook[2] + "," + cusBook[3] + "," + cusBook[4]
                                + "," + cusBook[5] + "," + cusBook[6] + "," + cusBook[7] + "," + cusBook[10] + "," + cusBook[12];
                        String[] carStatus = bookInfo.split(",");
                        model.addRow(carStatus);
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(car_status.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_searchBTActionPerformed

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
            java.util.logging.Logger.getLogger(car_status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(car_status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(car_status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(car_status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new car_status().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JTextField dateTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutBT;
    private javax.swing.JButton nopickupBT;
    private javax.swing.JButton pickupBT;
    private javax.swing.JButton returnBT;
    private javax.swing.JButton returnedBT;
    private javax.swing.JButton searchBT;
    private javax.swing.JTable table;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
