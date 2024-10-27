
public class Rol {
    private int idRol;
    private String nombre;
    private String descripcion;
    private int Rol;

    public Rol(int idRol, String nombre, String descripcion) {
         // Constructores para inicializar objetos
        this.idRol = idRol;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.Rol = Rol;
    }

    public Rol(int idRol2, String nombreRol) {
        //TODO Auto-generated constructor stub
    }

    //metodos getters y setters
    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public void setRol(int Rol) {
        this.Rol = Rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
