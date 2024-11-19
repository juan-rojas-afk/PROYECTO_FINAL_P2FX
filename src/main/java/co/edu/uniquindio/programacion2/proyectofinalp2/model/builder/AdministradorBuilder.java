package co.edu.uniquindio.programacion2.proyectofinalp2.model.builder;

import co.edu.uniquindio.programacion2.proyectofinalp2.model.Administrador;
import co.edu.uniquindio.programacion2.proyectofinalp2.model.Usuario;

public class AdministradorBuilder {
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String direccion;
    protected Usuario usuario;

    public AdministradorBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public AdministradorBuilder usuario(Usuario usuario) {
        this.usuario = usuario;
        return this;
    }

    public AdministradorBuilder direccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public AdministradorBuilder cedula(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public AdministradorBuilder apellido(String apellido) {
        this.apellido = apellido;
        return this;
    }
    public Administrador build(){
        return new Administrador(nombre,apellido,cedula,direccion,usuario);
    }
}
