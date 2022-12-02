/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author Zukrina31
 */
public class Adminpage extends javax.swing.JFrame {
    String username; 


    /**
     * Creates new form Adminpage
     */
    public Adminpage() {
        initComponents();
        //So that the window size is consistent throughout
        setMinimumSize(new java.awt.Dimension(1366, 796));
    }
    
        public Adminpage(String userName) {
        initComponents();
        //So that the window size is consistent throughout
        setMinimumSize(new java.awt.Dimension(1366, 796));
        this.username = userName;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        Collect_payment = new javax.swing.JButton();
        Generate_report = new javax.swing.JButton();
        Confirm_booking = new javax.swing.JButton();
        View_cus_info = new javax.swing.JButton();
        View_car_info = new javax.swing.JButton();
        View_admin_info = new javax.swing.JButton();
        car_status = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/ADMIN_MENU.png"))); // NOI18N
        background.setText("jLabel1");
        background.setMaximumSize(new java.awt.Dimension(1366, 768));
        background.setMinimumSize(new java.awt.Dimension(1366, 768));
        background.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(background);
        background.setBounds(0, -30, 1370, 840);

        Logout.setText("jButton1");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        getContentPane().add(Logout);
        Logout.setBounds(1189, 4, 160, 80);

        Collect_payment.setText("jButton2");
        Collect_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Collect_paymentActionPerformed(evt);
            }
        });
        getContentPane().add(Collect_payment);
        Collect_payment.setBounds(910, 160, 340, 160);

        Generate_report.setText("jButton3");
        Generate_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Generate_reportActionPerformed(evt);
            }
        });
        getContentPane().add(Generate_report);
        Generate_report.setBounds(910, 380, 350, 180);

        Confirm_booking.setText("jButton5");
        Confirm_booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirm_bookingActionPerformed(evt);
            }
        });
        getContentPane().add(Confirm_booking);
        Confirm_booking.setBounds(320, 600, 340, 160);

        View_cus_info.setText("jButton6");
        View_cus_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_cus_infoActionPerformed(evt);
            }
        });
        getContentPane().add(View_cus_info);
        View_cus_info.setBounds(110, 380, 340, 170);

        View_car_info.setText("jButton7");
        View_car_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_car_infoActionPerformed(evt);
            }
        });
        getContentPane().add(View_car_info);
        View_car_info.setBounds(110, 150, 340, 170);

        View_admin_info.setText("jButton8");
        View_admin_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_admin_infoActionPerformed(evt);
            }
        });
        getContentPane().add(View_admin_info);
        View_admin_info.setBounds(10, 0, 190, 80);

        car_status.setText("jButton1");
        car_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                car_statusActionPerformed(evt);
            }
        });
        getContentPane().add(car_status);
        car_status.setBounds(700, 590, 310, 170);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        //Closes this page and goes back to the login page
        this.setVisible(false);
        Startpage startPage = new Startpage();
        startPage.setVisible(true);
    }//GEN-LAST:event_LogoutActionPerformed

    private void View_admin_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_admin_infoActionPerformed
        // view admin profile
 
        this.setVisible(false);
        new admin_profile(this.username).setVisible(true);
    }//GEN-LAST:event_View_admin_infoActionPerformed

    private void View_car_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_car_infoActionPerformed
        // view car information
        this.setVisible(false);
        new car_info(this.username).setVisible(true);
    }//GEN-LAST:event_View_car_infoActionPerformed

    private void View_cus_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_cus_infoActionPerformed
        // TODO add your handling code here:
        new view_customer(this.username).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_View_cus_infoActionPerformed

    private void Confirm_bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirm_bookingActionPerformed
        // TODO add your handling code here:
        new confirm_booking(this.username).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Confirm_bookingActionPerformed

    private void car_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_car_statusActionPerformed
        // TODO add your handling code here:
        new car_status(this.username).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_car_statusActionPerformed

    private void Collect_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Collect_paymentActionPerformed
        // TODO add your handling code here:
        new collect_payment(this.username).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Collect_paymentActionPerformed

    private void Generate_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Generate_reportActionPerformed
        // TODO add your handling code here:
        new generate_report(this.username).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Generate_reportActionPerformed

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
            java.util.logging.Logger.getLogger(Adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adminpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Collect_payment;
    private javax.swing.JButton Confirm_booking;
    private javax.swing.JButton Generate_report;
    private javax.swing.JButton Logout;
    private javax.swing.JButton View_admin_info;
    private javax.swing.JButton View_car_info;
    private javax.swing.JButton View_cus_info;
    private javax.swing.JLabel background;
    private javax.swing.JButton car_status;
    // End of variables declaration//GEN-END:variables
}
