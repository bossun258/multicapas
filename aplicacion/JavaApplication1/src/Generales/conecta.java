/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generales;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class conecta {
    Connection conect = null;
   public  Connection conexion(){
      try {
             
           //Cargamos el Driver MySQL
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           conect = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=ventas;user =sa;password=123");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Error "+e);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error "+e);
    }
        return conect;    
}
}
