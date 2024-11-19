package co.edu.uniquindio.programacion2.proyectofinalp2.controller;

import co.edu.uniquindio.programacion2.proyectofinalp2.factory.ModelFactory;
import co.edu.uniquindio.programacion2.proyectofinalp2.mapping.dto.SugerenciaDto;
import co.edu.uniquindio.programacion2.proyectofinalp2.model.Usuario;

import java.util.List;

public class MarketPlaceController {
    private static ModelFactory modelFactory;

    public MarketPlaceController() {
        modelFactory = ModelFactory.getInstance();
    }


    public List<Usuario> obtenerListaUsuariosVendedores() {
        return modelFactory.obtenerListaUsuariosVendedores();
    }

    public String obtenerUsuarioActual() {
        return modelFactory.obtenerUsuarioActual();
    }


    public List<SugerenciaDto> obtenerUsuarioContacto(String usuarioActual) {
        return modelFactory.obtenerUsuarioContacto(usuarioActual);
    }
}
