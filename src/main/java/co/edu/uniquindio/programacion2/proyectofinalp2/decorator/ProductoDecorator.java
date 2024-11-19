package co.edu.uniquindio.programacion2.proyectofinalp2.decorator;

import co.edu.uniquindio.programacion2.proyectofinalp2.Service.IProducto;
import co.edu.uniquindio.programacion2.proyectofinalp2.mapping.dto.ProductoDto;

public class ProductoDecorator implements IProducto {
    protected ProductoDto productoDto;
    public String estadoProducto;

    public ProductoDecorator(ProductoDto productoDto, String estadoProducto) {
        this.productoDto = productoDto;
        this.estadoProducto = estadoProducto;
    }

    public ProductoDto getProductoDto() {
        return productoDto;
    }

    @Override
    public String getNombre() {
        return this.productoDto.nombre();
    }

    @Override
    public String getId() {
        return productoDto.id();
    }

    @Override
    public String getCategoria() {
        return productoDto.categoria();
    }

    @Override
    public double getPrecio() {
        return productoDto.precio();
    }

    @Override
    public String getRutaImagen() {
        return productoDto.rutaImagen();
    }

    @Override
    public String getDescripcion() {
        return productoDto.descripcion();
    }

    @Override
    public String getEstado() {
        return estadoProducto;
    }
}