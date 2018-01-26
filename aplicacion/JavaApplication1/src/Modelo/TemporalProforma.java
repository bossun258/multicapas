/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author LAB07-01
 */
public class TemporalProforma {
    
    public void TemporalProforma(){
        
    }
    

    public String getIdtempprof() {
        return idtempprof;
    }

    public void setIdtempprof(String idtempprof) {
        this.idtempprof = idtempprof;
    }

    public String getIdprod() {
        return idprod;
    }

    public void setIdprod(String idprod) {
        this.idprod = idprod;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getNomprof() {
        return nomprof;
    }

    public void setNomprof(String nomprof) {
        this.nomprof = nomprof;
    }
    
    String idtempprof;
    String idprod;
    String nomprof;
    Float precio;
    Integer cantidad;
}
