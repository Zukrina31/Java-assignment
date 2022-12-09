/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import static GUI.Files.readBooking;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author yibei
 */
public class Customerpage extends javax.swing.JFrame {

    /**
     * Creates new form Customerpage
     */
    String username;
    
    public Customerpage() {
        initComponents();
        setMinimumSize(new java.awt.Dimension(1366, 796));
    }

    public Customerpage(String username) throws IOException {
        initComponents();
        setMinimumSize(new java.awt.Dimension(1366, 796));
        this.username = username;
        int flag=1;
        ArrayList<Booking> list = readBooking();
        for(Booking b : list) {
            if(b.getUsername().equals(this.username) & !(b.getAdminStatus().equals("waiting")) & b.getCusConfirmation().equals("noconfirmation")) 
                flag =0;
        }
        if(flag==1) {
            jLabel1.setVisible(false);
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

        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        mailBT = new javax.swing.JButton();
        makebookingBT = new javax.swing.JButton();
        managebookingBT = new javax.swing.JButton();
        manageaccountBT = new javax.swing.JButton();
        logoutBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1338, 768));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Goudy Stout", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("!!");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 110, 180, 270);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/customerpage.png"))); // NOI18N
        background.setText("jLabel1");
        background.setMaximumSize(new java.awt.Dimension(1338, 768));
        background.setMinimumSize(new java.awt.Dimension(1338, 768));
        background.setPreferredSize(new java.awt.Dimension(1338, 768));
        getContentPane().add(background);
        background.setBounds(0, 0, 1370, 770);

        mailBT.setText("jButton1");
        mailBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailBTActionPerformed(evt);
            }
        });
        getContentPane().add(mailBT);
        mailBT.setBounds(20, 240, 130, 100);

        makebookingBT.setText("jButton1");
        makebookingBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makebookingBTActionPerformed(evt);
            }
        });
        getContentPane().add(makebookingBT);
        makebookingBT.setBounds(100, 610, 230, 110);

        managebookingBT.setText("jButton1");
        managebookingBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managebookingBTActionPerformed(evt);
            }
        });
        getContentPane().add(managebookingBT);
        managebookingBT.setBounds(570, 620, 230, 100);

        manageaccountBT.setText("jButton1");
        manageaccountBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageaccountBTActionPerformed(evt);
            }
        });
        getContentPane().add(manageaccountBT);
        manageaccountBT.setBounds(1050, 610, 240, 110);

        logoutBT.setText("jButton1");
        logoutBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTActionPerformed(evt);
            }
        });
        getContentPane().add(logoutBT);
        logoutBT.setBounds(1190, 20, 140, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTActionPerformed
        // TODO add your handling code here:
        new Startpage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutBTActionPerformed

    private void managebookingBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managebookingBTActionPerformed
        try {
            // TODO add your handling code here:
            new cus_managebooking(this.username).setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(Customerpage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_managebookingBTActionPerformed

    private void makebookingBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makebookingBTActionPerformed
        // TODO add your handling code here:
        int flag = 1;
        try {
        ArrayList<Booking> list = readBooking();
        for(Booking b : list) {
            if(this.username.equals(b.getUsername()) && b.getPaymentStatus().equals("nopayment")) {
                JOptionPane.showMessageDialog(null, "Please make payment first :)");
                flag = 0;
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Customerpage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Customerpage.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (flag == 1) {
            new Customer_Booking(this.username).setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_makebookingBTActionPerformed

    private void manageaccountBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageaccountBTActionPerformed
        // TODO add your handling code here:
        new cus_profile(this.username).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_manageaccountBTActionPerformed

    private void mailBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailBTActionPerformed
        // TODO add your handling code here:
        new cus_mail(this.username).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mailBTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void Customerpage(String username) {
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
            java.util.logging.Logger.getLogger(Customerpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customerpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customerpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customerpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customerpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutBT;
    private javax.swing.JButton mailBT;
    private javax.swing.JButton makebookingBT;
    private javax.swing.JButton manageaccountBT;
    private javax.swing.JButton managebookingBT;
    // End of variables declaration//GEN-END:variables
}
