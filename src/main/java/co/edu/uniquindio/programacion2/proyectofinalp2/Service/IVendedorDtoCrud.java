package co.edu.uniquindio.programacion2.proyectofinalp2.Service;

import co.edu.uniquindio.programacion2.proyectofinalp2.mapping.dto.VendedorDto;


public interface IVendedorDtoCrud {
    boolean agregarVendedorDto(VendedorDto vendedorDto);
    boolean actualizarVendedor(VendedorDto vendedorOld,VendedorDto vendedorActualizado);
    boolean eliminarVendedor(VendedorDto vendedorDto);
}
