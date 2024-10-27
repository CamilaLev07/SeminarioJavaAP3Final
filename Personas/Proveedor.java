public class Proveedor {
    private int idProveedor;
    private String nombre;
    private String contacto;
    private String telefono; // Agregado campo telefono
    private int idProducto;

    // Constructor para inicializar todos los campos
    public Proveedor(int idProveedor, String nombre, String contacto, String telefono, int idProducto) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.contacto = contacto; // Inicializa el contacto
        this.telefono = telefono;  // Inicializa el teléfono
        this.idProducto = idProducto; // Inicializa el ID de producto
    }

    // Constructor adicional para un proveedor sin ID de producto y sin teléfono
    public Proveedor(int idProveedor, String nombre, String contacto) {
        this(idProveedor, nombre, contacto, "", 0); // Asignar teléfono vacío y ID de producto a 0 por defecto
    }

    // Constructor adicional que solo recibe idProveedor y nombre
    public Proveedor(int idProveedor, String nombre) {
        this(idProveedor, nombre, "", "", 0); // Asignar contacto y teléfono vacíos, y ID de producto a 0 por defecto
    }

    // Métodos getters y setters
    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTelefono() {
        return telefono; // Método para obtener el teléfono
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono; // Método para establecer el teléfono
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    // Método que devuelve en forma de cadena la información del objeto proveedor
    public String toString() {
        return "Proveedor{" +
                "ID=" + idProveedor +
                ", Nombre='" + nombre + '\'' +
                ", Contacto='" + contacto + '\'' +
                ", Teléfono='" + telefono + '\'' +
                ", ID Producto=" + idProducto +
                '}';
    }
}