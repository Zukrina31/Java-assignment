/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import static GUI.Files.editBooking;
import static GUI.Files.readBooking;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author yibei
 */
public class cus_payment extends javax.swing.JFrame {

    String username;
    String price;
    String carplates;
    String carID;

    /**
     * Creates new form cus_payment
     */
    public cus_payment() {
        initComponents();
        setMinimumSize(new java.awt.Dimension(1366, 796));
    }

    public cus_payment(String username, String price, String carplates) {
        initComponents();
        setMinimumSize(new java.awt.Dimension(1366, 796));
        this.username = username;
        this.price = price;
        this.carplates = carplates;
        displayamount.setText(this.price);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        YearChooser = new com.toedter.calendar.JYearChooser();
        MonthChooser = new com.toedter.calendar.JMonthChooser();
        rm = new javax.swing.JLabel();
        cvc = new javax.swing.JPasswordField();
        cardnum = new javax.swing.JPasswordField();
        name = new javax.swing.JTextField();
        displayamount = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        payBT = new javax.swing.JButton();
        returnBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(YearChooser);
        YearChooser.setBounds(1230, 500, 90, 50);
        getContentPane().add(MonthChooser);
        MonthChooser.setBounds(1080, 500, 110, 50);

        rm.setFont(new java.awt.Font("Engravers MT", 0, 50)); // NOI18N
        rm.setText("RM");
        getContentPane().add(rm);
        rm.setBounds(110, 200, 340, 140);

        cvc.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cvc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvcActionPerformed(evt);
            }
        });
        cvc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cvcKeyTyped(evt);
            }
        });
        getContentPane().add(cvc);
        cvc.setBounds(900, 500, 120, 50);

        cardnum.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cardnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardnumActionPerformed(evt);
            }
        });
        cardnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cardnumKeyPressed(evt);
            }
        });
        getContentPane().add(cardnum);
        cardnum.setBounds(1030, 330, 280, 50);

        name.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        getContentPane().add(name);
        name.setBounds(1030, 240, 280, 50);

        displayamount.setFont(new java.awt.Font("Engravers MT", 0, 50)); // NOI18N
        displayamount.setForeground(new java.awt.Color(48, 34, 140));
        getContentPane().add(displayamount);
        displayamount.setBounds(240, 200, 340, 140);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/cus_payment.png"))); // NOI18N
        background.setText("jLabel1");
        background.setMaximumSize(new java.awt.Dimension(1366, 768));
        background.setMinimumSize(new java.awt.Dimension(1366, 768));
        background.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(background);
        background.setBounds(0, -20, 1366, 800);

        payBT.setText("jButton1");
        payBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBTActionPerformed(evt);
            }
        });
        getContentPane().add(payBT);
        payBT.setBounds(960, 640, 200, 80);

        returnBT.setText("jButton1");
        returnBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBTActionPerformed(evt);
            }
        });
        getContentPane().add(returnBT);
        returnBT.setBounds(30, 10, 150, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBTActionPerformed
        try {
            // TODO add your handling code here:
            new cus_managebooking(this.username).setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(cus_payment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_returnBTActionPerformed

    private void payBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBTActionPerformed
        // TODO add your handling code here:
        String cardName = name.getText();
        String cardNum = cardnum.getText();
        String cVc = cvc.getText();
        DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("MM");
        String exMonth = monthFormatter.format(Month.of(MonthChooser.getMonth()+1));
        DateTimeFormatter yearFormatter = DateTimeFormatter.ofPattern("yyyy");
        String exYear = yearFormatter.format(Year.of(YearChooser.getYear()));
        if (cardName.isEmpty() || cardNum.isEmpty() || cVc.isEmpty())
            JOptionPane.showMessageDialog(null, "Please fill up add details");
        else if(cVc.length() >= 4) {
            JOptionPane.showMessageDialog(null, "Invalid CVC!!!!");
            cvc.setText(null);
        }
        else {
            ArrayList<String> tempArray = new ArrayList<>();
            ArrayList<Booking> list;
            try {
                list = readBooking();
                for(Booking b : list) {
                    if(b.getUsername().equals(this.username) && b.getCarPlate().equals(this.carplates)) {
                        this.carID = b.getCarID();
                        b.setPaymentStatus("paid");
                        tempArray.add(b.toString());
                    }else
                        tempArray.add(b.toString());
            }
                editBooking(tempArray,"cusbooking.txt");
            } catch (IOException ex) {
                Logger.getLogger(cus_payment.class.getName()).log(Level.SEVERE, null, ex);
            }
   
            try {
                FileWriter fw = new FileWriter("paymenthistory.txt",true);
                fw.write(this.username + "," + this.carID + "," + this.carplates + "," + this.price + ","
                        + cardName + "," + cardNum + "," + cVc + "," + exMonth + "," + exYear + ","
                        + java.time.LocalDate.now() + "," + java.time.LocalTime.now());
                fw.write("\r\n");
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(cus_payment.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Thank You~");
            try {
                new cus_managebooking(this.username).setVisible(true);
                this.setVisible(false);
            } catch (IOException ex) {
                Logger.getLogger(cus_payment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_payBTActionPerformed

    private void cardnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardnumActionPerformed

    private void cardnumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cardnumKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)) {
            JOptionPane.showMessageDialog(null, "Invalid Contact Number!!!");
            evt.consume();
            cardnum.setText(null);
        }
    }//GEN-LAST:event_cardnumKeyPressed

    private void cvcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvcActionPerformed

    private void cvcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cvcKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)) {
            JOptionPane.showMessageDialog(null, "Invalid Contact Number!!!");
            evt.consume();
            cvc.setText(null);
        }
    }//GEN-LAST:event_cvcKeyTyped

    /**
         * @param args the command line arguments
         */
    public static void cus_payment(String username, String price, String carplates) {
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
            java.util.logging.Logger.getLogger(cus_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cus_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cus_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cus_payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cus_payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JMonthChooser MonthChooser;
    private com.toedter.calendar.JYearChooser YearChooser;
    private javax.swing.JLabel background;
    private javax.swing.JPasswordField cardnum;
    private javax.swing.JPasswordField cvc;
    private javax.swing.JLabel displayamount;
    private javax.swing.JTextField name;
    private javax.swing.JButton payBT;
    private javax.swing.JButton returnBT;
    private javax.swing.JLabel rm;
    // End of variables declaration//GEN-END:variables
}
