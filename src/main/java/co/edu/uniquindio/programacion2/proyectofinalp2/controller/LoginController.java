package co.edu.uniquindio.programacion2.proyectofinalp2.controller;

import co.edu.uniquindio.programacion2.proyectofinalp2.factory.ModelFactory;
import co.edu.uniquindio.programacion2.proyectofinalp2.mapping.dto.UsuarioDto;

import java.util.List;

public class LoginController {
    private ModelFactory modelFactory;
    public LoginController() {
        modelFactory = ModelFactory.getInstance();
    }
    public List<UsuarioDto> obtenerListaUsuarios() {
        return modelFactory.obtenerListaUsuarioDto();
    }

    public String obtenerUsuario(UsuarioDto usuario) {
        return modelFactory.obtenerUsuario(usuario);
    }

    public boolean validarUsuario(UsuarioDto usuario) {
        return modelFactory.validaUsuario(usuario);
    }

    public void iniciarVista(String nickname) {
        modelFactory.iniciarVista(nickname);
    }
}