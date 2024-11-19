package co.edu.uniquindio.programacion2.proyectofinalp2.model;

public class MensajesEntreVendedores {
    public String remitente;

    public MensajesEntreVendedores(String remitente, String destinatario, int cantidad) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.cantidad = cantidad;
    }

    public String destinatario;
    int cantidad;
}
