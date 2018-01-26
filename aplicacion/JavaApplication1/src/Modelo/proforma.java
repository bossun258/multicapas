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
public class proforma {
    

    public String getIdprof() {
        return idprof;
    }

    public void setIdprof(String idprof) {
        this.idprof = idprof;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getIdcli() {
        return idcli;
    }

    public void setIdcli(String idcli) {
        this.idcli = idcli;
    }

    public String getNomcliente() {
        return nomcliente;
    }

    public void setNomcliente(String nomcliente) {
        this.nomcliente = nomcliente;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }
    

    public String getNameprof() {
        return nameprof;
    }

    public void setNameprof(String nameprof) {
        this.nameprof = nameprof;
    }
    String idprof;
    String nameprof;
    String fecha;
    String idcli;
    String nomcliente;
    Float total;

}
