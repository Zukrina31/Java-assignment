/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import static GUI.Files.editBooking;
import static GUI.Files.readCustomer;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author yibei
 */
public class cus_password extends javax.swing.JFrame {

    String username;

    /**
     * Creates new form cus_password
     */
    public cus_password() {
        initComponents();
        setMinimumSize(new java.awt.Dimension(1366, 796));
    }

    public cus_password(String username) {
        initComponents();
        setMinimumSize(new java.awt.Dimension(1366, 796));
        this.username = username;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newpassword = new javax.swing.JPasswordField();
        oldpassword = new javax.swing.JPasswordField();
        background = new javax.swing.JLabel();
        returnBT = new javax.swing.JButton();
        changeBT = new javax.swing.JButton();
        logoutBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        newpassword.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        newpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(newpassword);
        newpassword.setBounds(430, 420, 310, 60);

        oldpassword.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(oldpassword);
        oldpassword.setBounds(430, 310, 310, 60);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/cus_password.png"))); // NOI18N
        background.setText("jLabel1");
        background.setMaximumSize(new java.awt.Dimension(1338, 768));
        background.setMinimumSize(new java.awt.Dimension(1338, 768));
        background.setPreferredSize(new java.awt.Dimension(1338, 768));
        getContentPane().add(background);
        background.setBounds(0, -30, 1370, 830);

        returnBT.setText("jButton1");
        returnBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBTActionPerformed(evt);
            }
        });
        getContentPane().add(returnBT);
        returnBT.setBounds(40, 20, 150, 70);

        changeBT.setText("jButton1");
        changeBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeBTActionPerformed(evt);
            }
        });
        getContentPane().add(changeBT);
        changeBT.setBounds(350, 650, 130, 60);

        logoutBT.setText("jButton1");
        logoutBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTActionPerformed(evt);
            }
        });
        getContentPane().add(logoutBT);
        logoutBT.setBounds(1190, 20, 140, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTActionPerformed
        // TODO add your handling code here:
        new Startpage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutBTActionPerformed

    private void newpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newpasswordActionPerformed

    private void returnBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBTActionPerformed
        // TODO add your handling code here:
        new cus_profile(this.username).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnBTActionPerformed

    private void changeBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeBTActionPerformed
        try {
            // TODO add your handling code here:
            String oldPass = oldpassword.getText();
            String newPass = newpassword.getText();
            FileReader file;
            int flag = 1;
            ArrayList<String> tempArray = new ArrayList<>();
            ArrayList<Customer> list = readCustomer();
            for (Customer c : list) {
                if (c.getUsername().equals(this.username)) {
                    if (c.getPassword().equals(oldPass)) {
                        c.setPassword(newPass);
                        tempArray.add(c.toString());
                        flag = 0;
                    } else {
                        tempArray.add(c.toString());
                    }
                } else {
                    tempArray.add(c.toString());
                }
            }
            if (flag == 1) {
                JOptionPane.showMessageDialog(null, "Wrong Password");
                oldpassword.setText(null);
                newpassword.setText(null);
            } else {
                editBooking(tempArray, "customerinfo.txt");
                JOptionPane.showMessageDialog(null, "Password Changed");
                oldpassword.setText(null);
                newpassword.setText(null);
                new cus_profile(this.username).setVisible(true);
                this.setVisible(false);
            }
        } catch (IOException ex) {
            Logger.getLogger(cus_password.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_changeBTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void cus_password(String username) {
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
            java.util.logging.Logger.getLogger(cus_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cus_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cus_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cus_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cus_password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton changeBT;
    private javax.swing.JButton logoutBT;
    private javax.swing.JPasswordField newpassword;
    private javax.swing.JPasswordField oldpassword;
    private javax.swing.JButton returnBT;
    // End of variables declaration//GEN-END:variables
}
