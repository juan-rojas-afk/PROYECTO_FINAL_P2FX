package co.edu.uniquindio.programacion2.proyectofinalp2.decorator;

import co.edu.uniquindio.programacion2.proyectofinalp2.Service.IReporte;

public class ReporteProductosTop extends ReporteDecorator{
    public ReporteProductosTop(IReporte reporte) {
        super(reporte);
    }

    @Override
    public String getReporte() {
        return super.getReporte()+modelFactory.obtenerProductosTop();
    }
}
