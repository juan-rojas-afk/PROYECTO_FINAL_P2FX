package co.edu.uniquindio.programacion2.proyectofinalp2.model;

import co.edu.uniquindio.programacion2.proyectofinalp2.model.builder.ProductoBuilder;
import javafx.scene.image.Image;

public class Producto {
    private String nombre;
    private String id;
    private String categoria;
    private double precio;
    private String rutaImagen;
    private Image imagen;
    private String descripcion;



    public Producto (String nombre, String id, String categoria, double precio, String imagen,
                    String descripcion) {
        this.id = id;
        this.categoria = categoria;
        this.rutaImagen = imagen;
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = new Image("file:" + rutaImagen);
    }
    public Producto(){}



    public Image getImagen() { return imagen;}


    public String getNombre() {
        return nombre;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getId() {
        return id;
    }


    public static ProductoBuilder builder(){
        return new ProductoBuilder();
    }
}
