/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanegment;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nusrat Zereen
 */
public class NewJFrame8 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame8
     */
    public NewJFrame8() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tvBookName = new javax.swing.JTextField();
        tvPrize = new javax.swing.JTextField();
        tvAdd = new javax.swing.JButton();
        tvUpdate = new javax.swing.JButton();
        tvDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbproduct = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        lbmessage = new javax.swing.JLabel();
        cmCatagory = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Book Name");

        jLabel2.setText("Catagory");

        jLabel3.setText("Prize");

        tvAdd.setText("Add");
        tvAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tvAddActionPerformed(evt);
            }
        });

        tvUpdate.setText("Update");
        tvUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tvUpdateActionPerformed(evt);
            }
        });

        tvDelete.setText("Delete");
        tvDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tvDeleteActionPerformed(evt);
            }
        });

        tbproduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Name", "Catagory", "Prize"
            }
        ));
        jScrollPane2.setViewportView(tbproduct);

        lbmessage.setText("Massege Box");

        cmCatagory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Books title", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", " " }));

        jButton1.setText("Home Page");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbmessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 7, Short.MAX_VALUE)
                                        .addComponent(tvAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cmCatagory, javax.swing.GroupLayout.Alignment.LEADING, 0, 167, Short.MAX_VALUE)
                                        .addComponent(tvPrize, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tvBookName, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tvUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)
                                        .addComponent(tvDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(tvBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmCatagory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(tvPrize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tvAdd)
                    .addComponent(tvUpdate)
                    .addComponent(tvDelete))
                .addGap(46, 46, 46)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbmessage, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(20, 20, 20))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tvAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tvAddActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbproduct.getModel();
        if (!tvBookName.getText().trim().equals("")){
            model.addRow(new Object[]{tvBookName.getText(),
                cmCatagory.getSelectedItem().toString(),tvPrize.getText()});
         
            
            lbmessage.setText("");
            tvBookName.setText("");
            tvPrize.setText("");
        
        }
        else {
            lbmessage.setText("Product name should not be Blank ");
        }
                        
    }//GEN-LAST:event_tvAddActionPerformed

    private void tvUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tvUpdateActionPerformed
       DefaultTableModel model = (DefaultTableModel) tbproduct.getModel();
        if(tbproduct.getSelectedRow() == -1){
            if(tbproduct.getSelectedRow() == 0){
                lbmessage.setText("Table is empty");
            }else{
                lbmessage.setText("You must be select a Product");
            }
        }else{
            model.setValueAt(tvBookName.getText(),tbproduct.getSelectedRow(), 0);
            model.setValueAt(cmCatagory.getSelectedItem(),tbproduct.getSelectedRow(), 1);
            model.setValueAt(tvPrize.getText(),tbproduct.getSelectedRow(), 2);
            lbmessage.setText("Update is successfully done");
            
        }
    }//GEN-LAST:event_tvUpdateActionPerformed

    private void tvDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tvDeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbproduct.getModel();
        if(tbproduct.getSelectedRow() == -1){
            if(tbproduct.getSelectedRow() == 0){
                lbmessage.setText("Table is empty");
            }else{
                lbmessage.setText("You must be select a Product");
            }
        }else{
            model.removeRow(tbproduct.getSelectedRow());
        }
    }//GEN-LAST:event_tvDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         NewJFrame7 obj = new NewJFrame7();
       obj.setVisible(true);
       
       this.setVisible(false);
       
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmCatagory;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbmessage;
    private javax.swing.JTable tbproduct;
    private javax.swing.JButton tvAdd;
    private javax.swing.JTextField tvBookName;
    private javax.swing.JButton tvDelete;
    private javax.swing.JTextField tvPrize;
    private javax.swing.JButton tvUpdate;
    // End of variables declaration//GEN-END:variables
}