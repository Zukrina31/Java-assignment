/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yibei
 */
public final class report_member extends javax.swing.JFrame {

    /**
     * Creates new form report_member
     */
    String username;
    
    public report_member() {
        initComponents();
        setMinimumSize(new java.awt.Dimension(1366, 796));
    }

    public report_member(String username){
        initComponents();
        setMinimumSize(new java.awt.Dimension(1366, 796));
        this.username = username;
        table.setAutoCreateRowSorter(true);
        displayTable();
        total();
    }

    public void displayTable(){
        try {
            FileReader file;
            file = new FileReader("newmembers.txt");
            BufferedReader reader = new BufferedReader(file);
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] tableLines = reader.lines().toArray();
            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] info = line.split(",");
                String membersInfo = info[6] + "," + info[7] + "," + info[0] + "," + info[1] + "," + info[2] + "," + info[4];
                String[] tableData = membersInfo.split(",");
                model.addRow(tableData);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(report_member.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void total() {
        int rowsNum = table.getRowCount();
        String rows = Integer.toString(rowsNum);
        total.setText(rows);
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
        total = new javax.swing.JLabel();
        yyyy = new javax.swing.JLabel();
        mm = new javax.swing.JLabel();
        yearTF = new javax.swing.JTextField();
        monthTF = new javax.swing.JTextField();
        backrgound = new javax.swing.JLabel();
        searchBT = new javax.swing.JButton();
        returnBT = new javax.swing.JButton();
        logoutBT = new javax.swing.JButton();
        printBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        table.setBackground(new java.awt.Color(250, 105, 219));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RegisterDate", "Register Time", "First Name", "Last Name", "Contact Number", "Address"
            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 242, 1130, 310);

        total.setFont(new java.awt.Font("Elephant", 0, 48)); // NOI18N
        getContentPane().add(total);
        total.setBounds(260, 570, 280, 50);

        yyyy.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        yyyy.setText("YYYY");
        getContentPane().add(yyyy);
        yyyy.setBounds(490, 210, 40, 19);

        mm.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        mm.setText("MM");
        getContentPane().add(mm);
        mm.setBounds(350, 210, 40, 19);

        yearTF.setFont(new java.awt.Font("Niagara Engraved", 0, 56)); // NOI18N
        yearTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearTFActionPerformed(evt);
            }
        });
        getContentPane().add(yearTF);
        yearTF.setBounds(390, 150, 90, 80);

        monthTF.setFont(new java.awt.Font("Niagara Engraved", 0, 56)); // NOI18N
        monthTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthTFActionPerformed(evt);
            }
        });
        getContentPane().add(monthTF);
        monthTF.setBounds(250, 150, 90, 80);

        backrgound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/report_member.png"))); // NOI18N
        backrgound.setText("jLabel1");
        backrgound.setMaximumSize(new java.awt.Dimension(1366, 768));
        backrgound.setMinimumSize(new java.awt.Dimension(1366, 768));
        backrgound.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(backrgound);
        backrgound.setBounds(20, -10, 1370, 780);

        searchBT.setText("jButton1");
        searchBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTActionPerformed(evt);
            }
        });
        getContentPane().add(searchBT);
        searchBT.setBounds(140, 140, 90, 90);

        returnBT.setText("jButton1");
        returnBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBTActionPerformed(evt);
            }
        });
        getContentPane().add(returnBT);
        returnBT.setBounds(20, 20, 140, 60);

        logoutBT.setText("jButton1");
        logoutBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTActionPerformed(evt);
            }
        });
        getContentPane().add(logoutBT);
        logoutBT.setBounds(1180, 20, 160, 60);

        printBT.setText("jButton1");
        printBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBTActionPerformed(evt);
            }
        });
        getContentPane().add(printBT);
        printBT.setBounds(620, 620, 140, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void monthTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthTFActionPerformed

    private void searchBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTActionPerformed
        // TODO add your handling code here:
        String monthFilter = monthTF.getText();
        String yearFilter= yearTF.getText();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        FileReader file;
        model.setRowCount(0);
       
        try {
            file = new FileReader("newmembers.txt");
        
            BufferedReader reader = new BufferedReader(file);
            Object[] tableLines = reader.lines().toArray();
            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] info = line.split(",");
                String[] regismonth = info[6].split("-");
                if (regismonth[1].equals(monthFilter) && regismonth[0].equals(yearFilter)) {
                    String membersInfo = info[6] + "," + info[7] + "," + info[0] + "," + info[1] + "," + info[2] + "," + info[4];
                    String[] tableData = membersInfo.split(",");
                    model.addRow(tableData);
                }else if(regismonth[1].equals(monthFilter) && yearFilter.isEmpty()){
                    String membersInfo = info[6] + "," + info[7] + "," + info[0] + "," + info[1] + "," + info[2] + "," + info[4];
                    String[] tableData = membersInfo.split(",");
                    model.addRow(tableData);
                }else if(regismonth[0].equals(yearFilter) && monthFilter.isEmpty()){
                    String membersInfo = info[6] + "," + info[7] + "," + info[0] + "," + info[1] + "," + info[2] + "," + info[4];
                    String[] tableData = membersInfo.split(",");
                    model.addRow(tableData);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(report_member.class.getName()).log(Level.SEVERE, null, ex);
        }
        total();
    }//GEN-LAST:event_searchBTActionPerformed

    private void returnBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBTActionPerformed
        // TODO add your handling code here:
        new generate_report(this.username).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_returnBTActionPerformed

    private void logoutBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTActionPerformed
        // TODO add your handling code here:
        new Startpage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutBTActionPerformed

    private void printBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBTActionPerformed
        // TODO add your handling code here:
       MessageFormat header = new MessageFormat("Report of members registered");
       MessageFormat footer = new MessageFormat("{0,number,integer}");
        try {
            table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (PrinterException ex) {
            Logger.getLogger(report_member.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_printBTActionPerformed

    private void yearTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearTFActionPerformed

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
            java.util.logging.Logger.getLogger(report_member.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(report_member.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(report_member.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(report_member.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new report_member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backrgound;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutBT;
    private javax.swing.JLabel mm;
    private javax.swing.JTextField monthTF;
    private javax.swing.JButton printBT;
    private javax.swing.JButton returnBT;
    private javax.swing.JButton searchBT;
    private javax.swing.JTable table;
    private javax.swing.JLabel total;
    private javax.swing.JTextField yearTF;
    private javax.swing.JLabel yyyy;
    // End of variables declaration//GEN-END:variables
}
