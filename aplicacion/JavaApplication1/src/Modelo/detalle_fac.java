/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class detalle_fac {
    public detalle_fac(){
        
    }

    public detalle_fac(String idfac, String idpro, String pre, String cant) {
        this.idfac = idfac;
        this.idpro = idpro;
        this.pre = pre;
        this.cant = cant;
    }

    public String getIdfac() {
        return idfac;
    }

    public void setIdfac(String idfac) {
        this.idfac = idfac;
    }

    public String getIdpro() {
        return idpro;
    }

    public void setIdpro(String idpro) {
        this.idpro = idpro;
    }

    public String getPre() {
        return pre;
    }

    public void setPre(String pre) {
        this.pre = pre;
    }

    public String getCant() {
        return cant;
    }

    public void setCant(String cant) {
        this.cant = cant;
    }
   
    String idfac;
    String idpro;
    String pre;
    String cant;
}
