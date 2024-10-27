// Clase ProductoElectronico que extiende la clase Producto
public class ProductoElectrónico extends Producto {                 //herencia de la clase Producto
    private String marca;   //marca del producto electronico

    public ProductoElectrónico(int id, String nombre, double precio, int stock, String marca) {
        super(id, nombre, precio, stock);   //llama al constructor de la clase padre Producto
        this.marca = marca;
    }

    @Override
    public String getDetalles() {
        //devuelve una descripcion completa del producto, incluyendo el estado del stock
        return "ID: " + getId() + ", Nombre: " + getNombre() + ", Precio: " + getPrecio() + ", Stock: " + getStock() + ", Marca: " + marca + " (" + obtenerEstadoStock() + ")";
    }

    //metodo sobrescrito para obtener el tipo de producto
    @Override
    public String getTipoProducto() {
        return "Producto Electrónico";
    }

    //metodo sobrescrito toString para obtener detalles del producto en formato de cadena
    @Override
    public String toString() {
        return getDetalles();
    }
}