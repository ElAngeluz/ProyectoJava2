/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.sql.Date;

/**
 *
 * @author parivera
 */
public class FacturaVentacCab {
    
    private String estado;
    private String codigoFactura;
    private String idCliente;
    private Date fecha;
    private double iva;
    private double subtotal;
    private double total;
    
    public FacturaVentacCab(String estado, String codigoFactura) {
        this.estado = estado;
        this.codigoFactura = codigoFactura;
    }

    public FacturaVentacCab(String estado, String codigoFactura, String idCliente, Date fecha, double iva, double subtotal, double total) {
        this.estado = estado;
        this.codigoFactura = codigoFactura;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.iva = iva;
        this.subtotal = subtotal;
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
