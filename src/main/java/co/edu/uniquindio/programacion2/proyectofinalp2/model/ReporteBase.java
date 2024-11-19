package co.edu.uniquindio.programacion2.proyectofinalp2.model;

import co.edu.uniquindio.programacion2.proyectofinalp2.Service.IReporte;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ReporteBase implements IReporte {

    @Override
    public String getReporte() {
        return "Reporte estadisticas MarketPlace\n"+
                "Fecha: "+(new SimpleDateFormat("dd/MM/yyyy").format(new Date()))+"\n"+
                "Reporte realizado por: Raul\n\nInformación del reporte:\n";
    }
}
