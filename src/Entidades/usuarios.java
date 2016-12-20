/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Pedro Abel
 * usuario admin: admin (12345)
 * usuario operador: operador(12345)
 */
public class usuarios {
    private String usuario;
    private String clave;
    private String estado;

    public usuarios(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public usuarios(String usuario, String clave, String estado, String rol) {
        this.usuario = usuario;
        this.clave = clave;
        this.estado = estado;
        this.rol = rol;
    }

    public usuarios(String usuario) {
        this.usuario = usuario;
    }
    
    private String rol;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
