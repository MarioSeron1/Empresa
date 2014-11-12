/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Alexito
 */
public class Caja extends javax.swing.JFrame {

    JLabel efe_abono;
    JLabel efe_vuelto;
     JLabel label2;
     JTextField texto;
     Home home;
     static String perm;
    /**
     * Creates new form Caja
     * @param permiso
     */
    public Caja(String permiso) {
        perm=permiso;
        initComponents();
        efe_abono = new JLabel("Abono con");
        efe_vuelto =new JLabel("Vuelto");
        texto =new JTextField();
efe_abono.setBounds(300, 230, 300, 40);
efe_vuelto.setBounds(400, 230, 300, 40);
 label2 = new JLabel("Cuenta Corriente");
label2.setBounds(300, 230, 300, 40);
texto.setBounds(350, 230, 200, 30);
this.setTitle("CAJA");
 this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        condicion = new javax.swing.ButtonGroup();
        Nboucher = new javax.swing.JLabel();
        Codvoucher = new javax.swing.JTextField();
        Nboucher1 = new javax.swing.JLabel();
        Codvoucher1 = new javax.swing.JTextField();
        Nboucher2 = new javax.swing.JLabel();
        Codvoucher2 = new javax.swing.JTextField();
        Codvoucher3 = new javax.swing.JTextField();
        Nboucher3 = new javax.swing.JLabel();
        Codvoucher4 = new javax.swing.JTextField();
        Nboucher4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        Nboucher5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Nboucher.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Nboucher.setText("Tipo Documento");

        Codvoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodvoucherActionPerformed(evt);
            }
        });

        Nboucher1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Nboucher1.setText("N° Voucher");

        Codvoucher1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Codvoucher1ActionPerformed(evt);
            }
        });

        Nboucher2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Nboucher2.setText("N° Documento");

        Codvoucher2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Codvoucher2ActionPerformed(evt);
            }
        });

        Codvoucher3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Codvoucher3ActionPerformed(evt);
            }
        });

        Nboucher3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Nboucher3.setText("TOTAL");

        Codvoucher4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Codvoucher4ActionPerformed(evt);
            }
        });

        Nboucher4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Nboucher4.setText("VUELTO");

        condicion.add(jCheckBox1);
        jCheckBox1.setText("EFECTIVO");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCheckBox1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseReleased(evt);
            }
        });

        condicion.add(jCheckBox2);
        jCheckBox2.setText("TARJETA");
        jCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox2MouseClicked(evt);
            }
        });
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        condicion.add(jCheckBox3);
        jCheckBox3.setText("CHEQUE");

        condicion.add(jCheckBox4);
        jCheckBox4.setText("CTA. CTE");
        jCheckBox4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox4))
                    .addComponent(jCheckBox3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addGap(3, 3, 3)
                .addComponent(jCheckBox3)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        Nboucher5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Nboucher5.setText("Condicion de Pago");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(Codvoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(Nboucher1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(Codvoucher1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(Nboucher)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(Codvoucher2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(Nboucher2)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Codvoucher4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Codvoucher3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Nboucher3)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Nboucher4)
                        .addGap(95, 95, 95))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(Nboucher5)))
                .addContainerGap(401, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Nboucher2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Codvoucher2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Nboucher1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Codvoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Nboucher, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Codvoucher1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Nboucher3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Codvoucher3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Nboucher4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Codvoucher4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(Nboucher5)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CodvoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodvoucherActionPerformed
Connection miConexion;
        miConexion=Conexion.GetConnection();
        
      
        if(miConexion!=null)
        {
           // JOptionPane.showMessageDialog(null, "Conexión Realizada Correctamente");
        }
        
        try{
Statement st = miConexion.createStatement();
ResultSet r=st.executeQuery("SELECT * FROM atencion WHERE ATE_CORR ="+Codvoucher.getText()+";");

while(r.next()) {
    
Codvoucher3.setText("$"+r.getString("ATE_TOTAL"));
Codvoucher1.setText(r.getString("ATE_FPAGO"));


}





}catch(Exception e){
JOptionPane.showMessageDialog(null, "Error al extraer datos"+e.toString());
}         // TODO add your handling code here:
    }//GEN-LAST:event_CodvoucherActionPerformed

    private void Codvoucher1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Codvoucher1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Codvoucher1ActionPerformed

    private void Codvoucher2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Codvoucher2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Codvoucher2ActionPerformed

    private void Codvoucher3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Codvoucher3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Codvoucher3ActionPerformed

    private void Codvoucher4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Codvoucher4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Codvoucher4ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
   if(label2.isVisible()){
     this.remove(label2);
 label2.setVisible(false);
 this.repaint();
    }
       
this.add(efe_vuelto);
this.add(efe_abono);
efe_abono.setVisible(true);
efe_vuelto.setVisible(true);
this.repaint();
        if(jCheckBox1.isSelected()){
            
}
else{

this.add(efe_vuelto);
this.add(efe_abono);
efe_abono.setVisible(true);
efe_vuelto.setVisible(true);
this.repaint();
} // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void jCheckBox4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox4MouseClicked
    if(efe_abono.isVisible()){
     this.remove(efe_abono);
 efe_abono.setVisible(false);
 this.repaint();
    }
       

this.add(label2);
label2.setVisible(true);
this.repaint();
        if(jCheckBox4.isSelected()){
            
}
else{

this.add(label2);
label2.setVisible(true);
this.repaint();
}    // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4MouseClicked

    private void jCheckBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox2MouseClicked
         if(efe_abono.isVisible()){
     this.remove(efe_abono);
 efe_abono.setVisible(false);
 this.repaint();
    }
          if(label2.isVisible()){
     this.remove(label2);
 efe_abono.setVisible(false);
 this.repaint();
    }
       

this.add(texto);
texto.setVisible(true);
this.repaint();
        if(jCheckBox2.isSelected()){
            
}
else{

this.add(texto);
texto.setVisible(true);
this.repaint();
} // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2MouseClicked

    private void jCheckBox1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MousePressed

        



     // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1MousePressed

    private void jCheckBox1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseReleased
       // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1MouseReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
home=new Home(perm);
      home.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caja(perm).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Codvoucher;
    private javax.swing.JTextField Codvoucher1;
    private javax.swing.JTextField Codvoucher2;
    private javax.swing.JTextField Codvoucher3;
    private javax.swing.JTextField Codvoucher4;
    private javax.swing.JLabel Nboucher;
    private javax.swing.JLabel Nboucher1;
    private javax.swing.JLabel Nboucher2;
    private javax.swing.JLabel Nboucher3;
    private javax.swing.JLabel Nboucher4;
    private javax.swing.JLabel Nboucher5;
    private javax.swing.ButtonGroup condicion;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
