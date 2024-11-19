package co.edu.uniquindio.programacion2.proyectofinalp2.controller;

import co.edu.uniquindio.programacion2.proyectofinalp2.factory.ModelFactory;
import co.edu.uniquindio.programacion2.proyectofinalp2.mapping.dto.VendedorDto;
import co.edu.uniquindio.programacion2.proyectofinalp2.model.Administrador;
import co.edu.uniquindio.programacion2.proyectofinalp2.model.Usuario;

import java.util.List;

public class AdministradorController {
    ModelFactory modelFactory;
    public AdministradorController(){
        modelFactory = ModelFactory.getInstance();

    }
    public List<Usuario> obtenerUsuarios() {
        return modelFactory.obtenerListaUsuario();
    }

    public List<VendedorDto> obtenerVendedores() {
        return modelFactory.obtenerListaVendedorDto();
    }

    public boolean agregarVendedor(VendedorDto vendedorDto) {
        return modelFactory.agregarVendedorDto(vendedorDto);
    }

    public boolean actualizarVendedor(VendedorDto vendedorOld, VendedorDto vendedorActualizado) {
        return modelFactory.actualizarVendedor(vendedorOld,vendedorActualizado);
    }

    public boolean eliminarVendedor(VendedorDto vendedorDto) {
        return modelFactory.eliminarVendedor(vendedorDto);
    }

    public String contactosPorVendedor() {
        return modelFactory.contactosPorVendedor();
    }

    public Administrador obtenerAdmin() {
        return modelFactory.obtenerAdmin();
    }
}
