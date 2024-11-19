package co.edu.uniquindio.programacion2.proyectofinalp2.decorator;

import co.edu.uniquindio.programacion2.proyectofinalp2.Service.IReporte;

public class ReporteCantidadProductosPublicados extends ReporteDecorator{
    public String nickName;
    public ReporteCantidadProductosPublicados(IReporte reporte, String nickName) {
        super(reporte);
        this.nickName = nickName;
    }


    @Override
    public String getReporte() {
        return super.getReporte()+modelFactory.cantidadProductosPublicados(nickName);
    }

}
