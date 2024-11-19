package co.edu.uniquindio.programacion2.proyectofinalp2.controller;

import co.edu.uniquindio.programacion2.proyectofinalp2.factory.ModelFactory;
import co.edu.uniquindio.programacion2.proyectofinalp2.mapping.dto.ProductoDto;
import co.edu.uniquindio.programacion2.proyectofinalp2.mapping.dto.SugerenciaDto;
import co.edu.uniquindio.programacion2.proyectofinalp2.model.Comentario;
import co.edu.uniquindio.programacion2.proyectofinalp2.model.Mensaje;
import co.edu.uniquindio.programacion2.proyectofinalp2.model.Publicacion;
import co.edu.uniquindio.programacion2.proyectofinalp2.viewController.MarketPlaceViewController;

import java.util.List;

public class VendedorController {
    private ModelFactory modelFactory;
    private MarketPlaceViewController marketPlaceViewController;
    public VendedorController() {
        modelFactory = ModelFactory.getInstance();
        marketPlaceViewController = MarketPlaceViewController.getInstance();
    }
    public List<ProductoDto> obtenerlistaProductos(String nickNameTab) {
        return modelFactory.obtenerListaProductosVendedor(nickNameTab);
    }

    public boolean agregarProducto(ProductoDto productoDto, String nickNameTab) {
        return modelFactory.agregarProducto(productoDto,nickNameTab);
    }

    public boolean publicarProducto(String idProducto, String nickNameTab) {
        return  modelFactory.publicarProducto(idProducto,nickNameTab);
    }


    public List<Publicacion> obtenerPublicaciones(String nickNameTab) {
        return modelFactory.obtenerPublicaciones(nickNameTab);
    }

    public boolean agregarComentario(Comentario comentario, String idProducto, String nickNameTab) {
        return modelFactory.agregarComentario(comentario,idProducto,nickNameTab);
    }

    public boolean agregarLike(Publicacion publicacionSeleccionada, String nickNameTab) {
        return modelFactory.agregarLike(publicacionSeleccionada,nickNameTab);
    }

    public boolean actualizarProducto(ProductoDto productoActualizado, String nickNameTab) {
        return modelFactory.actualizarProducto(productoActualizado,nickNameTab);
    }

    public boolean actualizarProductoPublicado(ProductoDto productoActualizado, String nickName) {
        return modelFactory.actualizarProductoPublicado(productoActualizado,nickName);
    }

    public boolean eliminarProducto(String idProducto, String nickNameTab) {
        return modelFactory.eliminarProducto(idProducto,nickNameTab);
    }

    public boolean eliminarProductoPublicado(String idProducto, String nickNameTab) {
        return modelFactory.eliminarProductoPublicado(idProducto,nickNameTab);
    }

    public boolean productoVendido(String idProducto, String nickNameTab) {
        return modelFactory.productoVendido(idProducto,nickNameTab);
    }

    public List<SugerenciaDto> listaSugerencias(String nickName) {
        return modelFactory.listaSugerencias(nickName);
    }

    public boolean agregarContacto(String agregar, String usuarioActual) {
        return modelFactory.agregarContacto(agregar,usuarioActual);
    }

    public void publicarProductoSuscrito(Publicacion publicacion) {

    }

    public List<ProductoDto> obtener(String nickName) {
        return modelFactory.obtener(nickName);
    }

    public ProductoDto obtenerProductoAlido(String nickName,String idProducto) {
        return modelFactory.obtenerProductoAliado(nickName,idProducto);
    }

    public List<SugerenciaDto> obtenerUsuarioContacto(String nickName) {
        return modelFactory.obtenerUsuarioContacto(nickName);
    }


    public void actualizarViews() {
        marketPlaceViewController.actualizarViews();
    }

    public String obtenerMensajesVendedor(String nickNameTab, String nickNameSeleccion) {
        return modelFactory.obtenerMensajesVendedor(nickNameTab,nickNameSeleccion);
    }

    public boolean enviarMensaje(Mensaje mensaje) {
        return modelFactory.enviarMensaje(mensaje);
    }

    public String getUsuarioActual() {
        return  modelFactory.getUsuarioActual();
    }

    public String obtenerAdmin() {
        return modelFactory.obtenerAdmin().usuario.getNickUsuario();
    }
}

