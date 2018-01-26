/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Temporal;
import Modelo.pedidos;
import Generales.conecta;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author paul
 */
public class ln_pedido {
    Connection cn = new conecta().conexion();
     public void registrar(pedidos ent){
           
        try{
         
            CallableStatement sp= cn.prepareCall("{call sp_insped(?,?,?,?)}");
            sp.setString(1, ent.getIpped());
            sp.setString(2, ent.getFecha());
            sp.setString(3, ent.getIdcli());
            sp.setString(4, ent.getIdemp());
         
      
            sp.executeUpdate();
           
            JOptionPane.showMessageDialog(null, "pedido registrado");
           
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
      
    } 
     
     public void detped(Temporal ent){
         try{
             CallableStatement sp=cn.prepareCall("{call sp_insdetaped(?,?,?,?)}");
             sp.setString(1, ent.getIddoc());
             sp.setString(2, ent.getIdpro());
             sp.setString(4, ent.getCant());
             sp.setString(3, ent.getPre());
             
             sp.executeUpdate();
  
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null, e.getMessage());
         }
     }
     
       public void regtemp(Temporal ent){
         try{
             CallableStatement sp=cn.prepareCall("{call sp_instemp(?,?,?,?)}");
             sp.setString(1, ent.getIddoc());
             sp.setString(2, ent.getIdpro());
             sp.setString(4, ent.getCant());
             sp.setString(3, ent.getPre());
             
             sp.executeUpdate();
  
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null, e.getMessage());
         }
     }
}
