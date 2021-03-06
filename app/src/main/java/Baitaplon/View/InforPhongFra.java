/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Baitaplon.View;

import Baitaplon.Model.Ghe;
import Baitaplon.Model.Phim;
import Baitaplon.Model.Phong;
import Baitaplon.controler.Files;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class InforPhongFra extends javax.swing.JDialog {

    private HomeFrame home;
    DefaultTableModel modelphim;
    DefaultTableModel modelghe;
    private Files fos ;
    /**
     * Creates new form InforPhongFra
     */
    public InforPhongFra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        home = (HomeFrame) parent;
        modelphim=(DefaultTableModel) Tablephim.getModel();
        modelghe = (DefaultTableModel) Tableghe.getModel();
        setLocationRelativeTo(null);
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
        Tablephim = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tableghe = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        TextMa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ttma = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Tablephim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S??? th??? t???", "M?? Phim", "T??n Phim", "Th??? lo???i", "Ng??y c??ng chi???u"
            }
        ));
        jScrollPane1.setViewportView(Tablephim);

        Tableghe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S??? th??? t???", "M?? Gh???", "V??? Tr??", "Tr???ng Th??i"
            }
        ));
        jScrollPane2.setViewportView(Tableghe);

        jLabel1.setText("M?? Ph??ng c???n hi???n th??? : ");

        TextMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextMaActionPerformed(evt);
            }
        });

        jButton1.setText("Hi???n Th???");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("TH??NG TIN V??? PHIM");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("TH??NG TIN V??? GH???");

        jButton2.setText("S???a tr???ng th??i gh??? ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextMa, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(ttma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ttma, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextMa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextMaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String Map = TextMa.getText();
        if(Map.trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Kh??ng ???????c ????? tr???ng m?? phim","Th??ng b??o",
                    JOptionPane.ERROR_MESSAGE);
        }else{
            Map=Map.toUpperCase();
            Phong ph = new Phong(Map);
            if(home.Arrphong.contains(ph)){
                Phong zoom = null;
                int i = home.Arrphong.indexOf(ph);
                zoom = home.Arrphong.get(i);
                showdata(zoom.Arrphim, modelphim);
                showdata(zoom.Arrghe, modelghe);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Kh??ng t???n t???i ph??ng n??y");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       int n=Tableghe.getSelectedRow();
       if(n==-1){
           JOptionPane.showMessageDialog(rootPane, "B???n ch??a ch???n gh???.");
       }else{
           String maphong = TextMa.getText().toUpperCase().trim();
           if(maphong.equals("")){
               JOptionPane.showMessageDialog(rootPane, "B???n c???n ch???n m?? ph??ng ????? thay ?????i tr???ng th??i c???a gh???.");
           }else{
               Phong ph = new Phong(maphong);
               if(!home.Arrphong.contains(ph)){
                   JOptionPane.showMessageDialog(rootPane, "Kh??ng t???n t???i ph??ng n??y");
               }else{
                   int i = home.Arrphong.indexOf(ph);
                   if(home.Arrphong.get(i).Arrghe.get(n).getchk()==true){
                       home.Arrphong.get(i).Arrghe.get(n).setchk(false);
                   }else{
                       home.Arrphong.get(i).Arrghe.get(n).setchk(true);
                   }
                   showdata(home.Arrphong.get(i).Arrghe, modelghe);
                   JOptionPane.showMessageDialog(rootPane, "???? thay ?????i tr???ng th??i gh??? th??nh c??ng");
                   home.fos.ghifile(home.Arrphong, "QLPHONG.TXT");
               }
           }
           
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    public <T> void showdata(ArrayList<T> list, DefaultTableModel model){
        int dem=1;
        model.setRowCount(0);
        for(T values: list){
            if(values instanceof Phim){
                Phim item = (Phim) values;
                model.addRow(new Object[]{
                    dem++,item.getMaphim(),item.getTenphim(),item.gettheloai(),item.getngaycongchieu()
                });
            }
            if(values instanceof Ghe){
                Ghe item = (Ghe) values;
                String ttString;
                if(item.getchk()){
                    ttString="???? ?????t";
                }else{
                    ttString="Ch??a ?????t";
                }
                model.addRow(new Object[]{
                    dem++,item.getMaghe(),item.getvitri(),ttString
                });
            }
        }
    }
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
            java.util.logging.Logger.getLogger(InforPhongFra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InforPhongFra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InforPhongFra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InforPhongFra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InforPhongFra dialog = new InforPhongFra(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tableghe;
    private javax.swing.JTable Tablephim;
    private javax.swing.JTextField TextMa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel ttma;
    // End of variables declaration//GEN-END:variables
}
