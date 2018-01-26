/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.cliente;
import Modelo.empleados;
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
public class ln_emp {
    conecta oCnx= new conecta();
     Connection cn= new conecta().conexion();
    public ArrayList<empleados>buscar(empleados ent){
      ArrayList<empleados> lista = new ArrayList();
      
      try{
          CallableStatement sp=oCnx.conexion().prepareCall("{call sp_buscarEmp(?)}");
          sp.setString(1, ent.getIdemp());
          ResultSet rs=sp.executeQuery();
        
          while(rs.next()){
         lista.add(new empleados(rs.getString("idemp"), 
                               rs.getString("apeemp"),
                               rs.getString("diremp")));
          }
          
      }catch(SQLException e){
          System.out.println(e.getMessage());
      }
      return lista;
    }
    
    public Boolean registrar(empleados ent){
             Boolean exito = false;
        try{
         
            CallableStatement sp= cn.prepareCall("{call sp_insEmp(?,?,?)}");
            sp.setString(1, ent.getIdemp());
            sp.setString(2, ent.getApeemp());
            sp.setString(3, ent.getDiremp());
            sp.executeUpdate();
            exito =true;
            JOptionPane.showMessageDialog(null, "empleados registrado");
            cn.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return exito;
    } 
    
    public Boolean modificar(empleados ent){
             Boolean exito = false;
        try{
   
            CallableStatement sp= cn.prepareCall("{call sp_modEmp(?,?,?)}");
            sp.setString(1, ent.getIdemp());
            sp.setString(2, ent.getApeemp());
            sp.setString(3, ent.getDiremp());
            sp.executeUpdate();
            exito =true;
            JOptionPane.showMessageDialog(null, "empleado modificado");
            cn.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return exito;
    } 
    
        public Boolean eliminar(empleados ent){
             Boolean exito = false;
        try{
        
            CallableStatement sp= cn.prepareCall("{call sp_eliEmp(?)}");
            sp.setString(1, ent.getIdemp());
        
            sp.executeUpdate();
            exito =true;
            JOptionPane.showMessageDialog(null, "empleado eliminado");
            cn.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return exito;
    } 
            
}
