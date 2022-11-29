/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author yibei
 */
public class cus_managebooking extends javax.swing.JFrame {

    /**
     * Creates new form cus_managebooking
     */
    String username;
    
    public cus_managebooking() {
        initComponents();
        setMinimumSize(new java.awt.Dimension(1366, 796));
    }

    public cus_managebooking(String username) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        returnBT = new javax.swing.JButton();
        cancelationBT = new javax.swing.JButton();
        paymentBT = new javax.swing.JButton();
        logoutBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        table.setAutoCreateRowSorter(true);
        table.setBackground(new java.awt.Color(7, 48, 28));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 422, 1340, 230);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/cus_managebooking.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -20, 1540, 810);

        returnBT.setText("jButton1");
        returnBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBTActionPerformed(evt);
            }
        });
        getContentPane().add(returnBT);
        returnBT.setBounds(30, 20, 150, 60);

        cancelationBT.setText("jButton1");
        getContentPane().add(cancelationBT);
        cancelationBT.setBounds(550, 690, 130, 60);

        paymentBT.setText("jButton1");
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
            java.util.logging.Logger.getLogger(cus_managebooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cus_managebooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cus_managebooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cus_managebooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton cancelationBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutBT;
    private javax.swing.JButton paymentBT;
    private javax.swing.JButton returnBT;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
