package Mantenimiento;

import Modelo.cliente;
import Modelo.productos;
import Generales.Metodos;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Controlador.ln_cliente;
import Controlador.ln_producto;

public class Mant_Pro extends javax.swing.JFrame {
    Metodos oMet = new Metodos();
    String xpar="";
    int ModR=0;
    String sqlpro="SELECT * FROM productos "+xpar+" ORDER BY idprod";
    public Mant_Pro() {
        initComponents();
        bloquear(false);
        Clean();
       oMet.Llenar_tabla(tabcli, sqlpro);
       // oMet.fondo(fondocli, "img01.jpg");
        this.setLocationRelativeTo(null);
    }
    
    private void bloquear(boolean valor){
        //campos
        txtcodproi.setEnabled(false);
        txtstock.setEnabled(valor);
        txtdespro.setEnabled(valor);
        txtpre.setEnabled(valor);
        //botones
        btnbusq.setEnabled(false);
        btncan.setEnabled(valor);
        btnnew.setEnabled(!valor);
        btnsav.setEnabled(valor);
        btnedi.setEnabled(!valor);
        
        
    }
    private void Clean(){
        
        txtdespro.setText("");
        txtpre.setText("");
        txtstock.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtpre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcodproi = new javax.swing.JTextField();
        txtdespro = new javax.swing.JTextField();
        btnnew = new javax.swing.JButton();
        btncln = new javax.swing.JButton();
        btncan = new javax.swing.JButton();
        btnexi = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        btnedi = new javax.swing.JButton();
        btnsav = new javax.swing.JButton();
        chkbuscar = new javax.swing.JCheckBox();
        btnbusq = new javax.swing.JButton();
        txtstock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabcli = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        fondocli = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtpre.setText("12456398743");
        jPanel1.add(txtpre, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 70, 123, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Precio:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 75, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Descripcion:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Codigo Producto");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, -1, -1));

        txtcodproi.setText("C001");
        txtcodproi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodproiActionPerformed(evt);
            }
        });
        jPanel1.add(txtcodproi, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 12, 75, -1));

        txtdespro.setText("Wilmer Ivan");
        jPanel1.add(txtdespro, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 41, 190, -1));

        btnnew.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnnew.setForeground(new java.awt.Color(255, 51, 51));
        btnnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/package_add.png"))); // NOI18N
        btnnew.setText("Nuevo");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });
        jPanel1.add(btnnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        btncln.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncln.setForeground(new java.awt.Color(255, 51, 51));
        btncln.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/004-basura1.png"))); // NOI18N
        btncln.setText("Limpiar");
        btncln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclnActionPerformed(evt);
            }
        });
        jPanel1.add(btncln, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        btncan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncan.setForeground(new java.awt.Color(255, 51, 51));
        btncan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cancel.png"))); // NOI18N
        btncan.setText("Cancelar");
        btncan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanActionPerformed(evt);
            }
        });
        jPanel1.add(btncan, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        btnexi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnexi.setForeground(new java.awt.Color(255, 51, 51));
        btnexi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/door_out.png"))); // NOI18N
        btnexi.setText("Cerrar");
        btnexi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexiActionPerformed(evt);
            }
        });
        jPanel1.add(btnexi, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

        btndel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btndel.setForeground(new java.awt.Color(255, 51, 51));
        btndel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/delete.png"))); // NOI18N
        btndel.setText("Eliminar");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });
        jPanel1.add(btndel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        btnedi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnedi.setForeground(new java.awt.Color(255, 51, 51));
        btnedi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/page_edit.png"))); // NOI18N
        btnedi.setText("Modificar");
        btnedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnediActionPerformed(evt);
            }
        });
        jPanel1.add(btnedi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        btnsav.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsav.setForeground(new java.awt.Color(255, 51, 51));
        btnsav.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/disk.png"))); // NOI18N
        btnsav.setText("Guardar");
        btnsav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsavActionPerformed(evt);
            }
        });
        jPanel1.add(btnsav, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        chkbuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chkbuscar.setForeground(new java.awt.Color(51, 51, 255));
        chkbuscar.setText("Buscar");
        chkbuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chkbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(chkbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 11, -1, -1));

        btnbusq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/magnifier.png"))); // NOI18N
        btnbusq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbusqActionPerformed(evt);
            }
        });
        jPanel1.add(btnbusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 11, 38, 24));
        jPanel1.add(txtstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 100, 123, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Stock:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 105, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 500, 170));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setOpaque(false);

        tabcli.setModel(new javax.swing.table.DefaultTableModel(
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
        tabcli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabcliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabcli);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 500, 170));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("MANTENIMIENTOS PRODUCTOS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));
        getContentPane().add(fondocli, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsavActionPerformed

        if(ModR==1) AgregarReg();
        if(ModR==2) ActualizarReg();
        bloquear(false);
       
    }//GEN-LAST:event_btnsavActionPerformed

    private void btnediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnediActionPerformed
        ModR=2;
        bloquear(true);
    }//GEN-LAST:event_btnediActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
   ln_cliente n =new ln_cliente();
   cliente e =new cliente();
   
   e.setIdcli(txtcodproi.getText());
   
     n.eliminar(e);   
    oMet.Llenar_tabla(tabcli, sqlpro);
    }//GEN-LAST:event_btndelActionPerformed

    private void btnclnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclnActionPerformed
        Clean();
    }//GEN-LAST:event_btnclnActionPerformed

    private void btnexiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexiActionPerformed
       dispose();
    }//GEN-LAST:event_btnexiActionPerformed

    private void txtcodproiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodproiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodproiActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
      //aqui
      ModR=1;
        bloquear(true);
        //metodo para generar id
        
   int   id=oMet.NuevoID("idcli", "clientes",1,4);
        System.out.println(id);
      
     if(id<10){
          txtcodproi.setText("PROD0"+String.valueOf(id));
     }else if(id<100){
      txtcodproi.setText("PROD"+String.valueOf(id));
     }/*else if(id<1000){
      txtcodproi.setText("PROD"+String.valueOf(id));
     }*/
     Clean();
     txtdespro.grabFocus();
    }//GEN-LAST:event_btnnewActionPerformed

    private void tabcliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabcliMouseClicked
      DefaultTableModel tm= (DefaultTableModel)tabcli.getModel();
        String dato;
        dato = String.valueOf(tm.getValueAt(tabcli.getSelectedRow(),0));
        txtcodproi.setText(dato);
        dato = String.valueOf(tm.getValueAt(tabcli.getSelectedRow(),1));
        txtdespro.setText(dato);
        dato = String.valueOf(tm.getValueAt(tabcli.getSelectedRow(),2));
        txtpre.setText(dato);
        dato = String.valueOf(tm.getValueAt(tabcli.getSelectedRow(),3));
        txtstock.setText(dato);
       
    }//GEN-LAST:event_tabcliMouseClicked

    private void btncanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanActionPerformed
        bloquear(false);
    }//GEN-LAST:event_btncanActionPerformed

    private void chkbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbuscarActionPerformed
     if(chkbuscar.isSelected()){
       txtcodproi.setEnabled(true);
       btnbusq.setEnabled(true);
       btnnew.setEnabled(false);
      
     }else{
         oMet.Llenar_tabla(tabcli, sqlpro);
         bloquear(false);
     }
    }//GEN-LAST:event_chkbuscarActionPerformed

    private void btnbusqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbusqActionPerformed
    xpar="SELECT * FROM Productos WHERE idprod='"+ txtcodproi.getText()+"' ORDER BY idprod";

    oMet.Llenar_tabla(tabcli, xpar);
 
    }//GEN-LAST:event_btnbusqActionPerformed
    public void AgregarReg(){
  
    ln_producto tt = new ln_producto();
    productos p =new productos();
   
    p.setIdpro(txtcodproi.getText());
   p.setDes(txtdespro.getText());
   p.setPre(txtpre.getText());
   p.setStock(txtstock.getText());
   tt.registrar(p);
  
    bloquear(false);
    oMet.Llenar_tabla(tabcli, sqlpro);   
    }
    
    public void ActualizarReg(){
  ln_cliente n =new ln_cliente();
    cliente e =new cliente();
   
    e.setIdcli(txtcodproi.getText());
    e.setRazon(txtdespro.getText());
    e.setRuc(txtpre.getText());
    e.setDireccion(txtstock.getText());
    n.modificar(e);
    oMet.Llenar_tabla(tabcli, sqlpro);
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
            java.util.logging.Logger.getLogger(Mant_Pro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mant_Pro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mant_Pro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mant_Pro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mant_Pro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbusq;
    private javax.swing.JButton btncan;
    private javax.swing.JButton btncln;
    private javax.swing.JButton btndel;
    private javax.swing.JButton btnedi;
    private javax.swing.JButton btnexi;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnsav;
    private javax.swing.JCheckBox chkbuscar;
    private javax.swing.JLabel fondocli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabcli;
    private javax.swing.JTextField txtcodproi;
    private javax.swing.JTextField txtdespro;
    private javax.swing.JTextField txtpre;
    private javax.swing.JTextField txtstock;
    // End of variables declaration//GEN-END:variables
}
