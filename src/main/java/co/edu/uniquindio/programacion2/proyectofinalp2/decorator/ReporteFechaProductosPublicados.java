package co.edu.uniquindio.programacion2.proyectofinalp2.decorator;

import co.edu.uniquindio.programacion2.proyectofinalp2.Service.IReporte;

import java.time.LocalDate;

public class ReporteFechaProductosPublicados extends ReporteDecorator{
    public LocalDate fechaPublicacion;
    public ReporteFechaProductosPublicados(IReporte reporte, LocalDate fechaPublicacion) {
        super(reporte);
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String getReporte() {
        return super.getReporte()+modelFactory.obtenerPublicacionesFecha(fechaPublicacion);
    }
}
