package co.edu.uniquindio.programacion2.proyectofinalp2.mapping.dto;

public record ProductoDto (String nombre,
                           String id,
                           String categoria,
                           double precio,
                           String rutaImagen,
                           String descripcion){



    @Override
    public String toString() {
        return ""+nombre+" precio: "+precio+"-> Descripcion"+descripcion;
    }

}
