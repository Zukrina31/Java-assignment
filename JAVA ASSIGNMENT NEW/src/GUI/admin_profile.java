/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;




/**
 *
 * @author yibei
 */
public class admin_profile extends javax.swing.JFrame {
    /**
     * Creates new form admin_profile
     */
    String username;
    
    public admin_profile(){
        initComponents();
        setMinimumSize(new java.awt.Dimension(1366, 796));
    }
    
    public admin_profile(String username){
        initComponents();
        setMinimumSize(new java.awt.Dimension(1366, 796));
        this.username = username;
        usernameJL.setText(username);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameJL = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        logoutBT = new javax.swing.JButton();
        chgpassBT = new javax.swing.JButton();
        returnBT = new javax.swing.JButton();
        addadminBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        usernameJL.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        usernameJL.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(usernameJL);
        usernameJL.setBounds(310, 470, 300, 50);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/admin_profile.png"))); // NOI18N
        background.setText("jLabel1");
        background.setMaximumSize(new java.awt.Dimension(1366, 768));
        background.setMinimumSize(new java.awt.Dimension(1366, 768));
        background.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(background);
        background.setBounds(0, -20, 1366, 810);

        logoutBT.setText("jButton1");
        logoutBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTActionPerformed(evt);
            }
        });
        getContentPane().add(logoutBT);
        logoutBT.setBounds(1190, 20, 150, 70);

        chgpassBT.setText("jButton1");
        chgpassBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chgpassBTActionPerformed(evt);
            }
        });
        getContentPane().add(chgpassBT);
        chgpassBT.setBounds(250, 600, 260, 80);

        returnBT.setText("jButton1");
        returnBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBTActionPerformed(evt);
            }
        });
        getContentPane().add(returnBT);
        returnBT.setBounds(20, 20, 140, 70);

        addadminBT.setText("jButton1");
        addadminBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addadminBTActionPerformed(evt);
            }
        });
        getContentPane().add(addadminBT);
        addadminBT.setBounds(1160, 680, 170, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBTActionPerformed
        // return back to Admin Menu
        Adminpage menuAdmin = new Adminpage();
        menuAdmin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnBTActionPerformed

    private void logoutBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTActionPerformed
        // logout back to start page
        Startpage startPage = new Startpage();
        startPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutBTActionPerformed

    private void addadminBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addadminBTActionPerformed
        // add more admin
        new edit_admin(this.username).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addadminBTActionPerformed

    private void chgpassBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chgpassBTActionPerformed
        // TODO add your handling code here:
        new admin_password(this.username).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_chgpassBTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void admin_profile(String username) {
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
            java.util.logging.Logger.getLogger(admin_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addadminBT;
    private javax.swing.JLabel background;
    private javax.swing.JButton chgpassBT;
    private javax.swing.JButton logoutBT;
    private javax.swing.JButton returnBT;
    private javax.swing.JLabel usernameJL;
    // End of variables declaration//GEN-END:variables
}
