package co.edu.uniquindio.programacion2.proyectofinalp2.mapping.dto;

import co.edu.uniquindio.programacion2.proyectofinalp2.model.Usuario;

public record VendedorDto (String nombre,
                           String apellido,
                           String cedula,
                           String direccion,
                           Usuario usuario){
}
