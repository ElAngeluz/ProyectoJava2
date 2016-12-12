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
    
    public Productos(int _codigo, String _nombre, String _marca, Date _fechaCadu, int _cantidad){
        codigo = _codigo;
        nombre = _nombre;
        marca = _marca;
        fecha_Caducidad = _fechaCadu;
        cantidad = _cantidad;
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
