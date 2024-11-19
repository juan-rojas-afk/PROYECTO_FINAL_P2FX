package co.edu.uniquindio.programacion2.proyectofinalp2.decorator;

import co.edu.uniquindio.programacion2.proyectofinalp2.mapping.dto.ProductoDto;

public class EstadoProductoDecorator extends ProductoDecorator{

    public EstadoProductoDecorator(ProductoDto productoDto, String estadoProducto) {
        super(productoDto, estadoProducto);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public String getCategoria() {
        return super.getCategoria();
    }

    @Override
    public double getPrecio() {
        return super.getPrecio();
    }

    @Override
    public String getRutaImagen() {
        return super.getRutaImagen();
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion();
    }

    @Override
    public String getEstado() {
        return super.getEstado();
    }
}
