import java.sql.SQLException;
import java.util.ArrayList;

// Clase Inventario
public class Inventario {
    private String nombre;
    private ArrayList<Producto> productos;

    public Inventario(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) throws SQLException {
        productos.add(producto);
    }

    public void eliminarProducto(int idProducto) throws InventarioExcepcion, SQLException {
        boolean encontrado = productos.removeIf(prod -> prod.getId() == idProducto);
        if (!encontrado) {
            throw new InventarioExcepcion("Producto no encontrado");
        }
    }

    public void mostrarProductos() throws SQLException {
        for (Producto prod : productos) {
            System.out.println(prod.getDetalles());
        }
    }

    public int calcularTotalStock() throws SQLException {
        int total = 0;
        for (Producto prod : productos) {
            total += prod.getStock();
        }
        return total;
    }
}