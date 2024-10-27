import java.sql.Date;

public class Devolucion {
    //atributos de la clase, encapsuladosr como privados
    private int idDevolucion;
    private Date fecha;
    private String motivo;
    private int idProducto;
    private int idCliente;

    // Constructor principal que inicializa todos los atributos
    public Devolucion(int idDevolucion, Date fecha, String motivo, int idProducto, int idCliente) {
        this.idDevolucion = idDevolucion;
        this.fecha = fecha;
        this.motivo = motivo;
        this.idProducto = idProducto;
        this.idCliente = idCliente;
    }

    // Getters y setters
    public int getIdDevolucion() {
        return idDevolucion;
    }

    public void setIdDevolucion(int idDevolucion) {
        this.idDevolucion = idDevolucion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }


    // aqui creamos metodo toString que devuelve una representacion en forma de cadena
    @Override
    public String toString() {
        return "Devolucion{" +
                "ID=" + idDevolucion +
                ", Fecha=" + fecha +
                ", Motivo='" + motivo + '\'' +
                ", ID Producto=" + idProducto +
                ", ID Cliente=" + idCliente +
                '}';
    }
}