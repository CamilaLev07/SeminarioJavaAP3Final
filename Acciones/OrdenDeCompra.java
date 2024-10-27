import java.sql.Date;

public class OrdenDeCompra {
    //atributos de la clase, encapsulador como privados
    private int idOrden;
    private Date fecha;
    private int total;
    private int idProducto;


    // Constructor principal que inicializa todos los atributos
    public OrdenDeCompra(int idOrden, Date fecha, int total, int idProducto) {
        this.idOrden = idOrden;
        this.fecha = fecha;
        this.total = total;
        this.idProducto = idProducto;
    }


// Getters y setters
    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    // aqui creamos metodo toString que devuelve una representacion en forma de cadena
    @Override
    public String toString() {
        return "OrdenDeCompra{" +
                "ID=" + idOrden +
                ", Fecha=" + fecha +
                ", Total=" + total +
                ", ID Producto=" + idProducto +
                '}';
    }
}