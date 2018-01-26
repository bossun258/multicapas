/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.productos;
import Generales.conecta;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 *
 * @author paul
 */
public class ln_producto {
    conecta oCnx= new conecta();
     Connection cn= new conecta().conexion();

    
    public Boolean registrar(productos ent){
             Boolean exito = false;
        try{
         
            CallableStatement sp= cn.prepareCall("{call sp_insproducto(?,?,?,?)}");
            sp.setString(1, ent.getIdpro());
            sp.setString(2, ent.getDes());
            sp.setString(3, ent.getPre());
            sp.setString(4, ent.getStock());
            sp.executeUpdate();
            exito =true;
            JOptionPane.showMessageDialog(null, "producto registrado");
            cn.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return exito;
    } 
    
    public Boolean modificar(productos ent){
             Boolean exito = false;
        try{
   
            CallableStatement sp= cn.prepareCall("{call sp_modPro(?,?,?,?)}");
            sp.setString(1, ent.getIdpro());
            sp.setString(2, ent.getDes());
            sp.setInt(3, Integer.parseInt(ent.getPre()));
            sp.setInt(4, Integer.parseInt(ent.getStock()));
            sp.executeUpdate();
            exito =true;
            JOptionPane.showMessageDialog(null, "producto modificado");
            cn.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return exito;
    } 
    
        public Boolean eliminar(productos ent){
             Boolean exito = false;
        try{
        
            CallableStatement sp= cn.prepareCall("{call sp_eliPro(?)}");
            sp.setString(1, ent.getIdpro());
        
            sp.executeUpdate();
            exito =true;
            JOptionPane.showMessageDialog(null, "producto eliminado");
            cn.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return exito;
    } 
            
}
