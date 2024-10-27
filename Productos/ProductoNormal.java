// Clase ProductoNormal que extiende la clase Producto
public class ProductoNormal extends Producto {
    public ProductoNormal(int id, String nombre, double precio, int stock) {
        super(id, nombre, precio, stock);   //llama al constructor de la clase padre Producto
    }

    @Override
    public String getDetalles() {
        // devuelve una descripcion completa del producto
        return "ID: " + getId() + ", Nombre: " + getNombre() + ", Precio: " + getPrecio() + 
        ", Stock: " + getStock() + " (" + obtenerEstadoStock() + ")";
    }

    @Override
    //metodo sobreescrito para obtener el tipo de producto
    public String getTipoProducto() {
        return "Producto Normal";
    }

    @Override
    public String toString() {
        return getDetalles();
    }
}