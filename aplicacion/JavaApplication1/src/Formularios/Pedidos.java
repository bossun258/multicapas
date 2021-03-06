
package Formularios;
import Modelo.Temporal;
import Modelo.pedidos;
import Generales.Metodos;
import Generales.conecta;
import java.sql.*;
import javax.swing.JOptionPane;
import Controlador.ln_pedido;


public class Pedidos extends javax.swing.JFrame {
    Metodos oMet = new Metodos();
    conecta oCnx = new conecta();

String sqlcli="SELECT * FROM Clientes";
String sqlemp="SELECT * FROM Empleados";
String sqlpro="SELECT * FROM Productos";
String sql="";

 
    public Pedidos() {
        initComponents();
        oMet.LlenarCombo(cbxclie,sqlcli , "(selecione un cliente)", "razon");
        oMet.LlenarCombo(cbxemp,sqlemp , "(selecione un empleado)", "apeemp");
        oMet.LlenarCombo(cbxpro,sqlpro , "(selecione un producto)", "descrip");
        oMet.EJECUTARRS("TRUNCATE TABLE TEMPORAL");
        oMet.Llenar_tabla(tabped, "SELECT * FROM TEMPORAL");
         idpedido();
         txtfchpedi.setText(oMet.fechaactual());
         this.setLocationRelativeTo(null);
    }
  

private void idpedido(){
   
   int ss= oMet.NuevoID("idped", "pedidos", 1, 4);

   if(ss>0 && ss<10) txtidped.setText("P00"+ss);
   if(ss>=10 && ss<100) txtidped.setText("P0"+ss);
   if(ss>=100 && ss<1000) txtidped.setText("P"+ss);
}


    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxclie = new javax.swing.JComboBox();
        txtcodcli = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtruc = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cbxemp = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtcodemp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtapeemp = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtidped = new javax.swing.JTextField();
        txtfchpedi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cbxpro = new javax.swing.JComboBox();
        txtidpro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtcant = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnpedinue = new javax.swing.JButton();
        btnprocpedi = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabped = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        btnadd = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(51, 204, 255));
        jLabel13.setFont(new java.awt.Font("Adobe Garamond Pro", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("MODULO DE PEDIDOS");
        jLabel13.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 204, 255), new java.awt.Color(0, 204, 255)));
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 330, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 102));
        jLabel1.setText("Seleccionar Cliente:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 102));
        jLabel4.setText("Codigo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 68, -1, -1));

        cbxclie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxclie.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxclieItemStateChanged(evt);
            }
        });
        cbxclie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxclieActionPerformed(evt);
            }
        });
        jPanel1.add(cbxclie, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 36, 186, -1));

        txtcodcli.setEditable(false);
        txtcodcli.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(txtcodcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 97, 101, -1));

        jLabel5.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 102));
        jLabel5.setText("Ruc");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 128, -1, -1));

        txtruc.setEditable(false);
        txtruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrucActionPerformed(evt);
            }
        });
        jPanel1.add(txtruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 157, 101, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 210, 190));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbxemp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxemp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxempItemStateChanged(evt);
            }
        });
        cbxemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxempActionPerformed(evt);
            }
        });
        jPanel2.add(cbxemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 42, 196, -1));

        jLabel2.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 102));
        jLabel2.setText("Seleccionar Empleado:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        txtcodemp.setEditable(false);
        txtcodemp.setForeground(new java.awt.Color(0, 0, 255));
        jPanel2.add(txtcodemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 97, 75, -1));

        jLabel6.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 102));
        jLabel6.setText("Codigo");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 68, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 102));
        jLabel7.setText("Apellido");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 128, -1, -1));

        txtapeemp.setEditable(false);
        jPanel2.add(txtapeemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 157, 150, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 220, 190));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 102));
        jLabel3.setText("Codigo del Pedido:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 8, -1, -1));

        txtidped.setEditable(false);
        txtidped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidpedActionPerformed(evt);
            }
        });
        jPanel3.add(txtidped, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 37, 75, -1));

        txtfchpedi.setEditable(false);
        txtfchpedi.setForeground(new java.awt.Color(0, 0, 255));
        jPanel3.add(txtfchpedi, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 104, 100, -1));

        jLabel8.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 102));
        jLabel8.setText("Fecha dePedido");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 75, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 170, 140));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 255));
        jLabel9.setText("Descripcion del Producto");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        cbxpro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxpro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxproItemStateChanged(evt);
            }
        });
        cbxpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxproActionPerformed(evt);
            }
        });
        jPanel4.add(cbxpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 42, 188, -1));

        txtidpro.setEditable(false);
        txtidpro.setForeground(new java.awt.Color(0, 0, 255));
        txtidpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidproActionPerformed(evt);
            }
        });
        jPanel4.add(txtidpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 42, 90, -1));

        jLabel10.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 255));
        jLabel10.setText("Codigo");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 13, -1, -1));
        jPanel4.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 42, 90, -1));

        jLabel11.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 255));
        jLabel11.setText("precio");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 13, -1, -1));
        jPanel4.add(txtcant, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 42, 80, -1));

        jLabel12.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 255));
        jLabel12.setText("Cantidad");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 13, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 530, 90));

        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnpedinue.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnpedinue.setForeground(new java.awt.Color(255, 51, 51));
        btnpedinue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/page_edit.png"))); // NOI18N
        btnpedinue.setText("pedido Nuevo");
        btnpedinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpedinueActionPerformed(evt);
            }
        });

        btnprocpedi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnprocpedi.setForeground(new java.awt.Color(255, 51, 51));
        btnprocpedi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/package_add.png"))); // NOI18N
        btnprocpedi.setText("Procesar Pedido");
        btnprocpedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprocpediActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnpedinue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnprocpedi)
                .addGap(22, 22, 22))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnpedinue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnprocpedi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, 310, 50));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabped.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabped);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 530, 170));

        jPanel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnadd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 51, 51));
        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img8.jpg"))); // NOI18N
        btnadd.setText("Agregar");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel7.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        btndel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btndel.setForeground(new java.awt.Color(255, 51, 51));
        btndel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/004-basura1.png"))); // NOI18N
        btndel.setText("Eliminar");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });
        jPanel7.add(btndel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 50, 110, -1));

        btnexit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnexit.setForeground(new java.awt.Color(255, 51, 51));
        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img3.jpg"))); // NOI18N
        btnexit.setText("Salir");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel7.add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 100, -1));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 100, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidproActionPerformed

    private void cbxclieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxclieActionPerformed
    
                                             
    }//GEN-LAST:event_cbxclieActionPerformed

    private void cbxempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxempActionPerformed
       
    }//GEN-LAST:event_cbxempActionPerformed

    private void cbxproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxproActionPerformed

    }//GEN-LAST:event_cbxproActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
    String nompro=txtidpro.getText();
   String verf=txtcant.getText();
   if(verf.equals("")){
       JOptionPane.showMessageDialog(this, "Seleccione un producto y/o cantidad");
   }else{
   int canins=Integer.parseInt(verf);
   int test=0;
   sql="SELECT * FROM temporal WHERE idprod='"+nompro+"'";

      try{      
      ResultSet rs= oMet.EJECUTARRS(sql);
         while(rs.next()){
             //capturo la cantidad de la base de datos, si existe
             test=rs.getInt("cantidad");
         }
         //verifico si ya existe una cantidad de ese producto
       if(test!=0){
      
        int can=test+canins;
           //devuelve valor
        oMet.EJECUTARRS("UPDATE temporal SET cantidad="+can+" WHERE idprod='"+nompro+"'");
        //caso que no hay algo 
       }else if(test==0){  
         Temporal e = new Temporal();
         ln_pedido n = new ln_pedido();
         e.setIddoc(txtidped.getText());
         e.setIdpro(txtidpro.getText());
         e.setPre(txtprecio.getText());
         e.setCant(txtcant.getText());
         n.regtemp(e);
  
       } //salida
      }catch(SQLException e){JOptionPane.showMessageDialog(null,"Error en la conexion "+e);
      }                  
        
    oMet.Llenar_tabla(tabped, "SELECT * FROM Temporal");
   }          
                                    
    }//GEN-LAST:event_btnaddActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
    int fila=tabped.getSelectedRow();
    String par=tabped.getValueAt(fila, 1).toString();
      
        try{
    
        try (CallableStatement sp = oCnx.conexion().prepareCall("{call sp_del_detped(?)}")) {
            sp.setString(1, par);
            sp.executeUpdate();
            oMet.Llenar_tabla(tabped, "SELECT * FROM Temporal");
            
            JOptionPane.showMessageDialog(this, "Producto eliminado");
        }

    }catch(SQLException e){
       JOptionPane.showMessageDialog(this, e.getMessage());
    }
      
    }//GEN-LAST:event_btndelActionPerformed

    private void txtidpedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidpedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidpedActionPerformed

    private void btnprocpediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprocpediActionPerformed
     int nError=0;
        if(cbxclie.getSelectedIndex()==0) nError+=2;
        if(cbxemp.getSelectedIndex()==0) nError+=3;
        if(tabped.getRowCount()==0)  nError+=4;
        //validando datos
     switch(nError){
         case 2: JOptionPane.showMessageDialog(null, "seleccione un cliente");break;
         case 3: JOptionPane.showMessageDialog(null, "seleccione un empleado");break;
         case 4: JOptionPane.showMessageDialog(null, "agregue un producto");break;
         case 5: JOptionPane.showMessageDialog(null, "seleccione un cliente y empleado");break;
         case 6: JOptionPane.showMessageDialog(null, "seleccione un cliente y producto");break;
         case 7: JOptionPane.showMessageDialog(null, "seleccione un empleado y producto");break;
         case 9: JOptionPane.showMessageDialog(null, "llene todos los campos");break;   
         
         case 0:   
       ln_pedido n= new ln_pedido();
       Temporal t= new Temporal();
       pedidos e = new pedidos();
       e.setIpped(txtidped.getText());
       e.setFecha(txtfchpedi.getText());
       e.setIdcli(txtcodcli.getText());
       e.setIdemp(txtcodemp.getText());
       n.registrar(e);

      //detalle ped
     for(int i=0; i<tabped.getRowCount();i++){
      t.setIddoc(tabped.getValueAt(i, 0).toString());
      t.setIdpro(tabped.getValueAt(i, 1).toString());
      t.setPre(tabped.getValueAt(i, 2).toString());
      t.setCant(tabped.getValueAt(i, 3).toString());
         n.detped(t);
       }
      //restaurando herramientas
      cbxclie.setSelectedIndex(0);
      cbxemp.setSelectedIndex(0);
      cbxpro.setSelectedIndex(0);
      oMet.EJECUTARRS("TRUNCATE TAbLE TEMPORAL");
      oMet.Llenar_tabla(tabped, "SELECT * FROM Temporal");
      idpedido();break;
     }
    
                                                      
    }//GEN-LAST:event_btnprocpediActionPerformed

    private void txtrucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrucActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        dispose();
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnpedinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpedinueActionPerformed
       cbxclie.setSelectedIndex(0);
       cbxpro.setSelectedIndex(0);
       cbxemp.setSelectedIndex(0);
        
        idpedido();
    }//GEN-LAST:event_btnpedinueActionPerformed

    private void cbxclieItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxclieItemStateChanged
      int f = cbxclie.getSelectedIndex();
      String par= cbxclie.getSelectedItem().toString();
        if(f>0){
           txtcodcli.setText(oMet.Datos("clientes", "idcli","razon",par));
           txtruc.setText(oMet.Datos("clientes", "ruc","razon",par));
        }else{
          txtcodcli.setText("");
          txtruc.setText("");
        }
    }//GEN-LAST:event_cbxclieItemStateChanged

    private void cbxempItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxempItemStateChanged
        int f = cbxemp.getSelectedIndex();
      String par= cbxemp.getSelectedItem().toString();
        if(f>0){
           txtcodemp.setText(oMet.Datos("empleados", "idemp","apeemp",par));
           txtapeemp.setText(oMet.Datos("empleados", "apeemp","apeemp",par));
        }else{
          txtcodemp.setText("");
          txtapeemp.setText("");
        }
    }//GEN-LAST:event_cbxempItemStateChanged

    private void cbxproItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxproItemStateChanged
        int f = cbxpro.getSelectedIndex();
        String par= cbxpro.getSelectedItem().toString();
        if(f>0){
           txtcant.setEnabled(true);
           txtidpro.setText(oMet.Datos("productos", "idprod", "descrip", par));
           txtprecio.setText(oMet.Datos("productos", "precio","descrip",par));
            txtcant.setText("");
        }else{
           txtcant.setEnabled(false); 
          txtidpro.setText("");
          txtprecio.setText("");
          txtcant.setText("");
        }
    }//GEN-LAST:event_cbxproItemStateChanged

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
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndel;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnpedinue;
    private javax.swing.JButton btnprocpedi;
    private javax.swing.JComboBox cbxclie;
    private javax.swing.JComboBox cbxemp;
    private javax.swing.JComboBox cbxpro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabped;
    private javax.swing.JTextField txtapeemp;
    private javax.swing.JTextField txtcant;
    private javax.swing.JTextField txtcodcli;
    private javax.swing.JTextField txtcodemp;
    private javax.swing.JTextField txtfchpedi;
    private javax.swing.JTextField txtidped;
    private javax.swing.JTextField txtidpro;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtruc;
    // End of variables declaration//GEN-END:variables
}
