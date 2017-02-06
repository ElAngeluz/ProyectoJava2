/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author parivera
 */
public class FacturaVentasDet {
    private String codigoFactura;
    private int cantidad;
    private String codigoProducto;
    private double costoUnitario;
    private double total;

    /**
     * constructor que se carga cuando se hace la prefacturacion
     * @param codigoFactura
     * @param cantidad
     * @param codigoProducto
     */
    public FacturaVentasDet(String codigoFactura, int cantidad, String codigoProducto) {
        this.codigoFactura = codigoFactura;
        this.cantidad = cantidad;
        this.codigoProducto = codigoProducto;
    }


    public FacturaVentasDet(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
