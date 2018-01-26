/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class cliente {

    public cliente() {
     
    }
    
    public String getIdcli() {
        return idcli;
    }

    public void setIdcli(String idcli) {
        this.idcli = idcli;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public cliente(String idcli, String razon, String ruc, String direccion) {
        this.idcli = idcli;
        this.razon = razon;
        this.ruc = ruc;
        this.direccion = direccion;
    }
    String idcli;
    String razon;
    String ruc;
    String direccion;
}
