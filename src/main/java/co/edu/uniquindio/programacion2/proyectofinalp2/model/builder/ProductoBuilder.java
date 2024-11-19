package co.edu.uniquindio.programacion2.proyectofinalp2.model.builder;

import co.edu.uniquindio.programacion2.proyectofinalp2.model.Producto;
import javafx.scene.image.Image;

public class ProductoBuilder {
    protected String nombre;
    protected String id;
    protected String categoria;
    protected double precio;
    protected String rutaImagen;
    protected String descripcion;
    protected Image imagen;


    public ProductoBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public  ProductoBuilder rutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
        this.imagen = new Image("file:" + rutaImagen);
        return this;
    }

    public ProductoBuilder precio(double precio) {
        this.precio = precio;
        return this;
    }

    public ProductoBuilder categoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public ProductoBuilder id(String id) {
        this.id = id;
        return this;
    }


    public ProductoBuilder descripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public ProductoBuilder imagen(Image imagen) {
        this.imagen = imagen;
        return this;
    }

    public Producto build(){
        return new Producto(nombre,id,categoria,precio,rutaImagen,descripcion);
    }
}
