package co.edu.uniquindio.programacion2.proyectofinalp2.model;


import co.edu.uniquindio.programacion2.proyectofinalp2.Service.IPublicacionObserver;
import co.edu.uniquindio.programacion2.proyectofinalp2.model.builder.VendedorBuilder;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona implements IPublicacionObserver {
    private List<Vendedor>vendedoresAliados = new ArrayList<>();
    private List<Producto>listaProductos = new ArrayList<>();
    private Muro muro = new Muro();

    public Vendedor(){
    }

    public Vendedor(String nombre, String apellido, String direccion, String cedula, Usuario usuario) {
        super(nombre, apellido,cedula, direccion, usuario);
    }

    public List<Vendedor> getVendedoresAliados() {
        return vendedoresAliados;
    }

    public Muro getMuro() {
        return muro;
    }

    public void setMuro(Muro muro) {
        this.muro = muro;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public static VendedorBuilder builder(){
        return new VendedorBuilder();
    }

    public Producto obtenerProducto(String id) {
        Producto producto = null;
        for(Producto producto1 : listaProductos){
            if(producto1.getId().equalsIgnoreCase(id)){
                producto = producto1;
                break;
            }
        }
        return producto;
    }

    @Override
    public void notificar(Publicacion publicacion) {
        muro.getPublicaciones().add(publicacion);

    }

}
