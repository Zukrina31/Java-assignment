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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yibei
 */
public class confirm_booking extends javax.swing.JFrame {

    /**
     * Creates new form confirm_booking
     */
    String username;
    String cususername;
    String cuscarid;
    String cuslocation;
    
    public confirm_booking() {
        initComponents();
        setMinimumSize(new java.awt.Dimension(1366, 796));
        table.setAutoCreateRowSorter(true);
        displayTable();
    }
    
    public confirm_booking(String username) {
        initComponents();
        setMinimumSize(new java.awt.Dimension(1366, 796));
        table.setAutoCreateRowSorter(true);
        this.username = username;
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
                String[] carInfo = line.split(",");
                String cusbooking = carInfo[11] + "," + carInfo[0] + "," + carInfo[1] + "," + carInfo[2] + "," + carInfo[3] + "," + 
                        carInfo[4] + "," + carInfo[5] + "," + carInfo[6] + "," + carInfo[7] + "," + carInfo[8];
                String[] bookInfo = cusbooking.split(",");
                model.addRow(bookInfo);
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
        returnBT = new javax.swing.JButton();
        logoutBT = new javax.swing.JButton();
        acceptBT = new javax.swing.JButton();
        declineBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "CarID", "Brand", "Name", "Location", "Pickup Date", "Pickup Time", "Dropoff Date", "Dropoff Time", "Status"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 180, 1330, 420);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/confirm_booking.png"))); // NOI18N
        background.setText("jLabel1");
        background.setMaximumSize(new java.awt.Dimension(1366, 768));
        background.setMinimumSize(new java.awt.Dimension(1366, 768));
        background.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(background);
        background.setBounds(0, 0, 1670, 770);

        returnBT.setText("jButton1");
        returnBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBTActionPerformed(evt);
            }
        });
        getContentPane().add(returnBT);
        returnBT.setBounds(20, 20, 150, 70);

        logoutBT.setText("jButton1");
        logoutBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTActionPerformed(evt);
            }
        });
        getContentPane().add(logoutBT);
        logoutBT.setBounds(1200, 20, 130, 70);

        acceptBT.setText("jButton1");
        acceptBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBTActionPerformed(evt);
            }
        });
        getContentPane().add(acceptBT);
        acceptBT.setBounds(490, 670, 170, 70);

        declineBT.setText("jButton1");
        declineBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineBTActionPerformed(evt);
            }
        });
        getContentPane().add(declineBT);
        declineBT.setBounds(700, 670, 180, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBTActionPerformed
        // TODO add your handling code here:
        new Adminpage(this.username).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnBTActionPerformed

    private void logoutBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTActionPerformed
        // TODO add your handling code here:
        Startpage startPage = new Startpage();
        startPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutBTActionPerformed

    private void acceptBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBTActionPerformed
        // TODO add your handling code here:
        String ans;
        ans = JOptionPane.showInputDialog("Enter car plate:");
        if(ans.isEmpty()) 
            JOptionPane.showMessageDialog(null, "Please fill in the car plate");
        String carPlate = ans;
        ArrayList<String> tempArray = new ArrayList<>();
        FileReader fr;
        try {
            fr = new FileReader("cusbooking.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            String[] info;
            while((line = br.readLine())!= null) {
               info = line.split(",");
               if(info[11].equals(this.cususername) & info[0].equals(this.cuscarid) & info[3].equals(this.cuslocation)) {
                   tempArray.add(info[0] + "," + info[1] + "," + info[2] + "," + info[3] + "," + info[4] + "," + info[5] + "," + 
                           info[6] + "," + info[7] + "," + "accept" + "," + info[9] + "," + info[10] + "," + info[11] + "," +carPlate +"," +info[13] + ","+info[14]);
               }else{
                   tempArray.add(line);
               }
            }
            fr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(admin_password.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(admin_password.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //write the data in temp array(edited data) into file
        try(PrintWriter pr = new PrintWriter("cusbooking.txt")) {
            for (String str : tempArray) {
                pr.println(str);
            }
            pr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(admin_password.class.getName()).log(Level.SEVERE, null, ex);
        }
        displayTable();
    }//GEN-LAST:event_acceptBTActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int row = table.getSelectedRow();
        String cusname = model.getValueAt(row, 0).toString();
        String cuscarID = model.getValueAt(row, 1).toString();
        String cusloc = model.getValueAt(row, 4).toString();
        this.cususername = cusname;
        this.cuscarid = cuscarID;
        this.cuslocation = cusloc;
    }//GEN-LAST:event_tableMouseClicked

    private void declineBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineBTActionPerformed
        // TODO add your handling code here:
        ArrayList<String> tempArray = new ArrayList<>();
        FileReader fr;
        try {
            fr = new FileReader("cusbooking.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            String[] info;
            while((line = br.readLine())!= null) {
               info = line.split(",");
               if(info[11].equals(this.cususername) & info[0].equals(this.cuscarid) & info[3].equals(this.cuslocation)) {
                   tempArray.add(info[0] + "," + info[1] + "," + info[2] + "," + info[3] + "," + info[4] + "," + info[5] + "," + 
                           info[6] + "," + info[7] + "," + "decline" + "," + info[9] + "," + info[10] + "," + info[11] + "," + "" +"," +info[13] + ","+info[14]);
               }else{
                   tempArray.add(line);
               }
            }
            fr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(admin_password.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(admin_password.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //write the data in temp array(edited data) into file
        try(PrintWriter pr = new PrintWriter("cusbooking.txt")) {
            for (String str : tempArray) {
                pr.println(str);
            }
            pr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(admin_password.class.getName()).log(Level.SEVERE, null, ex);
        }
        displayTable();
    }//GEN-LAST:event_declineBTActionPerformed

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
            java.util.logging.Logger.getLogger(confirm_booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(confirm_booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(confirm_booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(confirm_booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new confirm_booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptBT;
    private javax.swing.JLabel background;
    private javax.swing.JButton declineBT;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutBT;
    private javax.swing.JButton returnBT;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
