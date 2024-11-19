package co.edu.uniquindio.programacion2.proyectofinalp2.decorator;

import co.edu.uniquindio.programacion2.proyectofinalp2.Service.IReporte;
import co.edu.uniquindio.programacion2.proyectofinalp2.factory.ModelFactory;

public abstract class ReporteDecorator implements IReporte {
    protected IReporte reporte;
    public ModelFactory modelFactory=ModelFactory.getInstance();

    public ReporteDecorator(IReporte reporte) {
        this.reporte = reporte;
    }

    @Override
    public String getReporte() {
        return reporte.getReporte();
    }

}