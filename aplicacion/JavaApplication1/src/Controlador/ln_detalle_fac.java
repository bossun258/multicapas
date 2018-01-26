/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.detalle_fac;
import Generales.conecta;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author paul
 */
public class ln_detalle_fac {
     Connection cn = new conecta().conexion();
     public void registrar(detalle_fac ent){
           
        try{
         
            CallableStatement sp= cn.prepareCall("{call sp_detfac(?,?,?,?,?)}");
            sp.setString(1, ent.getIdfac());
            sp.setString(2, ent.getIdpro());
            sp.setString(3, ent.getPre());
            sp.setString(4, ent.getCant());
            //costo
            int costo=Integer.parseInt(ent.getCant())*Integer.parseInt(ent.getPre());
            sp.setString(5, (String.valueOf(costo)));
 
            sp.executeUpdate();
           
          
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
      
    } 
}
