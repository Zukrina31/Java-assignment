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

/**
 *
 * @author yibei
 */
public class edit_admin extends javax.swing.JFrame {

    String username;

    /**
     * Creates new form edit_admin
     */
    public edit_admin() {
        initComponents();
        setMinimumSize(new java.awt.Dimension(1366, 796));
    }

    public edit_admin(String username) {
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

        passwordTF = new javax.swing.JTextField();
        usernameTF = new javax.swing.JTextField();
        background = new javax.swing.JLabel();
        returnTF = new javax.swing.JButton();
        addTF = new javax.swing.JButton();
        logoutTF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        passwordTF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        passwordTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTFActionPerformed(evt);
            }
        });
        getContentPane().add(passwordTF);
        passwordTF.setBounds(360, 330, 310, 60);

        usernameTF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        usernameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTFActionPerformed(evt);
            }
        });
        getContentPane().add(usernameTF);
        usernameTF.setBounds(360, 200, 310, 60);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/edit_admin.png"))); // NOI18N
        background.setText("jLabel2");
        background.setMaximumSize(new java.awt.Dimension(1366, 768));
        background.setMinimumSize(new java.awt.Dimension(1366, 768));
        background.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(background);
        background.setBounds(0, -20, 1380, 800);

        returnTF.setText("jButton1");
        returnTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnTFActionPerformed(evt);
            }
        });
        getContentPane().add(returnTF);
        returnTF.setBounds(10, 10, 170, 90);

        addTF.setText("jButton2");
        addTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTFActionPerformed(evt);
            }
        });
        getContentPane().add(addTF);
        addTF.setBounds(280, 510, 170, 60);

        logoutTF.setText("jButton4");
        getContentPane().add(logoutTF);
        logoutTF.setBounds(1200, 20, 130, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTFActionPerformed

    private void usernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTFActionPerformed

    private void addTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTFActionPerformed
        // add new admin
        String username = usernameTF.getText();
        String password = passwordTF.getText();

        int repeat = 0;
        FileReader file;
        try {
            file = new FileReader("admin.txt");
            BufferedReader reader = new BufferedReader(file);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] info = line.split(",");
                if (username.trim().equals(info[0].trim())) {
                    repeat = 1;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(create_acc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(create_acc.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill up all details");
        } else if (repeat == 1) {
            JOptionPane.showMessageDialog(null, "Username not available");
            usernameTF.setText(null);
        } else {
            try {
                FileWriter writer = new FileWriter("admin.txt", true);
                writer.write(username + "," + password);
                writer.write(System.getProperty("line.separator"));
                writer.close();
                JOptionPane.showMessageDialog(null, "Successful!!!");
                passwordTF.setText(null);
                usernameTF.setText(null);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Please try again.");
                usernameTF.setText(null);
                passwordTF.setText(null);
            }
        }
    }//GEN-LAST:event_addTFActionPerformed

    private void returnTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnTFActionPerformed
        // TODO add your handling code here:
        new admin_profile(this.username).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnTFActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void edit_admin(String username) {
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
            java.util.logging.Logger.getLogger(edit_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edit_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edit_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edit_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edit_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTF;
    private javax.swing.JLabel background;
    private javax.swing.JButton logoutTF;
    private javax.swing.JTextField passwordTF;
    private javax.swing.JButton returnTF;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables

}
