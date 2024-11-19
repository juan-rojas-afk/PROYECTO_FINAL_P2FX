package co.edu.uniquindio.programacion2.proyectofinalp2.Service;

import co.edu.uniquindio.programacion2.proyectofinalp2.mapping.dto.ProductoDto;
import co.edu.uniquindio.programacion2.proyectofinalp2.mapping.dto.SugerenciaDto;
import co.edu.uniquindio.programacion2.proyectofinalp2.mapping.dto.UsuarioDto;
import co.edu.uniquindio.programacion2.proyectofinalp2.mapping.dto.VendedorDto;
import co.edu.uniquindio.programacion2.proyectofinalp2.model.Producto;
import co.edu.uniquindio.programacion2.proyectofinalp2.model.Usuario;
import co.edu.uniquindio.programacion2.proyectofinalp2.model.Vendedor;

import java.util.List;

public interface IPrestamoMapping {
    List<VendedorDto>getVendedores(List<Vendedor> listaVendedor);
    VendedorDto vendedorToVendedorDto(Vendedor vendedor);
    Vendedor vendedorDtoToVendedor(VendedorDto vendedorDto);
    List<UsuarioDto> usuarioToUsuarioDto(List<Usuario> listaUsuarios);
    List<ProductoDto> listaProductosTolistaProductosDto(List<Producto> productos);
    Producto ProductoDtoToProducto(ProductoDto productoDto);

    List<SugerenciaDto> VendedorToSugerenciaDto(List<Vendedor> vendedors);
}
