public class Usuario {
    private int idUsuario;
    private String nombreUsuario;
    private String apellido;
    protected String email;
    private String contrasena;
    private int idRol; // ID del rol del usuario

    // Constructor
    public Usuario(int idUsuario, String nombreUsuario, String apellido, String email, String contrasena, int idRol) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellido = apellido;
        this.email = email;
        this.contrasena = contrasena;
        this.idRol = idRol;
    }

    // Getters
    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getContrasena() {
        return contrasena; // Método para obtener la contraseña
    }

    public int getIdRol() {
        return idRol; // Método para obtener el ID del rol
    }

    // Setters
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setIdRol(int idRol) { // Cambiado a setIdRol
        this.idRol = idRol;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email; // Método para establecer el email
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena; // Método para establecer la contraseña
    }

    

    @Override
    public String toString() {
        return "Usuario: " + idUsuario + 
            " (Nombre: " + nombreUsuario + 
            ", Apellido: " + apellido + 
            ", Email: " + email + 
            ", idRol: " + idRol + ")";
    }

    public void setRol(String nuevoRol) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setRol'");
    }
}