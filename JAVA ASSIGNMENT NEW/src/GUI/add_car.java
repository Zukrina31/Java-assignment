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
public class add_car extends javax.swing.JFrame {

    /**
     * Creates new form add_car
     */
    String username;
    
    public add_car() {
        initComponents();
        setMinimumSize(new java.awt.Dimension(1366, 796));
    }
    
        public add_car(String username) {
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

        priceTF = new javax.swing.JTextField();
        idTF = new javax.swing.JTextField();
        brandTF = new javax.swing.JTextField();
        nameTF = new javax.swing.JTextField();
        numberTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        returnBT = new javax.swing.JButton();
        addBT = new javax.swing.JButton();
        cancelTF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        priceTF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        priceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTFActionPerformed(evt);
            }
        });
        priceTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceTFKeyTyped(evt);
            }
        });
        getContentPane().add(priceTF);
        priceTF.setBounds(460, 420, 600, 50);

        idTF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        idTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTFActionPerformed(evt);
            }
        });
        getContentPane().add(idTF);
        idTF.setBounds(460, 200, 600, 50);

        brandTF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        brandTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandTFActionPerformed(evt);
            }
        });
        getContentPane().add(brandTF);
        brandTF.setBounds(460, 270, 600, 50);

        nameTF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });
        getContentPane().add(nameTF);
        nameTF.setBounds(460, 350, 600, 50);

        numberTF.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        numberTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberTFActionPerformed(evt);
            }
        });
        numberTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberTFKeyTyped(evt);
            }
        });
        getContentPane().add(numberTF);
        numberTF.setBounds(460, 490, 600, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/add_car.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 0, 1910, 770);

        returnBT.setText("jButton1");
        returnBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBTActionPerformed(evt);
            }
        });
        getContentPane().add(returnBT);
        returnBT.setBounds(20, 20, 140, 80);

        addBT.setText("jButton1");
        addBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTActionPerformed(evt);
            }
        });
        getContentPane().add(addBT);
        addBT.setBounds(500, 650, 170, 80);

        cancelTF.setText("jButton1");
        cancelTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelTFActionPerformed(evt);
            }
        });
        getContentPane().add(cancelTF);
        cancelTF.setBounds(720, 650, 160, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void priceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTFActionPerformed

    private void idTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTFActionPerformed

    private void brandTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandTFActionPerformed

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTFActionPerformed

    private void numberTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberTFActionPerformed

    public void clearTF() {
        idTF.setText(null);
        brandTF.setText(null);
        nameTF.setText(null);
        numberTF.setText(null);
        priceTF.setText(null);
    }
    private void addBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTActionPerformed
        // add car information
        String id = idTF.getText();
        String brand = brandTF.getText();
        String name = nameTF.getText();
        int num = Integer.parseInt(numberTF.getText());
        double price = Double.parseDouble(priceTF.getText());
        String line;
        
        
        try {
            FileWriter writer = new FileWriter("carinfo.txt",true);
            writer.write(id+","+brand+","+name+","+price+","+num +"," + java.time.LocalDate.now() + "," + java.time.LocalTime.now());
            writer.write(System.getProperty("line.separator"));
            writer.close();
            JOptionPane.showMessageDialog(null, "Successful!!!"); 
            clearTF();
        } catch (IOException ex) {
            Logger.getLogger(add_car.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Failed, Please try again.");
        }
        
    }//GEN-LAST:event_addBTActionPerformed

    private void cancelTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelTFActionPerformed
        // empty all text fields
        clearTF();
    }//GEN-LAST:event_cancelTFActionPerformed

    private void returnBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBTActionPerformed
        // return back to look at car information
        new car_info(this.username).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnBTActionPerformed

    private void priceTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceTFKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)) {
            JOptionPane.showMessageDialog(null, "Invalid Contact Number!!!");
            evt.consume();
            priceTF.setText(null);
        }
    }//GEN-LAST:event_priceTFKeyTyped

    private void numberTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberTFKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)) {
            JOptionPane.showMessageDialog(null, "Invalid Contact Number!!!");
            evt.consume();
            numberTF.setText(null);
        }
    }//GEN-LAST:event_numberTFKeyTyped

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
            java.util.logging.Logger.getLogger(add_car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_car().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBT;
    private javax.swing.JTextField brandTF;
    private javax.swing.JButton cancelTF;
    private javax.swing.JTextField idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField numberTF;
    private javax.swing.JTextField priceTF;
    private javax.swing.JButton returnBT;
    // End of variables declaration//GEN-END:variables
}
