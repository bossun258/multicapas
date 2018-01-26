/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Alumno
 */
public class empleados {
    
    

    public empleados(String idemp, String apeemp, String diremp) {
        this.idemp = idemp;
        this.apeemp = apeemp;
        this.diremp = diremp;
    }

    public empleados() {
      
    }

    public String getIdemp() {
        return idemp;
    }

    public void setIdemp(String idemp) {
        this.idemp = idemp;
    }

    public String getApeemp() {
        return apeemp;
    }

    public void setApeemp(String apeemp) {
        this.apeemp = apeemp;
    }

    public String getDiremp() {
        return diremp;
    }

    public void setDiremp(String diremp) {
        this.diremp = diremp;
    }
    String idemp;
    String apeemp;
    String diremp;
}
