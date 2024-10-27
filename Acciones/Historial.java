import java.util.Date;

public class Historial {
    //atributos de la clase, encapsulados como privados
    private int idHistorial;
    private int usuario;
    private int idProducto;
    private int cantidad;
    private Date fecha;
    
    // Constructor principal que inicializa todos los atributos
    public Historial(int idHistorial, int usuario, int idProducto, int cantidad, Date fecha) {
        this.idHistorial = idHistorial;
        this.usuario = usuario;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }
    // Getters y setters
    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}