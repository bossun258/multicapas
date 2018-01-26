/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Generales.conecta;
import Modelo.DetalleProforma;
import Modelo.Temporal;
import Modelo.TemporalProforma;
import Modelo.pedidos;
import Modelo.proforma;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB07-01
 */
public class ln_proforma {
    Connection cn = new conecta().conexion();
    public void regtemp(TemporalProforma ent){
         try{
             CallableStatement sp=cn.prepareCall("{call sp_setTempProf(?,?,?,?,?)}");
             sp.setString(1, ent.getIdtempprof());
             sp.setString(2, ent.getIdprod());
             sp.setString(3, ent.getNomprof());
             sp.setFloat(4, ent.getPrecio());
             sp.setInt(5, ent.getCantidad());
             
             sp.executeUpdate();
  
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null, e.getMessage());
         }
    }
    public void registrar(proforma ent){
           
        try{
         
            CallableStatement sp= cn.prepareCall("{call sp_setProforma(?,?,?,?,?,?)}");
            sp.setString(1, ent.getIdprof());
            sp.setString(2, ent.getNameprof());
            sp.setString(3, ent.getFecha() );
            sp.setString(4, ent.getIdcli());
            sp.setString(5, ent.getNomcliente());
            sp.setFloat(6,  ent.getTotal() );
      
            sp.executeUpdate();
           
            JOptionPane.showMessageDialog(null, "pedido registrado");
           
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
      
    }
    public void detped(DetalleProforma ent){
         try{
             CallableStatement sp=cn.prepareCall("{call sp_setDetProforma(?,?,?,?,?,?)}");
             sp.setString(1, ent.getIdDetalleProforma());
             sp.setString(2, ent.getIdProforma());
             sp.setString(3, ent.getIdProducto());
             sp.setString(4, ent.getNomProducto());
             sp.setFloat(5, ent.getPrecio());
             sp.setInt(6, ent.getCantidad());
             
             sp.executeUpdate();
  
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null, e.getMessage());
         }
     }
}
