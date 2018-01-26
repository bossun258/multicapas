/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author MAQ
 */
public class DetalleProforma {
    public void DetalleProforma(){
    
    }
    String IdDetalleProforma;
    String IdProforma;
    String IdProducto;
    String NomProducto;
    Float precio;
    Integer cantidad;

    public String getIdDetalleProforma() {
        return IdDetalleProforma;
    }

    public void setIdDetalleProforma(String IdDetalleProforma) {
        this.IdDetalleProforma = IdDetalleProforma;
    }
    
    public String getIdProforma() {
        return IdProforma;
    }

    public void setIdProforma(String IdProforma) {
        this.IdProforma = IdProforma;
    }

    public String getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(String IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getNomProducto() {
        return NomProducto;
    }

    public void setNomProducto(String NomProducto) {
        this.NomProducto = NomProducto;
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
    
}
