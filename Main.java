import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.sql.Date;

public class Main {
    public static void main(String[] args) {

        //instancia de Gestion de inventario
        GestionInventario gestionInventario = new GestionInventario();
        Scanner scanner = new Scanner(System.in);

        int opcion = -1;

        //bucle de menu de opciones
        do {
            mostrarMenu();
            opcion = obtenerOpcion(scanner);


 // Elegir qué acción realizar
switch (opcion) {
    case 1: agregarOrdenCompra(scanner, gestionInventario); break;
    case 2: agregarDevolucion(scanner, gestionInventario); break;
    case 3: agregarVenta(scanner, gestionInventario); break;
    case 4: agregarProducto(scanner, gestionInventario); break;
    case 5: agregarCategoria(scanner, gestionInventario); break;
    case 6: agregarCliente(scanner, gestionInventario); break;
    case 7: agregarProveedor(scanner, gestionInventario); break;
    case 8: agregarUsuario(scanner, gestionInventario); break;
    case 9: agregarRol(scanner, gestionInventario); break;
    case 10: consultarOrdenes(gestionInventario); break;
    case 11: consultarDevoluciones(gestionInventario); break;
    case 12: consultarVentas(gestionInventario); break; 
    case 13: consultarClientes(gestionInventario); break;
    case 14: consultarProveedores(gestionInventario); break;
    case 15: gestionInventario.consultarStock(scanner); break; 
    case 16: consultarUsuarios(gestionInventario); break;
    case 17: 
        int idModificar = obtenerNumero(scanner, "Ingrese ID de Producto a modificar: ");
        gestionInventario.modificarProducto(idModificar, scanner);
        break;
    case 18: 
        int idEliminar = obtenerNumero(scanner, "Ingrese ID de Producto a eliminar: ");
        gestionInventario.eliminarProducto(idEliminar);
        break;
    case 19: 
        int idOrdenModificar = obtenerNumero(scanner, "Ingrese ID de Orden de Compra a modificar: ");
        gestionInventario.modificarOrdenCompra(idOrdenModificar, scanner);
        break;
    case 20: 
        int idOrdenEliminar = obtenerNumero(scanner, "Ingrese ID de Orden de Compra a eliminar: ");
        gestionInventario.eliminarOrdenCompra(idOrdenEliminar);
        break;
    case 21: 
        int idDevolucionModificar = obtenerNumero(scanner, "Ingrese ID de Devolución a modificar: ");
        gestionInventario.modificarDevolucion(idDevolucionModificar, scanner);
        break;
    case 22: 
        int idDevolucionEliminar = obtenerNumero(scanner, "Ingrese ID de Devolución a eliminar: ");
        gestionInventario.eliminarDevolucion(idDevolucionEliminar);
        break;
    case 23: 
        int idUsuarioModificar = obtenerNumero(scanner, "Ingrese ID de Usuario a modificar: ");
        gestionInventario.modificarUsuario(idUsuarioModificar, scanner);
        break;
    case 24: 
        int idUsuarioEliminar = obtenerNumero(scanner, "Ingrese ID de Usuario a eliminar: ");
        gestionInventario.eliminarUsuario(idUsuarioEliminar);
        break;
    case 25: 
        int idProveedorModificar = obtenerNumero(scanner, "Ingrese ID de Proveedor a modificar: ");
        gestionInventario.modificarProveedor(idProveedorModificar, scanner);
        break;
    case 26: 
        int idProveedorEliminar = obtenerNumero(scanner, "Ingrese ID de Proveedor a eliminar: ");
        gestionInventario.eliminarProveedor(idProveedorEliminar);
        break;
    case 0: 
        System.out.println("Saliendo..."); 
        break;
    default: 
        System.out.println("Opción no válida. Intente nuevamente.");
}

} while (opcion != 0);

scanner.close();
}


// Mostrar menú de opciones
private static void mostrarMenu() {
    System.out.println("********************************");
    System.out.println("=== Gestión de Inventario ===");
    System.out.println("********************************");
    System.out.println("---------------------------------");
    System.out.println("********  Agregaciones  ********");
    System.out.println("---------------------------------");
    System.out.println("1. Agregar Orden de Compra");
    System.out.println("2. Agregar Devolución");
    System.out.println("3. Agregar Venta");
    System.out.println("4. Agregar Producto");
    System.out.println("5. Agregar Categoría");
    System.out.println("6. Agregar Cliente");
    System.out.println("7. Agregar Proveedor");
    System.out.println("8. Agregar Usuario");
    System.out.println("9. Agregar Rol");
    System.out.println("---------------------------------");
    System.out.println("*********  Consultas  ***********");
    System.out.println("---------------------------------");
    System.out.println("10. Consultar Órdenes de Compra");
    System.out.println("11. Consultar Devoluciones");
    System.out.println("12. Consultar Ventas");
    System.out.println("13. Consultar Clientes");
    System.out.println("14. Consultar Proveedores");
    System.out.println("15. Consultar Stock");
    System.out.println("16. Consultar Usuarios");
    System.out.println("-----------------------------------");
    System.out.println("********  Modificaciones  ********");
    System.out.println("-----------------------------------");
    System.out.println("17. Modificar Productos");
    System.out.println("19. Modificar Órdenes de Compra"); 
    System.out.println("21. Modificar Devoluciones");
    System.out.println("23. Modificar Usuarios");
    System.out.println("25. Modificar Proveedores");
    System.out.println("-----------------------------------");
    System.out.println("********  Eliminaciones  ********");
    System.out.println("-----------------------------------");
    System.out.println("18. Eliminar Productos");
    System.out.println("20. Eliminar Órdenes de Compra");
    System.out.println("22. Eliminar Devoluciones");
    System.out.println("24. Eliminar Usuarios");
    System.out.println("26. Eliminar Proveedores");

    System.out.println("-----------------------------------");
    System.out.println("********  Cerrar Sesion  ********");
    System.out.println("-----------------------------------");
    System.out.println("0. Salir");
    System.out.print("Seleccione una opción: ");  // Aquí selecciona la opción deseada
}



    //metodo de obtener opcion
    private static int obtenerOpcion(Scanner scanner) {
        int opcion = -1;
        while (true) {
            try {
                opcion = scanner.nextInt();   //leer opcion ingresada
                scanner.nextLine(); // Limpiar el buffer
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Asegúrese de ingresar un número.");
                scanner.nextLine(); // Limpiar el buffer
            }
        }
        return opcion;  //retonar a la opcion valida
    }

    //metodo para agregar orden de compra
    private static void agregarOrdenCompra(Scanner scanner, GestionInventario gestionInventario) {
        int idOrden = obtenerNumero(scanner, "Ingrese ID de Orden: ");   // id de orden
        String fechaOrden = obtenerFecha(scanner);
        int totalOrden = obtenerNumero(scanner, "Ingrese Total: ");     //total de la orden de compra
        int idProductoOrden = obtenerNumero(scanner, "Ingrese ID de Producto: ");  //id producto

        OrdenDeCompra orden = new OrdenDeCompra(idOrden, Date.valueOf(fechaOrden), totalOrden, idProductoOrden);
        gestionInventario.agregarOrden(orden);
        System.out.println("Orden de compra agregada exitosamente.");   //mensaje de exitosamente
    }


    //metodo para agregar devolucion
    private static void agregarDevolucion(Scanner scanner, GestionInventario gestionInventario) {
        int idDevolucion = obtenerNumero(scanner, "Ingrese ID de Devolución: ");   //id devolucion
        String fechaDevolucion = obtenerFecha(scanner);   //fecha devolucion
        System.out.print("Ingrese Motivo: ");   //Ingrese motivo
        String motivoDevolucion = scanner.nextLine();
        int idProductoDevolucion = obtenerNumero(scanner, "Ingrese ID de Producto: ");   //id producto
        int idClienteDevolucion = obtenerNumero(scanner, "Ingrese ID de Cliente: ");  //id cliente

        Devolucion devolucion = new Devolucion(idDevolucion, Date.valueOf(fechaDevolucion), motivoDevolucion, idProductoDevolucion, idClienteDevolucion);
        gestionInventario.agregarDevolucion(devolucion);
        System.out.println("Devolución agregada exitosamente.");    //mensaje exitosamente
    }


    // metodo agregar venta
    private static void agregarVenta(Scanner scanner, GestionInventario gestionInventario) {
        int idVenta = obtenerNumero(scanner, "Ingrese ID de Venta: ");  //id venta
        String fechaVenta = obtenerFecha(scanner);
        int totalVenta = obtenerNumero(scanner, "Ingrese Total: ");    //total
        int idClienteVenta = obtenerNumero(scanner, "Ingrese ID de Cliente: ");  //cliente id

        Venta venta = new Venta(idVenta, Date.valueOf(fechaVenta), totalVenta, idClienteVenta);   //agregar venta al sistema
        gestionInventario.agregarVenta(venta);
        System.out.println("Venta agregada exitosamente.");
    }

    private static void agregarProducto(Scanner scanner, GestionInventario gestionInventario) {
        gestionInventario.agregarProducto(scanner);
    }


    //meotodo agregar cliente
    private static void agregarCliente(Scanner scanner, GestionInventario gestionInventario) {
        int idCliente = obtenerNumero(scanner, "Ingrese ID de Cliente: ");  //id de cliente
        System.out.print("Ingrese Nombre de Usuario: ");  //Ingrese nombre
        String nombreUsuario = scanner.nextLine();
        System.out.print("Ingrese Apellido: "); //Ingrese apellido
        String apellido = scanner.nextLine();

        String email;
        while (true) {
            System.out.print("Ingrese Email del Usuario: ");   //Ingrese mail
            email = scanner.nextLine();
            if (email.contains("@")) {  //si o si @
                break; // Salir del bucle si el correo es válido
            } else {
                System.out.println("Error: El correo electrónico debe contener '@'. Inténtelo nuevamente.");
            }
        }

        System.out.print("Ingrese Contraseña de Usuario: ");  //ingrese contraseña
        String contrasena = scanner.nextLine();
        int idRol = obtenerNumero(scanner, "Ingrese ID Rol: ");  //id rol
        System.out.print("Ingrese Contacto de Cliente: ");  //  ingrese contacto
        String contactoCliente = scanner.nextLine();

        Cliente cliente = new Cliente(idCliente, nombreUsuario, apellido, email, contrasena, idRol, contactoCliente);
        gestionInventario.agregarCliente(cliente);
        System.out.println("Cliente agregado exitosamente.");
    }
    


    //metodo agregar proveedor
    private static void agregarProveedor(Scanner scanner, GestionInventario gestionInventario) {
        int idProveedor = obtenerNumero(scanner, "Ingrese ID de Proveedor: ");  //id proveedor
        System.out.print("Ingrese Nombre de Proveedor: ");  //proveedor
        String nombreProveedor = scanner.nextLine();
        System.out.print("Ingrese Contacto de Proveedor: ");    //contacto
        String contacto = scanner.nextLine();

        Proveedor proveedor = new Proveedor(idProveedor, nombreProveedor);
        gestionInventario.agregarProveedor(proveedor);
        System.out.println("Proveedor agregado exitosamente.");
    }


    //metodo agregar usuario
    private static void agregarUsuario(Scanner scanner, GestionInventario gestionInventario) {
        int idUsuario = obtenerNumero(scanner, "Ingrese ID de Usuario: ");
        System.out.print("Ingrese Nombre de Usuario: ");
        String nombreUsuario = scanner.nextLine();
        System.out.print("Ingrese Apellido de Usuario: ");
        String apellido = scanner.nextLine();
        
        String email;

        //bucle
        while (true) {
            System.out.print("Ingrese Email del Usuario: ");
            email = scanner.nextLine();
            if (email.contains("@")) {
                break; // Salir del bucle si el correo es válido
            } else {
                System.out.println("Error: El correo electrónico debe contener '@'. Inténtelo nuevamente.");
            }
        }

        System.out.print("Ingrese Contraseña de Usuario: ");
        String contrasena = scanner.nextLine();
        int idRol = obtenerNumero(scanner, "Ingrese ID Rol: ");

        Usuario usuario = new Usuario(idUsuario, nombreUsuario, apellido, email, contrasena, idRol);
        gestionInventario.agregarUsuario(usuario);
        System.out.println("Usuario agregado exitosamente.");
    }


    //metodo agregar rol
    private static void agregarRol(Scanner scanner, GestionInventario gestionInventario) {
        int idRol = obtenerNumero(scanner, "Ingrese ID de Rol: ");
        System.out.print("Ingrese Nombre de Rol: ");
        String nombreRol = scanner.nextLine();

        Rol rol = new Rol(idRol, nombreRol);
        gestionInventario.agregarRol(rol);
        System.out.println("Rol agregado exitosamente.");
    }

    //metodo agregar categoria
    private static void agregarCategoria(Scanner scanner, GestionInventario gestionInventario) {
        int idCategoria = obtenerNumero(scanner, "Ingrese ID de Categoría: ");
        System.out.print("Ingrese Nombre de Categoría: ");
        String nombreCategoria = scanner.nextLine();

        Categoria categoria = new Categoria(idCategoria, nombreCategoria);
        gestionInventario.agregarCategoria(categoria);
        System.out.println("Categoría agregada exitosamente.");
    }


    //metodo consultar cliente
    private static void consultarClientes(GestionInventario gestionInventario) {
        ArrayList<Cliente> clientes = gestionInventario.getClientes();
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            System.out.println("Clientes:");
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }


    //metodo consultar usuarios
    private static void consultarUsuarios(GestionInventario gestionInventario) {
        ArrayList<Usuario> usuarios = gestionInventario.getUsuarios();
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
        } else {
            System.out.println("Usuarios:");
            for (Usuario usuario : usuarios) {
                System.out.println(usuario);
            }
        }
    }

    // metodo consultar ordenes
    private static void consultarOrdenes(GestionInventario gestionInventario) {
        ArrayList<OrdenDeCompra> ordenes = gestionInventario.getOrdenes();
        if (ordenes.isEmpty()) {
            System.out.println("No hay órdenes de compra registradas.");
        } else {
            System.out.println("Órdenes de Compra:");
            for (OrdenDeCompra orden : ordenes) {
                System.out.println(orden);
            }
        }
    }

    // metodo consultar devoluciones
    private static void consultarDevoluciones(GestionInventario gestionInventario) {
        ArrayList<Devolucion> devoluciones = gestionInventario.getDevoluciones();
        if (devoluciones.isEmpty()) {
            System.out.println("No hay devoluciones registradas.");
        } else {
            System.out.println("Devoluciones:");
            for (Devolucion devolucion : devoluciones) {
                System.out.println(devolucion);
            }
        }
    }

    // metodo consultar ventas
    private static void consultarVentas(GestionInventario gestionInventario) {
        ArrayList<Venta> ventas = gestionInventario.getVentas();
        if (ventas.isEmpty()) {
            System.out.println("No hay ventas registradas.");
        } else {
            System.out.println("Ventas:");
            for (Venta venta : ventas) {
                System.out.println(venta);
            }
        }
    }

    //metodo consultar proveedores
    private static void consultarProveedores(GestionInventario gestionInventario) {
        ArrayList<Proveedor> proveedores = gestionInventario.getProveedores();
        if (proveedores.isEmpty()) {
            System.out.println("No hay proveedores registrados.");
        } else {
            System.out.println("Proveedores:");
            for (Proveedor proveedor : proveedores) {
                System.out.println(proveedor);
            }
        }
    }

    //metodo obtener numero
    private static int obtenerNumero(Scanner scanner, String mensaje) {
        int numero = -1;
        while (numero == -1) {
            try {
                System.out.print(mensaje);
                numero = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Asegúrese de ingresar un número.");
                scanner.nextLine(); // Limpiar el buffer
            }
        }
        return numero;
    }

    private static double obtenerNumeroDouble(Scanner scanner, String mensaje) {
        double numero = -1;
        while (numero == -1) {
            try {
                System.out.print(mensaje);
                numero = scanner.nextDouble();
                scanner.nextLine(); // Limpiar el buffer
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Asegúrese de ingresar un número.");
                scanner.nextLine(); // Limpiar el buffer
            }
        }
        return numero;
    }

    private static String obtenerFecha(Scanner scanner) {
        String fecha;
        while (true) {
            System.out.print("Ingrese Fecha (yyyy-mm-dd): ");
            fecha = scanner.nextLine();
            if (fecha.matches("\\d{4}-\\d{2}-\\d{2}")) {
                break; // Salir del bucle si la fecha es válida
            } else {
                System.out.println("Error: Fecha inválida. Asegúrese de usar el formato yyyy-mm-dd.");
            }
        }
        return fecha;
    }
}