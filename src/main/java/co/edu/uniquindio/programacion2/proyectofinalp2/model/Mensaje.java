package co.edu.uniquindio.programacion2.proyectofinalp2.model;

import java.time.LocalDate;

public class Mensaje {
    public String remitente;
    public String destinatario;
    public String mensaje;
    public LocalDate fecha;

    public Mensaje(){}

    public Mensaje(String remitente, String destinatario, String mensaje, LocalDate fecha) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.mensaje = mensaje;
        this.fecha = fecha;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public LocalDate getFecha(LocalDate fecha) { return fecha;}
}