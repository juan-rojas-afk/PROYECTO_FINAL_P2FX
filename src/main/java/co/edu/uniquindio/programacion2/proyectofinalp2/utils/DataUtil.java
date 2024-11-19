package co.edu.uniquindio.programacion2.proyectofinalp2.utils;

import co.edu.uniquindio.programacion2.proyectofinalp2.model.*;

public class DataUtil {
    public static MarketPlace inicializarDatos() {
        MarketPlace marketPlace = new MarketPlace();
        Administrador administrador = Administrador.builder()
                .nombre("Raul")
                .apellido("Perez")
                .cedula("987644")
                .usuario(new Usuario("admin", "admin", "987644"))
                .direccion("la casa")
                .build();
        marketPlace.setAdministrador(administrador);
        marketPlace.getListaUsuarios().add(administrador.usuario);

        // Vendedor 1
        Vendedor vendedor1 = Vendedor.builder()
                .nombre("Juan")
                .apellido("Gomez")
                .cedula("1001")
                .direccion("Calle 1")
                .usuario(new Usuario("juan", "pass1", "1001"))
                .build();
        vendedor1.getListaProductos().add(Producto.builder()
                .nombre("Collar Elegante")
                .id("P1001")
                .categoria("COLLAR")
                .precio(50.0)
                .rutaImagen("C:\\Users\\Asus\\OneDrive\\Escritorio\\ImagenesProyecto\\hq720")
                .descripcion("Collar elegante para eventos")
                .build());
        vendedor1.getListaProductos().add(Producto.builder()
                .nombre("Reloj Moderno")
                .id("P1002")
                .categoria("RELOJ")
                .precio(120.0)
                .rutaImagen("C:\\Users\\Asus\\OneDrive\\Escritorio\\ImagenesProyecto\\images")
                .descripcion("Reloj moderno y elegante")
                .build());
        vendedor1.getListaProductos().add(Producto.builder()
                .nombre("Pulsera de Plata")
                .id("P1003")
                .categoria("PULSERAS")
                .precio(30.0)
                .rutaImagen("C:\\Users\\Asus\\OneDrive\\Escritorio\\ImagenesProyecto\\pulseraPlata")
                .descripcion("Pulsera hecha de plata fina")
                .build());
        vendedor1.getListaProductos().add(Producto.builder()
                .nombre("Aretes de Oro")
                .id("P1004")
                .categoria("ARETES")
                .precio(150.0)
                .rutaImagen("C:\\Users\\Asus\\OneDrive\\Escritorio\\ImagenesProyecto\\pngtree-golden-earrings-for-women-png-image_12298330")
                .descripcion("Aretes dorados para cualquier ocasión")
                .build());
        vendedor1.getListaProductos().add(Producto.builder()
                .nombre("Cadena Fina")
                .id("P1005")
                .categoria("CADENAS")
                .precio(200.0)
                .rutaImagen("C:\\Users\\Asus\\OneDrive\\Escritorio\\ImagenesProyecto\\images (1)")
                .descripcion("Cadena de oro fina")
                .build());
        marketPlace.getListaVendedores().add(vendedor1);
        marketPlace.getListaUsuarios().add(vendedor1.usuario);

        // Vendedor 2
        Vendedor vendedor2 = Vendedor.builder()
                .nombre("Ana")
                .apellido("Martinez")
                .cedula("1002")
                .direccion("Calle 2")
                .usuario(new Usuario("ana", "pass2", "1002"))
                .build();
        vendedor2.getListaProductos().add(Producto.builder()
                .nombre("Bolso Casual")
                .id("P2001")
                .categoria("BOLSOS")
                .precio(80.0)
                .rutaImagen("C:\\Users\\Asus\\OneDrive\\Escritorio\\ImagenesProyecto\\png-clipart-messenger-bag-leather-handbag-baggage-pierre-cardin-black-casual-bag-luggage-bags-black-hair")
                .descripcion("Bolso casual para el día a día")
                .build());
        vendedor2.getListaProductos().add(Producto.builder()
                .nombre("Gafas de Sol")
                .id("P2002")
                .categoria("GAFAS")
                .precio(60.0)
                .rutaImagen("C:\\Users\\Asus\\OneDrive\\Escritorio\\ImagenesProyecto\\pngtree-white-transparent-summer-sunglasses-png-image_9047499")
                .descripcion("Gafas de sol polarizadas")
                .build());
        vendedor2.getListaProductos().add(Producto.builder()
                .nombre("Collar Clásico")
                .id("P2003")
                .categoria("COLLAR")
                .precio(45.0)
                .rutaImagen("C:\\Users\\Asus\\OneDrive\\Escritorio\\ImagenesProyecto\\590412_1")
                .descripcion("Collar clásico y sencillo")
                .build());
        vendedor2.getListaProductos().add(Producto.builder()
                .nombre("Reloj Deportivo")
                .id("P2004")
                .categoria("RELOJ")
                .precio(95.0)
                .rutaImagen("C:\\Users\\Asus\\OneDrive\\Escritorio\\ImagenesProyecto\\pngtree-stylish-black-sports-watch-png-image_14202124")
                .descripcion("Reloj deportivo y resistente")
                .build());
        vendedor2.getListaProductos().add(Producto.builder()
                .nombre("Pulsera de Cuero")
                .id("P2005")
                .categoria("PULSERAS")
                .precio(25.0)
                .rutaImagen("C:\\Users\\Asus\\OneDrive\\Escritorio\\ImagenesProyecto\\png-transparent-bracelet-leather-wristband-watch-strap-watch-bracelet-watch-accessory-leather-thumbnail")
                .descripcion("Pulsera de cuero auténtico")
                .build());
        marketPlace.getListaVendedores().add(vendedor2);
        marketPlace.getListaUsuarios().add(vendedor2.usuario);

        // Vendedores 3 al 10 (Datos Quemados)
        Vendedor vendedor3 = Vendedor.builder()
                .nombre("Carlos")
                .apellido("Perez")
                .cedula("1003")
                .direccion("Calle 3")
                .usuario(new Usuario("carlos", "pass3", "1003"))
                .build();
        vendedor3.getListaProductos().add(Producto.builder()
                .nombre("Reloj Clásico")
                .id("P3001")
                .categoria("RELOJ")
                .precio(130.0)
                .rutaImagen("C:\\Users\\Asus\\OneDrive\\Escritorio\\ImagenesProyecto\\png-transparent-lotus-watch-quartz-clock-festina-smart-casual-blue-brown-bracelet")
                .descripcion("Reloj clásico para caballero")
                .build());
        vendedor3.getListaProductos().add(Producto.builder()
                .nombre("Bolso de Mano")
                .id("P3002")
                .categoria("BOLSOS")
                .precio(75.0)
                .rutaImagen("C:\\Users\\Asus\\OneDrive\\Escritorio\\ImagenesProyecto\\png-clipart-amazon-com-handbag-messenger-bags-tote-bag-leather-handbags-white-brown")
                .descripcion("Bolso práctico de mano")
                .build());
        vendedor3.getListaProductos().add(Producto.builder()
                .nombre("Gafas Elegantes")
                .id("P3003")
                .categoria("GAFAS")
                .precio(110.0)
                .rutaImagen("C:\\Users\\Asus\\OneDrive\\Escritorio\\ImagenesProyecto\\images (2)")
                .descripcion("Gafas elegantes para eventos")
                .build());
        vendedor3.getListaProductos().add(Producto.builder()
                .nombre("Pulsera Dorada")
                .id("P3004")
                .categoria("PULSERAS")
                .precio(50.0)
                .rutaImagen("C:\\Users\\Asus\\OneDrive\\Escritorio\\ImagenesProyecto\\images (3)")
                .descripcion("Pulsera dorada con detalles únicos")
                .build());
        vendedor3.getListaProductos().add(Producto.builder()
                .nombre("Aretes Plateados")
                .id("P3005")
                .categoria("ARETES")
                .precio(40.0)
                .rutaImagen("C:\\Users\\Asus\\OneDrive\\Escritorio\\ImagenesProyecto\\png-clipart-earring-jewellery-cubic-zirconia-gold-jewellery-thumbnail")
                .descripcion("Aretes sencillos y elegantes")
                .build());
        marketPlace.getListaVendedores().add(vendedor3);
        marketPlace.getListaUsuarios().add(vendedor3.usuario);

        Vendedor vendedor4 = Vendedor.builder()
                .nombre("Luis")
                .apellido("Perez")
                .cedula("1004")
                .direccion("Calle 4")
                .usuario(new Usuario("luis", "pass4", "1004"))
                .build();
        vendedor4.getListaProductos().add(Producto.builder()
                .nombre("Collar Clásico")
                .id("P4001")
                .categoria("COLLAR")
                .precio(45.0)
                .rutaImagen("C:\\Users\\Asus\\OneDrive\\Escritorio\\ImagenesProyecto\\png-clipart-necklace-jewellery-charms-pendants-chain-gold-calssic-pendant-gold")
                .descripcion("Collar clásico y sencillo")
                .build());
        vendedor4.getListaProductos().add(Producto.builder()
                .nombre("Bolso Elegante")
                .id("P4002")
                .categoria("BOLSOS")
                .precio(100.0)
                .rutaImagen("C:\\Users\\Asus\\OneDrive\\Escritorio\\ImagenesProyecto\\images (4)")
                .descripcion("Bolso elegante para eventos")
                .build());
        marketPlace.getListaVendedores().add(vendedor4);
        marketPlace.getListaUsuarios().add(vendedor4.usuario);

        // Vendedor 5
        Vendedor vendedor5 = Vendedor.builder()
                .nombre("Maria")
                .apellido("Rodriguez")
                .cedula("1005")
                .direccion("Calle 5")
                .usuario(new Usuario("maria", "pass5", "1005"))
                .build();
        vendedor5.getListaProductos().add(Producto.builder()
                .nombre("Aretes Plateados")
                .id("P5001")
                .categoria("ARETES")
                .precio(40.0)
                .rutaImagen("C:\\Users\\Asus\\OneDrive\\Escritorio\\ImagenesProyecto\\png-transparent-earring-silver-silver-metal-earring-earrings")
                .descripcion("Aretes de plata para cualquier ocasión")
                .build());
        vendedor5.getListaProductos().add(Producto.builder()
                .nombre("Pulsera Dorada")
                .id("P5002")
                .categoria("PULSERAS")
                .precio(50.0)
                .rutaImagen("C:\\Users\\Asus\\OneDrive\\Escritorio\\ImagenesProyecto\\images (5)")
                .descripcion("Pulsera dorada con detalles únicos")
                .build());
        marketPlace.getListaVendedores().add(vendedor5);
        marketPlace.getListaUsuarios().add(vendedor5.usuario);

        // Vendedor 6
        Vendedor vendedor6 = Vendedor.builder()
                .nombre("Andrea")
                .apellido("Sanchez")
                .cedula("1006")
                .direccion("Calle 6")
                .usuario(new Usuario("andrea", "pass6", "1006"))
                .build();
        vendedor6.getListaProductos().add(Producto.builder()
                .nombre("Reloj Clásico")
                .id("P6001")
                .categoria("RELOJ")
                .precio(130.0)
                .rutaImagen("C:\\Users\\Asus\\OneDrive\\Escritorio\\ImagenesProyecto\\images (6)")
                .descripcion("Reloj clásico para caballeros")
                .build());
        vendedor6.getListaProductos().add(Producto.builder()
                .nombre("Gafas Elegantes")
                .id("P6002")
                .categoria("GAFAS")
                .precio(110.0)
                .rutaImagen("C:\\Users\\Asus\\OneDrive\\Escritorio\\ImagenesProyecto\\pngtree-sleek-and-stylish-glasses-for-a-trendy-look-on-a-png-image_10946206")
                .descripcion("Gafas elegantes para eventos especiales")
                .build());
        marketPlace.getListaVendedores().add(vendedor6);
        marketPlace.getListaUsuarios().add(vendedor6.usuario);

        // Vendedor 7
        Vendedor vendedor7 = Vendedor.builder()
                .nombre("Pedro")
                .apellido("Ramirez")
                .cedula("1007")
                .direccion("Calle 7")
                .usuario(new Usuario("pedro", "pass7", "1007"))
                .build();
        vendedor7.getListaProductos().add(Producto.builder()
                .nombre("Aretes Dorados")
                .id("P7001")
                .categoria("ARETES")
                .precio(70.0)
                .rutaImagen("C:\\Users\\Asus\\OneDrive\\Escritorio\\ImagenesProyectog\\images (7)")
                .descripcion("Aretes dorados con incrustaciones")
                .build());
        vendedor7.getListaProductos().add(Producto.builder()
                .nombre("Collar con Dije")
                .id("P7002")
                .categoria("COLLAR")
                .precio(90.0)
                .rutaImagen("C:\\Users\\Asus\\OneDrive\\Escritorio\\ImagenesProyecto\\png-transparent-necklace-jewellery-charms-pendants-gold-cubic-zirconia-necklace-gemstone-pendant-retail-thumbnail")
                .descripcion("Collar con dije de piedra preciosa")
                .build());
        marketPlace.getListaVendedores().add(vendedor7);
        marketPlace.getListaUsuarios().add(vendedor7.usuario);

        return marketPlace;
    }
}
