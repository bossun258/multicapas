/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.user;
import Generales.conecta;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ln_usuario {
     conecta oCnx= new conecta();
       ResultSet rs=null;
     
     public void RegUser(user ent){
          try{
         
            CallableStatement sp= oCnx.conexion().prepareCall("{call sp_insuser(?,?,?,?,?)}");
            sp.setString(1, ent.getIduser());
            sp.setString(2, ent.getUser());
            sp.setString(3, ent.getApeuser());
            sp.setString(4, ent.getPass());
            sp.setString(5, ent.getT_ac());
            sp.executeUpdate();
          
            JOptionPane.showMessageDialog(null, "usuario registrado");
            oCnx.conexion().close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
     
    }
     
     public ResultSet SearchUser(user ent){
          try{
         
            CallableStatement sp= oCnx.conexion().prepareCall("{call sp_bus_user(?)}");
            sp.setString(1, ent.getIduser());
            rs=   sp.executeQuery();
            
            oCnx.conexion().close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
          return rs;
     }
     
     public void UpdUser(user ent){
         try{
         
            CallableStatement sp= oCnx.conexion().prepareCall("{call sp_moduser(?,?,?,?,?)}");
            sp.setString(1, ent.getIduser());
            sp.setString(2, ent.getUser());
            sp.setString(3, ent.getApeuser());
            sp.setString(4, ent.getPass());
            sp.setString(5, ent.getT_ac());
            sp.executeUpdate();
          
            JOptionPane.showMessageDialog(null, "usuario modificado");
            oCnx.conexion().close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
     }
     
}
