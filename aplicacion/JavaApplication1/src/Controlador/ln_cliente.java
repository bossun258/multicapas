/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.cliente;
import Generales.conecta;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author paul
 */
public class ln_cliente {
    conecta oCnx= new conecta();
     Connection cn= new conecta().conexion();
    public ArrayList<cliente>buscar(cliente ent){
      ArrayList<cliente> lista = new ArrayList();
      
      try{
          CallableStatement sp=oCnx.conexion().prepareCall("{call sp_buscarCliente(?)}");
          sp.setString(1, ent.getIdcli());
          ResultSet rs=sp.executeQuery();
        
          while(rs.next()){
         lista.add(new cliente(rs.getString("idcli"), 
                               rs.getString("razon"),
                               rs.getString("ruc"), 
                               rs.getString("direccion")));
          }
          
      }catch(SQLException e){
          System.out.println(e.getMessage());
      }
      return lista;
    }
    
    public Boolean registrar(cliente ent){
             Boolean exito = false;
        try{
         
            CallableStatement sp= cn.prepareCall("{call sp_inscliente(?,?,?,?)}");
            sp.setString(1, ent.getIdcli());
            sp.setString(2, ent.getRazon());
            sp.setString(3, ent.getRuc());
            sp.setString(4, ent.getDireccion());
            sp.executeUpdate();
            exito =true;
            JOptionPane.showMessageDialog(null, "cliente registrado");
            cn.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return exito;
    } 
    
    public Boolean modificar(cliente ent){
             Boolean exito = false;
        try{
   
            CallableStatement sp= cn.prepareCall("{call sp_modcliente(?,?,?,?)}");
            sp.setString(1, ent.getIdcli());
            sp.setString(2, ent.getRazon());
            sp.setString(3, ent.getRuc());
            sp.setString(4, ent.getDireccion());
            sp.executeUpdate();
            exito =true;
            JOptionPane.showMessageDialog(null, "cliente modificado");
            cn.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return exito;
    } 
    
        public Boolean eliminar(cliente ent){
             Boolean exito = false;
        try{
        
            CallableStatement sp= cn.prepareCall("{call sp_elicliente(?)}");
            sp.setString(1, ent.getIdcli());
        
            sp.executeUpdate();
            exito =true;
            JOptionPane.showMessageDialog(null, "cliente eliminado");
            cn.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return exito;
    } 
            
}
