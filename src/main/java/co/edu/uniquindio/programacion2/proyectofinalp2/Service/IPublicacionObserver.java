package co.edu.uniquindio.programacion2.proyectofinalp2.Service;

import co.edu.uniquindio.programacion2.proyectofinalp2.model.Publicacion;


public interface IPublicacionObserver {
    void notificar(Publicacion publicacion);
}
