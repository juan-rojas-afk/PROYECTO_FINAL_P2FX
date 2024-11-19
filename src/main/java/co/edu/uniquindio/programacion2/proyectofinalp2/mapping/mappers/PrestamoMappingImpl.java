package co.edu.uniquindio.programacion2.proyectofinalp2.mapping.mappers;


import co.edu.uniquindio.programacion2.proyectofinalp2.Service.IPrestamoMapping;
import co.edu.uniquindio.programacion2.proyectofinalp2.mapping.dto.ProductoDto;
import co.edu.uniquindio.programacion2.proyectofinalp2.mapping.dto.SugerenciaDto;
import co.edu.uniquindio.programacion2.proyectofinalp2.mapping.dto.UsuarioDto;
import co.edu.uniquindio.programacion2.proyectofinalp2.mapping.dto.VendedorDto;
import co.edu.uniquindio.programacion2.proyectofinalp2.model.Producto;
import co.edu.uniquindio.programacion2.proyectofinalp2.model.Usuario;
import co.edu.uniquindio.programacion2.proyectofinalp2.model.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class PrestamoMappingImpl implements IPrestamoMapping {
    @Override
    public List<VendedorDto> getVendedores(List<Vendedor> listaVendedor) {
        if(listaVendedor == null){
            return null;
        }

        List<VendedorDto>listaVendedorDto = new ArrayList<VendedorDto>(listaVendedor.size());
        for (Vendedor vendedor: listaVendedor){
            listaVendedorDto.add(vendedorToVendedorDto(vendedor));
        }
        return listaVendedorDto;
    }

    @Override
    public VendedorDto vendedorToVendedorDto(Vendedor vendedor) {
        return new VendedorDto(vendedor.getNombre(),
                vendedor.getApellido(),
                vendedor.getCedula(),
                vendedor.getDireccion(),
                vendedor.getUsuario());
    }

    @Override
    public Vendedor vendedorDtoToVendedor(VendedorDto vendedorDto) {
        return new Vendedor(vendedorDto.nombre(),
                vendedorDto.apellido(),
                vendedorDto.cedula(),
                vendedorDto.direccion(),
                vendedorDto.usuario());
    }



    @Override
    public List<UsuarioDto> usuarioToUsuarioDto(List<Usuario> listaUsuarios) {
        List<UsuarioDto> usuariosDto= new ArrayList<UsuarioDto>();
        for (Usuario usuario: listaUsuarios){
            usuariosDto.add(new UsuarioDto(usuario.getNickUsuario(),usuario.getContrasena()));
        }

        return usuariosDto;
    }

    @Override
    public List<ProductoDto> listaProductosTolistaProductosDto(List<Producto> productos) {
        List<ProductoDto>productosDto=new ArrayList<>();
        for (Producto producto: productos){
            productosDto.add(productoToProductoDto(producto));
        }
        return productosDto;
    }

    @Override
    public Producto ProductoDtoToProducto(ProductoDto productoDto) {
        return new Producto(productoDto.nombre(),
                productoDto.id(),
                productoDto.categoria(),
                productoDto.precio(),
                productoDto.rutaImagen(),
                productoDto.descripcion());
    }

    @Override
    public List<SugerenciaDto> VendedorToSugerenciaDto(List<Vendedor> vendedores) {
        List<SugerenciaDto>sugerenciaDtos = new ArrayList<>();
        for (Vendedor vendedor: vendedores){
            sugerenciaDtos.add(new SugerenciaDto(vendedor.getNombre(),vendedor.usuario.getNickUsuario()));
        }
        return sugerenciaDtos;
    }

    private ProductoDto productoToProductoDto(Producto producto) {
        return new ProductoDto(producto.getNombre(),
                producto.getId(),
                producto.getCategoria(),
                producto.getPrecio(),
                producto.getRutaImagen(),
                producto.getDescripcion());
    }


}
