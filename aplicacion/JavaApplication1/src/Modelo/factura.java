/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class factura {
    
    public factura(){
        
    }

    public factura(String idfac, String idped, String fec_fac, String subtot) {
        this.idfac = idfac;
        this.idped = idped;
        this.fec_fac = fec_fac;
        this.subtot = subtot;
    }

    public String getIdfac() {
        return idfac;
    }

    public void setIdfac(String idfac) {
        this.idfac = idfac;
    }

    public String getIdped() {
        return idped;
    }

    public void setIdped(String idped) {
        this.idped = idped;
    }

    public String getFec_fac() {
        return fec_fac;
    }

    public void setFec_fac(String fec_fac) {
        this.fec_fac = fec_fac;
    }

    public String getSubtot() {
        return subtot;
    }

    public void setSubtot(String subtot) {
        this.subtot = subtot;
    }
    String idfac;
    String idped;
    String fec_fac;
    String subtot;
}
