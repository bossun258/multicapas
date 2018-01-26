/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generales;

import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Alumno
 */
public class Metodos {
    Connection cn= null;
    Statement st= null;
    conecta oCnx = new conecta();
    
    
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
    
    public String getfecha(JDateChooser jd){
        if(jd.getDate()!=null){
            return formato.format(jd.getDate());
        }else{
            return null;
        }
    }
    
    public  String fechaactual(){
    Date fecha= new Date();
    SimpleDateFormat formatofecha= new SimpleDateFormat("dd/MM/YYYY");
    return formatofecha.format(fecha);
    }
    
     public void LlenarCombo(JComboBox cbx,String sql,String vacio, String nomColum){
     DefaultComboBoxModel dc = new DefaultComboBoxModel();
      cbx.setModel(dc);
      try {
       cn=oCnx.conexion();
       st = cn.createStatement();
       ResultSet rs = st.executeQuery(sql);
       dc.addElement(vacio);
       while (rs.next()){
       dc.addElement(rs.getString(nomColum));
      }
       }catch (SQLException e){
      JOptionPane.showMessageDialog(null, e.getMessage());
      }  
}
     
     public  int  NuevoID(String cod,String nomtab, int codI,int codF) {
            int id =0;
            String tp="";
            String sql = "SELECT max("+cod+") AS idult FROM "+ nomtab+"" ;
   
              try{
                 cn=oCnx.conexion();
                 st=cn.createStatement();
     }
    catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Error en la conexion "+e);
    }  
            
            try { 
             ResultSet rs = st.executeQuery(sql); 
                id = 1; // no encontro alumnos
                     if ( rs.next() == true ) {
                                 if(rs.getString("idult")!=null) {
                                  tp=(rs.getString("idult")).substring(codI, codF) ; // encontro el último id de alumno
                                     System.out.println(tp);
                                  id=Integer.parseInt(tp)+1;  
                                  }
                     }
                     
               
                   rs.getStatement().close(); 
                     
            }  catch ( SQLException  e ) {
          JOptionPane.showMessageDialog(null , "Error en NuevoReg \n" + e.getMessage() );
                    id = -1 ;
            } // try-catch
            return id ;
      }  // NuevoIdAlumno  
     
      public void Llenar_tabla(JTable nomT, String sql){
   DefaultTableModel tabla = new DefaultTableModel(){
        public boolean isCellEditable(int f, int c){
            return false;
        }//iscelleditable
    };//Defaulttablemodel;;
     nomT.setModel(tabla);
     //conexion a BD
       try {
       cn=oCnx.conexion();
     st = cn.createStatement();
       ResultSet rs = st.executeQuery(sql);   
     ResultSetMetaData rsmd = rs.getMetaData();
     int columnas = rsmd.getColumnCount();
     for (int i = 1;i <=columnas;i++){
       tabla.addColumn(rsmd.getColumnLabel(i));
      }
      while (rs.next()){
       Object[] fila = new Object[columnas];
       for (int i = 0;i <columnas;i++){
       fila[i]=rs.getObject(i+1);
        }
       tabla.addRow(fila);
       }
      
     }catch (SQLException e1){
    JOptionPane.showMessageDialog(null, e1.getMessage());
}        
}   
      
     public void Llenar_tablaRS(JTable nomT, ResultSet rsx){
   DefaultTableModel tabla = new DefaultTableModel(){
        public boolean isCellEditable(int f, int c){
            return false;
        }//iscelleditable
    };//Defaulttablemodel;;
     nomT.setModel(tabla);
     //conexion a BD
       try {
       cn=oCnx.conexion();
     st = cn.createStatement();
       
     ResultSetMetaData rsmd = rsx.getMetaData();
     int columnas = rsmd.getColumnCount();
     for (int i = 1;i <=columnas;i++){
       tabla.addColumn(rsmd.getColumnLabel(i));
      }
      while (rsx.next()){
       Object[] fila = new Object[columnas];
       for (int i = 0;i <columnas;i++){
       fila[i]=rsx.getObject(i+1);
        }
       tabla.addRow(fila);
       }
      
     }catch (SQLException e1){
    JOptionPane.showMessageDialog(null, e1.getMessage());
}        
}   
      
    public void fondo(JLabel fondo,String nf ){
    
    ImageIcon bg= new ImageIcon(getClass().getResource("/Recursos/"+nf));
    ImageIcon ftemp= new ImageIcon(bg.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
    
    fondo.setIcon(ftemp);
     }
    
    public ResultSet EJECUTARRS(String sql){
        ResultSet rs = null;
        try{
            rs=oCnx.conexion().createStatement().executeQuery(sql);
        
       
        }catch(SQLException e){
          
            
        }
        return rs;
        
    }
    
     public void acomodarTablas(JTable table) {

        TableColumnModel columnModel = table.getColumnModel();
            for (int col=0; col<table.getColumnCount(); col++) {
                int maxwidth = 0;
                    for (int row=0; row<table.getRowCount(); row++) {
                        TableCellRenderer rend = table.getCellRenderer(row, col);
                        Object value = table.getValueAt (row, col);
                        Component comp = rend.getTableCellRendererComponent (table, value,false,false,row, col);
                        maxwidth = Math.max (comp.getPreferredSize().width, maxwidth);
                    } // for row
                javax.swing.table.TableColumn column = columnModel.getColumn(col);
                 column.setPreferredWidth (maxwidth);
             } // for col
        }
     
     public void limpiarTabla(JTable tabla){
        try {
            DefaultTableModel modelo=(DefaultTableModel) tabla.getModel();
            int filas=tabla.getRowCount();
            for (int i = 0;filas>i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla\n"+ e.getMessage());
        }
    }
     
     public void GenFact(String NomRep,String par1){
         Map parametros= new HashMap();
       
 
       parametros.put("x", par1);
       
        
      String path=NomRep;
      
        try {

            JasperReport reportes=JasperCompileManager.compileReport(path);
            JasperPrint print=JasperFillManager.fillReport(reportes,parametros,oCnx.conexion());
            JasperViewer visor=new JasperViewer(print,false);
            visor.setVisible(true);
            visor.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
            //JasperViewer.viewReport(print);
            
        } catch (JRException ex) {
            System.out.printf(ex.getMessage());
        } 
     }
     
     public String Datos(String tabla, String colum,String igual, String par){
       String sql= "SELECT * FROM "+tabla+" WHERE "+igual+"='"+par+"'";

       String dato="";
       try{
          
          ResultSet rs = oCnx.conexion().createStatement().executeQuery(sql);
          while(rs.next()){
           dato= rs.getString(colum);
                
          }
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e.getMessage());
       }
        return dato;
     }
}
