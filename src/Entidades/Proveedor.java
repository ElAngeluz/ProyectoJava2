/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Johanna Parrales
 */
public class Proveedor {
    private String codigo;
    private String nombre;
    private String producto;
    private String direccion;
    private String telefono;

    public Proveedor(String id, String nombre, String producto, String direccion, String telefono) {
        this.codigo = id;
        this.nombre = nombre;
        this.producto = producto;
        this.direccion = direccion;
        this.telefono = telefono;
    }    

    public Proveedor(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the codigo
     */
    public String getId() {
        return codigo;
    }

    /**
     * @param id the codigo to set
     */
    public void setId(String id) {
        this.codigo = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    }
