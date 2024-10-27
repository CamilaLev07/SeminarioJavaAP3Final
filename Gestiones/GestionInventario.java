import java.util.ArrayList;
import java.util.Scanner;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class GestionInventario {

     // Listas para almacenar diferentes entidades del sistema
    
    private ArrayList<OrdenDeCompra> ordenes;
    private ArrayList<Devolucion> devoluciones;
    private ArrayList<Venta> ventas;
    private ArrayList<Categoria> categorias;
    private ArrayList<Cliente> clientes;
    private ArrayList<Proveedor> proveedores;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Rol> roles;
    private ArrayList<Producto> productos;

     // Listas para almacenar diferentes entidades del sistema
    public GestionInventario() {
        ordenes = new ArrayList<>();
        devoluciones = new ArrayList<>();
        ventas = new ArrayList<>();
        categorias = new ArrayList<>();
        clientes = new ArrayList<>();
        proveedores = new ArrayList<>();
        usuarios = new ArrayList<>();
        roles = new ArrayList<>();
        productos = new ArrayList<>();
    }
    //metodo para agregar una orden de compra 
    public void agregarOrden(OrdenDeCompra orden) {
        ordenes.add(orden);
        System.out.println("Orden de compra agregada exitosamente.");
    }
    //metodo para agregar la devolucion
    public void agregarDevolucion(Devolucion devolucion) {
        devoluciones.add(devolucion);
        System.out.println("Devolución agregada exitosamente.");
    }
      //metodo para agregar una venta 
    public void agregarVenta(Venta venta) {
        ventas.add(venta);
        System.out.println("Venta agregada exitosamente.");
    }
      //metodo para agregar una categoria
    public void agregarCategoria(Categoria categoria) {
        categorias.add(categoria);
        System.out.println("Categoría agregada exitosamente.");
    }
      //metodo para agregar UN cliente
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente agregado exitosamente.");
    }
      //metodo para agregar un proveedor
    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
        System.out.println("Proveedor agregado exitosamente.");
    }
      //metodo para agregar un usuario
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario agregado exitosamente.");
    }
      //metodo para agregar un rol 
    public void agregarRol(Rol rol) {
        roles.add(rol);
        System.out.println("Rol agregado exitosamente.");
    }
      //metodo para agregar un producto
    public void agregarProducto(Scanner scanner) {
        System.out.println("Seleccione tipo de producto:");
        System.out.println("1. Producto Normal");
        System.out.println("2. Producto Electrónico");
        //obtener el tipo de producto 
        
        int tipoProducto = obtenerNumero(scanner, "Ingrese tipo: ");
        
        Producto producto = null;

         // Crear un ProductoNormal o ProductoElectrónico basado en la selección
        
        if (tipoProducto == 1) {
            int idProducto = obtenerNumero(scanner, "Ingrese ID de Producto: ");
            if (idProductoExiste(idProducto)) {
                System.out.println("Error: El ID del producto ya existe.");
                return;
            }
            System.out.print("Ingrese Nombre de Producto: ");
            String nombreProducto = scanner.next();
            double precioProducto = obtenerNumeroDouble(scanner, "Ingrese Precio de Producto: ");
            int stockProducto = obtenerNumero(scanner, "Ingrese Stock: ");
            
            producto = new ProductoNormal(idProducto, nombreProducto, precioProducto, stockProducto);
        } else if (tipoProducto == 2) {
            int idProducto = obtenerNumero(scanner, "Ingrese ID de Producto: ");
            if (idProductoExiste(idProducto)) {
                System.out.println("Error: El ID del producto ya existe.");
                return;
            }
            System.out.print("Ingrese Nombre de Producto: ");
            String nombreProducto = scanner.next();
            double precioProducto = obtenerNumeroDouble(scanner, "Ingrese Precio de Producto: ");
            int stockProducto = obtenerNumero(scanner, "Ingrese Stock: ");
            
            System.out.print("Ingrese Marca: ");
            String marca = scanner.next();
            
            producto = new ProductoElectrónico(idProducto, nombreProducto, precioProducto, stockProducto, marca);
        } else {
            System.out.println("Tipo de producto no válido. Producto no agregado.");
            return; // Salir del método si el tipo no es válido
        }
        
        productos.add(producto);
        System.out.println("Producto agregado exitosamente.");
    }
    
    // Métodos para obtener las listas de las entidades
    public ArrayList<OrdenDeCompra> getOrdenes() {
        return ordenes;
    }

    public ArrayList<Devolucion> getDevoluciones() {
        return devoluciones;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
    // Método para consultar el stock de productos
    public void consultarStock(Scanner scanner) {
        System.out.println("Consulta de stock:");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Consultar producto específico");
        System.out.println("2. Consultar todos los productos");
        
        int opcion = obtenerNumero(scanner, "Ingrese opción: ");
        
        if (opcion == 1) {
            // Consultar producto específico
            int idProducto = obtenerNumero(scanner, "Ingrese ID de Producto: ");
            Producto producto = buscarProductoPorId(idProducto);
            
            if (producto != null) {
                System.out.println("Producto encontrado: " + producto.toString() + ", Tipo: " + producto.getTipoProducto());
            } else {
                System.out.println("Producto no encontrado.");
            }
        } else if (opcion == 2) {
            // Consultar todos los productos
            System.out.println("Lista de todos los productos:");
            if (productos.isEmpty()) {
                System.out.println("No hay productos registrados.");
            } else {
                for (Producto p : productos) {
                    System.out.println(p.toString() + ", Tipo: " + p.getTipoProducto());
                }
            }
        } else {
            System.out.println("Opción no válida.");
        }
    } 
    
    // Método privado para buscar un producto por ID
    private Producto buscarProductoPorId(int idProducto) {
        for (Producto p : productos) {
            if (p.getId() == idProducto) {
                return p;
            }
        }
        return null; // Retorna null si no se encuentra
    }

    private boolean idProductoExiste(int id) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                return true;
            }
        }
        return false;
    }

    private int obtenerNumero(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Intente de nuevo.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private double obtenerNumeroDouble(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Intente de nuevo.");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    //modificar

    // Método en GestionInventario para modificar un producto
public void modificarProducto(int id, Scanner scanner) {
    Producto producto = buscarProductoPorId(id);
    if (producto != null) {
        System.out.println("Producto encontrado: " + producto);
        
        // Modificar los datos
        System.out.print("Ingrese nuevo nombre (dejar en blanco para no cambiar): ");
        String nuevoNombre = scanner.nextLine();
        if (!nuevoNombre.isEmpty()) {
            producto.setNombre(nuevoNombre);
        }

        System.out.print("Ingrese nuevo precio (dejar en blanco para no cambiar): ");
        String precioInput = scanner.nextLine();
        if (!precioInput.isEmpty()) {
            double nuevoPrecio = Double.parseDouble(precioInput);
            producto.setPrecio(nuevoPrecio);
        }

        System.out.print("Ingrese nuevo stock (dejar en blanco para no cambiar): ");
        String stockInput = scanner.nextLine();
        if (!stockInput.isEmpty()) {
            int nuevoStock = Integer.parseInt(stockInput);
            producto.setStock(nuevoStock);
        }

        System.out.println("Producto modificado exitosamente.");
    } else {
        System.out.println("Producto no encontrado.");
    }
}

// Método para modificar orden de compra
public void modificarOrdenCompra(int idOrden, Scanner scanner) {
    OrdenDeCompra orden = buscarOrdenPorId(idOrden);
    if (orden != null) {
        System.out.println("Modificando orden: " + orden);
        // Leer nuevos valores
        String nuevaFecha = obtenerFecha(scanner);
        int nuevoTotal = obtenerNumero(scanner, "Ingrese nuevo total: ");
        int nuevoIdProducto = obtenerNumero(scanner, "Ingrese nuevo ID de Producto: ");
        // Actualizar valores
        orden.setFecha(Date.valueOf(nuevaFecha));
        orden.setTotal(nuevoTotal);
        orden.setIdProducto(nuevoIdProducto);
        System.out.println("Orden de compra modificada exitosamente.");
    } else {
        System.out.println("Orden de compra no encontrada.");
    }
}

// Método para modificar una devolución
public void modificarDevolucion(int idDevolucion, Scanner scanner) {
    Devolucion devolucion = buscarDevolucionPorId(idDevolucion); // Implemente este método para buscar la devolución por ID
    if (devolucion != null) {
        System.out.println("Devolución encontrada: " + devolucion);

        // Cambiar fecha
        System.out.print("Ingrese nueva fecha (dejar en blanco para no cambiar): ");
        String nuevaFecha = scanner.nextLine();
        if (!nuevaFecha.isEmpty()) {
            devolucion.setFecha(Date.valueOf(nuevaFecha)); 
        }

        // Cambiar ID de Producto
        System.out.print("Ingrese nuevo ID de Producto (0 para no cambiar): ");
        int nuevoIdProducto = scanner.nextInt();
        if (nuevoIdProducto != 0) {
            devolucion.setIdProducto(nuevoIdProducto); 
        }

        // Cambiar Motivo
        System.out.print("Ingrese nuevo motivo (dejar en blanco para no cambiar): ");
        scanner.nextLine(); // Limpiar el buffer
        String nuevoMotivo = scanner.nextLine();
        if (!nuevoMotivo.isEmpty()) {
            devolucion.setMotivo(nuevoMotivo); 
        }

        System.out.println("Devolución modificada exitosamente.");
    } else {
        System.out.println("Devolución no encontrada.");
    }
}

public void modificarUsuario(int idUsuario, Scanner scanner) {
    Usuario usuario = buscarUsuarioPorId(idUsuario); // Busca el usuario por ID
    if (usuario != null) {
        System.out.println("Usuario encontrado: " + usuario);

        // Cambiar nombre
        System.out.print("Ingrese nuevo nombre (dejar en blanco para no cambiar): ");
        String nuevoNombre = scanner.nextLine();
        if (!nuevoNombre.isEmpty()) {
            usuario.setNombreUsuario(nuevoNombre);
        }

        // Cambiar email
        System.out.print("Ingrese nuevo email (dejar en blanco para no cambiar): ");
        String nuevoEmail = scanner.nextLine();
        if (!nuevoEmail.isEmpty()) {
            usuario.setEmail(nuevoEmail);
        }

        // Cambiar rol
        System.out.print("Ingrese nuevo rol (dejar en blanco para no cambiar): ");
        String nuevoRol = scanner.nextLine();
        if (!nuevoRol.isEmpty()) {
            usuario.setRol(nuevoRol);
        }

        System.out.println("Usuario modificado exitosamente.");
    } else {
        System.out.println("Usuario no encontrado.");
    }
}


public void modificarProveedor(int idProveedor, Scanner scanner) {
    Proveedor proveedor = buscarProveedorPorId(idProveedor); // Implemente este método para buscar el proveedor por ID
    if (proveedor != null) {
        System.out.println("Proveedor encontrado: " + proveedor);

        // Cambiar nombre
        System.out.print("Ingrese nuevo nombre (dejar en blanco para no cambiar): ");
        String nuevoNombre = scanner.nextLine();
        if (!nuevoNombre.isEmpty()) {
            proveedor.setNombre(nuevoNombre);
        }

        // Cambiar contacto
        System.out.print("Ingrese nuevo contacto (dejar en blanco para no cambiar): ");
        String nuevoContacto = scanner.nextLine();
        if (!nuevoContacto.isEmpty()) {
            proveedor.setContacto(nuevoContacto);
        }

        // Cambiar teléfono
        System.out.print("Ingrese nuevo teléfono (dejar en blanco para no cambiar): ");
        String nuevoTelefono = scanner.nextLine();
        if (!nuevoTelefono.isEmpty()) {
            proveedor.setTelefono(nuevoTelefono);
        }

        System.out.println("Proveedor modificado exitosamente.");
    } else {
        System.out.println("Proveedor no encontrado.");
    }
}


// Método en GestionInventario para eliminar un producto
public void eliminarProducto(int id) {
    Producto producto = buscarProductoPorId(id);
    if (producto != null) {
        productos.remove(producto);
        System.out.println("Producto eliminado exitosamente.");
    } else {
        System.out.println("Producto no encontrado.");
    }
}

// Método para eliminar orden de compra
public void eliminarOrdenCompra(int idOrden) {
    OrdenDeCompra orden = buscarOrdenPorId(idOrden);
    if (orden != null) {
        ordenes.remove(orden);
        System.out.println("Orden de compra eliminada exitosamente.");
    } else {
        System.out.println("Orden de compra no encontrada.");
    }
}

// Método para eliminar una devolución
public void eliminarDevolucion(int idDevolucion) {
    Devolucion devolucion = buscarDevolucionPorId(idDevolucion);
    if (devolucion != null) {
        devoluciones.remove(devolucion);
        System.out.println("Devolución eliminada exitosamente.");
    } else {
        System.out.println("Devolución no encontrada.");
    }
}

// Metodo para  eliminar usuario
public void eliminarUsuario(int idUsuario) {
    Usuario usuario = buscarUsuarioPorId(idUsuario); 
    if (usuario != null) {
        usuarios.remove(usuario); 
        System.out.println("Usuario eliminado exitosamente.");
    } else {
        System.out.println("Usuario no encontrado.");
    }
}

// Meotodo para eliminar proveedor
public void eliminarProveedor(int idProveedor) {
    Proveedor proveedor = buscarProveedorPorId(idProveedor); 
    if (proveedor != null) {
        proveedores.remove(proveedor); 
        System.out.println("Proveedor eliminado exitosamente.");
    } else {
        System.out.println("Proveedor no encontrado.");
    }
}



// Método para buscar orden de compra por ID
private OrdenDeCompra buscarOrdenPorId(int idOrden) {
    for (OrdenDeCompra orden : ordenes) {
        if (orden.getIdOrden() == idOrden) {
            return orden;
        }
    }
    return null; // Si no se encuentra
}

// Método para buscar devolución por ID
private Devolucion buscarDevolucionPorId(int idDevolucion) {
    for (Devolucion devolucion : devoluciones) {
        if (devolucion.getIdDevolucion() == idDevolucion) {
            return devolucion;
        }
    }
    return null; // Si no se encuentra
}

// Obtener fecha
private String obtenerFecha(Scanner scanner) {
    System.out.print("Ingrese fecha (YYYY-MM-DD): ");
    String fecha = scanner.nextLine();
    
    return fecha;
}


// Buscar usuario por ID
private Usuario buscarUsuarioPorId(int idUsuario) {
    for (Usuario usuario : usuarios) {
        if (usuario.getIdUsuario() == idUsuario) {
            return usuario;
        }
    }
    return null; // Si no se encuentra
}

//buscar proveedor por ID
private Proveedor buscarProveedorPorId(int idProveedor) {
    for (Proveedor proveedor : proveedores) {
        if (proveedor.getIdProveedor() == idProveedor) { 
            return proveedor;
        }
    }
    return null; 
}



}