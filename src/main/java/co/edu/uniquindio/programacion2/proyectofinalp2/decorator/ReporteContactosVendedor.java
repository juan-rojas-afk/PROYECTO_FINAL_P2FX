package co.edu.uniquindio.programacion2.proyectofinalp2.decorator;

import co.edu.uniquindio.programacion2.proyectofinalp2.Service.IReporte;

public class ReporteContactosVendedor extends ReporteDecorator{


    public ReporteContactosVendedor(IReporte reporte) {
        super(reporte);
    }

    @Override
    public String getReporte() {

        return super.getReporte()+modelFactory.contactosPorVendedor();
    }
}
