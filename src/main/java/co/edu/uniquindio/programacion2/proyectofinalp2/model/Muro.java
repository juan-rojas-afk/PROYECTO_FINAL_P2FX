package co.edu.uniquindio.programacion2.proyectofinalp2.model;

import java.util.ArrayList;
import java.util.List;

public class Muro {
    public List<Mensaje> mensajes = new ArrayList<>();
    public List<Publicacion> publicaciones = new ArrayList<>();

    public Muro() {}

    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }
}
