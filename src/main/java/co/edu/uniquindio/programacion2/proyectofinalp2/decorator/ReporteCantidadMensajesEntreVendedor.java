package co.edu.uniquindio.programacion2.proyectofinalp2.decorator;

import co.edu.uniquindio.programacion2.proyectofinalp2.Service.IReporte;

public class ReporteCantidadMensajesEntreVendedor extends ReporteDecorator{

    public ReporteCantidadMensajesEntreVendedor(IReporte reporte) {
        super(reporte);
    }

    @Override
    public String getReporte() {

        return super.getReporte()+modelFactory.cantidadMensajesEntreVendedores();
    }
}
