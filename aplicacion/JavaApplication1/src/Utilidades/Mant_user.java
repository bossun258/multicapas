package Utilidades;

import Modelo.empleados;
import Modelo.user;
import Generales.Metodos;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;
import Controlador.ln_emp;
import Controlador.ln_usuario;

public class Mant_user extends javax.swing.JFrame {
    Metodos oMet = new Metodos();
    int ModR=0;
    String sqluser="SELECT * FROM v_listuser";
    String sqltu="select * from T_user";
    public Mant_user() {
        initComponents();
        bloquear(false);
        Clean();
     oMet.LlenarCombo(cbxtcuenta,sqltu,"(seleccione)","codT_user");
       // oMet.fondo(fondocli, "img01.jpg");
        this.setLocationRelativeTo(null);
    }
    
    private void bloquear(boolean valor){
        //campos
        txtcoduser.setEnabled(false);
        txtpass.setEnabled(valor);
        txtnom.setEnabled(valor);
        txtuser.setEnabled(valor);
   
        //botones
        btnbusq.setEnabled(false);
        btncan.setEnabled(valor);
        btnnew.setEnabled(!valor);
        btnsav.setEnabled(valor);
        btnedi.setEnabled(!valor);
        
        //combo
        cbxtcuenta.setEnabled(valor);
        
        
    }
    private void Clean(){
        
        txtnom.setText("");
        txtuser.setText("");
        txtpass.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcoduser = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        btnnew = new javax.swing.JButton();
        btncln = new javax.swing.JButton();
        btncan = new javax.swing.JButton();
        btnexi = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        btnedi = new javax.swing.JButton();
        btnsav = new javax.swing.JButton();
        chkbuscar = new javax.swing.JCheckBox();
        btnbusq = new javax.swing.JButton();
        txtuser = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        cbxtcuenta = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabuser = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Nombres:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Codigo de usuario:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, -1, -1));

        txtcoduser.setText("C001");
        txtcoduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcoduserActionPerformed(evt);
            }
        });
        jPanel1.add(txtcoduser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 75, -1));

        txtnom.setText("Wilmer Ivan");
        jPanel1.add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 190, -1));

        btnnew.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnnew.setForeground(new java.awt.Color(255, 51, 51));
        btnnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/user_add.png"))); // NOI18N
        btnnew.setText("Nuevo");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });
        jPanel1.add(btnnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        btncln.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncln.setForeground(new java.awt.Color(255, 51, 51));
        btncln.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/004-basura1.png"))); // NOI18N
        btncln.setText("Limpiar");
        btncln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclnActionPerformed(evt);
            }
        });
        jPanel1.add(btncln, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        btncan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncan.setForeground(new java.awt.Color(255, 51, 51));
        btncan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cancel.png"))); // NOI18N
        btncan.setText("Cancelar");
        btncan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanActionPerformed(evt);
            }
        });
        jPanel1.add(btncan, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        btnexi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnexi.setForeground(new java.awt.Color(255, 51, 51));
        btnexi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/door_out.png"))); // NOI18N
        btnexi.setText("Cerrar");
        btnexi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexiActionPerformed(evt);
            }
        });
        jPanel1.add(btnexi, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        btndel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btndel.setForeground(new java.awt.Color(255, 51, 51));
        btndel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/delete.png"))); // NOI18N
        btndel.setText("Eliminar");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });
        jPanel1.add(btndel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        btnedi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnedi.setForeground(new java.awt.Color(255, 51, 51));
        btnedi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/page_edit.png"))); // NOI18N
        btnedi.setText("Modificar");
        btnedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnediActionPerformed(evt);
            }
        });
        jPanel1.add(btnedi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        btnsav.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsav.setForeground(new java.awt.Color(255, 51, 51));
        btnsav.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/disk.png"))); // NOI18N
        btnsav.setText("Guardar");
        btnsav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsavActionPerformed(evt);
            }
        });
        jPanel1.add(btnsav, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 100, -1));

        chkbuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chkbuscar.setForeground(new java.awt.Color(0, 204, 204));
        chkbuscar.setText("Buscar");
        chkbuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chkbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(chkbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        btnbusq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/magnifier.png"))); // NOI18N
        btnbusq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbusqActionPerformed(evt);
            }
        });
        jPanel1.add(btnbusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 38, 24));
        jPanel1.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 123, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("Tipo de Cuenta:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("Contraseña:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 120, -1));

        cbxtcuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cbxtcuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 120, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("usuario:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setOpaque(false);

        tabuser.setModel(new javax.swing.table.DefaultTableModel(
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
        tabuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabuserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabuser);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Crear Cuenta Nueva");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsavActionPerformed

        if(ModR==1) AgregarReg();
        if(ModR==2) ActualizarReg();
     ln_usuario tt = new ln_usuario();
     user e = new user();
     e.setIduser(txtcoduser.getText());
     oMet.Llenar_tablaRS(tabuser, tt.SearchUser(e));
        bloquear(false);
       
    }//GEN-LAST:event_btnsavActionPerformed

    private void btnediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnediActionPerformed
        ModR=2;
        bloquear(true);
    }//GEN-LAST:event_btnediActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
   ln_emp n =new ln_emp();
   empleados e =new empleados();
   
   e.setIdemp(txtcoduser.getText());
   
     n.eliminar(e);   
    oMet.Llenar_tabla(tabuser, sqluser);
    }//GEN-LAST:event_btndelActionPerformed

    private void btnclnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclnActionPerformed
        Clean();
    }//GEN-LAST:event_btnclnActionPerformed

    private void btnexiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexiActionPerformed
       dispose();
    }//GEN-LAST:event_btnexiActionPerformed

    private void txtcoduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcoduserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcoduserActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
      //aqui
      ModR=1;
        bloquear(true);
        //metodo para generar id
        
   int   id=oMet.NuevoID("coduser", "usuario",1,5);
        System.out.println(id);
      
     if(id<10){
          txtcoduser.setText("U000"+String.valueOf(id));
     }else if(id<100){
      txtcoduser.setText("U00"+String.valueOf(id));
     }else if(id<1000){
      txtcoduser.setText("U0"+String.valueOf(id));
     }
     Clean();
     txtnom.grabFocus();
    }//GEN-LAST:event_btnnewActionPerformed

    private void tabuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabuserMouseClicked
      DefaultTableModel tm= (DefaultTableModel)tabuser.getModel();
        String dato,usuario;
        
        usuario = String.valueOf(tm.getValueAt(tabuser.getSelectedRow(),0));
        dato = oMet.Datos("usuario", "coduser", "usu", usuario);
        //coduser
        txtcoduser.setText(dato);
        //user
        txtuser.setText(usuario);
        dato = String.valueOf(tm.getValueAt(tabuser.getSelectedRow(),1));
        txtnom.setText(dato);
        dato = String.valueOf(tm.getValueAt(tabuser.getSelectedRow(),2));
        txtpass.setText(dato);
        dato = String.valueOf(tm.getValueAt(tabuser.getSelectedRow(),3));
        cbxtcuenta.setSelectedItem(dato);
      
       
    }//GEN-LAST:event_tabuserMouseClicked

    private void btncanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanActionPerformed
        bloquear(false);
    }//GEN-LAST:event_btncanActionPerformed

    private void chkbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbuscarActionPerformed
     if(chkbuscar.isSelected()){
         
       txtcoduser.setEnabled(true);
       txtcoduser.setText("");
       btnbusq.setEnabled(true);
       btnnew.setEnabled(false);
      
     }else{
        oMet.limpiarTabla(tabuser);
         bloquear(false);
     }
    }//GEN-LAST:event_chkbuscarActionPerformed

    private void btnbusqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbusqActionPerformed
     ln_usuario tt = new ln_usuario();
     user e = new user();
     e.setIduser(txtcoduser.getText());
     oMet.Llenar_tablaRS(tabuser, tt.SearchUser(e));
     
    }//GEN-LAST:event_btnbusqActionPerformed
    public void AgregarReg(){
    ln_usuario tt = new ln_usuario();
    user e =new user();
   
    e.setIduser(txtcoduser.getText());
   e.setApeuser(txtnom.getText());
   e.setUser(txtuser.getText());
   e.setPass(txtpass.getText());
   e.setT_ac(String.valueOf(cbxtcuenta.getSelectedIndex()));
   tt.RegUser(e);
  
    bloquear(false);

    }
    
    public void ActualizarReg(){
  ln_usuario tt = new ln_usuario();
   user e =new user();
   e.setIduser(txtcoduser.getText());
    e.setApeuser(txtnom.getText());
    e.setUser(txtuser.getText());
    e.setPass(txtpass.getText()); 
    e.setT_ac(String.valueOf(cbxtcuenta.getSelectedIndex()));

    tt.UpdUser(e);

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
            java.util.logging.Logger.getLogger(Mant_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mant_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mant_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mant_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Mant_user().setVisible(true);
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
    private javax.swing.JComboBox<String> cbxtcuenta;
    private javax.swing.JCheckBox chkbuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabuser;
    private javax.swing.JTextField txtcoduser;
    private javax.swing.JTextField txtnom;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
