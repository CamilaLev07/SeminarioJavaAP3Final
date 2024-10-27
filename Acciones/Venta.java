import java.sql.Date;

public class Venta {

    //atributos de la clase, encapsulados como privados
    private int idVenta;
    private Date fecha;
    private String detalleVenta; 
    private int total;
    private int idProducto;

    // Constructor principal que inicializa todos los atributos
    public Venta(int idVenta, Date fecha, String detalleVenta, int total, int idProducto) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.detalleVenta = detalleVenta;
        this.total = total;
        this.idProducto = idProducto;
    }

    // Constructor secundario que permite crear una venta sin detalleVenta
    public Venta(int idVenta, Date fecha, int total, int idProducto) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.total = total;
        this.idProducto = idProducto;
    }

    public Venta(int idVenta2, java.util.Date valueOf, int totalVenta, int idClienteVenta) {
        //TODO Auto-generated constructor stub
    }

    // Getters y setters
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDetalleVenta() {
        return detalleVenta;
    }

    public void setDetalleVenta(String detalleVenta) {
        this.detalleVenta = detalleVenta;
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
        return "Venta{" +
                "ID=" + idVenta +
                ", Fecha=" + fecha +
                ", Total=" + total +
                ", ID Producto=" + idProducto +
                '}';
    }
}