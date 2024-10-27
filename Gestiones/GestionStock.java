import java.util.HashMap;

public class GestionStock {
    //aqui tenemos un atributo que almacena productos en un HashMap
    private HashMap<Integer, Producto> productos;


    //constructor que inicializa el HashMap
    public GestionStock() {
        this.productos = new HashMap<>();
    }

    //metodo para agregar producto al stock
    public void agregarProducto(Producto producto) {
        productos.put(producto.getId(), producto);
        System.out.println("Producto agregado exitosamente.");
    }

    public void consultarStock() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en stock.");
        } else {
            for (Producto producto : productos.values()) {
                System.out.println(producto);
            }
        }
    }
}