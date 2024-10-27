public abstract class Producto {       //clase abstracta
    private int id;
    private String nombre;
    private double precio;
    private int stock;


    // Constructor
    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Método abstracto para obtener detalles del producto
    public abstract String getDetalles();

    // Método abstracto para obtener el tipo de producto
    public abstract String getTipoProducto();

    // Método para calcular un descuento
    public double calcularDescuento(double porcentaje) {
        return precio * (1 - porcentaje / 100);
    }

    // Método auxiliar para determinar el estado del stock
    protected String obtenerEstadoStock() {
        if (stock < 0) {
            return "Stock negativo";
        } else if (stock >= 0 && stock <= 5) {
            return "Stock bajo";
        } else if (stock >= 6 && stock <= 100) {
            return "Stock adecuado";
        } else if (stock >= 101 && stock <= 500) {
            return "Stock alto";
        } else {
            return "Exceso de stock";
        }
    }

    // Métodos getters y setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    
}