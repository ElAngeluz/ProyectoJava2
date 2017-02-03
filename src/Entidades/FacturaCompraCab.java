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
public class FacturaCompraCab {
    private String estado;
    private String codigoFactura;
    private String idProveedor;
    private Date fecha;
    private double iva;
    private double subtotal;
    private double total;

    public FacturaCompraCab(String estado, String codigoFactura, Date fecha) {
        this.estado = estado;
        this.codigoFactura = codigoFactura;
        this.fecha = fecha;
    }

    public FacturaCompraCab(String codigoFactura, String idProveedor, String estado, Date fecha, double iva, double subtotal, double total) {
        this.estado = estado;
        this.codigoFactura = codigoFactura;
        this.idProveedor = idProveedor;
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
        return idProveedor;
    }

    public void setIdCliente(String idProveedor) {
        this.idProveedor = idProveedor;
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
