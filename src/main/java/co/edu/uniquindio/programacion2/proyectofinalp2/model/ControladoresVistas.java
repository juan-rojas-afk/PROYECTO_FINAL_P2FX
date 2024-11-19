package co.edu.uniquindio.programacion2.proyectofinalp2.model;

import co.edu.uniquindio.programacion2.proyectofinalp2.viewController.VendedorViewController;

public class ControladoresVistas {
    public VendedorViewController controlador;
    public String nickName;
    public ControladoresVistas(VendedorViewController controlador, String nickName) {
        this.controlador = controlador;
        this.nickName = nickName;
    }

}
