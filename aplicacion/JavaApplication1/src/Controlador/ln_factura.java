/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.factura;
import Generales.conecta;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author paul
 */
public class ln_factura {
    Connection cn = new conecta().conexion();
     public void registrar(factura ent){
           
        try{
         
            CallableStatement sp= cn.prepareCall("{call sp_insfac(?,?,?,?,?,?)}");
            sp.setString(1, ent.getIdfac());
            sp.setString(2, ent.getIdped());
            sp.setString(3, ent.getFec_fac());
            sp.setString(4, ent.getSubtot());
            sp.setDouble(5, (Double.parseDouble(ent.getSubtot())*0.18));
            sp.setDouble(6, (Double.parseDouble(ent.getSubtot())*1.18));
            sp.executeUpdate();
           
            JOptionPane.showMessageDialog(null, "factura registrada");
            cn.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
      
    } 
}
