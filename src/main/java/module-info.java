module co.edu.uniquindio.programacion2.proyectofinalp2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.programacion2.proyectofinalp2 to javafx.fxml;
    exports co.edu.uniquindio.programacion2.proyectofinalp2;

    opens co.edu.uniquindio.programacion2.proyectofinalp2.viewController;
    exports co.edu.uniquindio.programacion2.proyectofinalp2.viewController;

    opens co.edu.uniquindio.programacion2.proyectofinalp2.controller;
    exports co.edu.uniquindio.programacion2.proyectofinalp2.controller;
}