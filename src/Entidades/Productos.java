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
public class Productos {
    private int codigo;
    private String nombre;
    private String marca;
    private Date fecha_Caducidad;
    private int cantidad;
    private String precio;
    private String iva;

    public Productos(int codigo, String nombre, String marca, Date fecha_Caducidad, int cantidad, String precio, String iva) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.fecha_Caducidad = fecha_Caducidad;
        this.cantidad = cantidad;
        this.precio = precio;
        this.iva = iva;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }
        

    public Productos(int _codigo) {
        codigo = _codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getFecha_Caducidad() {
        return fecha_Caducidad;
    }

    public void setFecha_Caducidad(Date fecha_Caducidad) {
        this.fecha_Caducidad = fecha_Caducidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
