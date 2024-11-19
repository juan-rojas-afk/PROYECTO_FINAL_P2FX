package co.edu.uniquindio.programacion2.proyectofinalp2.model;

public class Reporte {
    private String nombre;
    public Reporte(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String mensaje;
}
