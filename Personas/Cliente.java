public class Cliente extends Usuario {
    private String contacto;

    // Constructor que llama al constructor de Usuario
    public Cliente(int idCliente, String nombreUsuario, String apellido, String email, String contrasena, int idRol, String contacto) {
        super(idCliente, nombreUsuario, apellido, email, contrasena, idRol);
        this.contacto = contacto;
    }

    // Getter para contacto
    public String getContacto() {
        return contacto;
    }

    // Setter para contacto
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    // Método toString
    @Override
    public String toString() {
        return "Cliente [ID: " + getIdUsuario() + 
            ", Nombre: " + getNombreUsuario() + 
            ", Apellido: " + getApellido() + 
            ", Contacto: " + contacto + 
            ", Email: " + getEmail() + 
            ", Contraseña: " + getContrasena() + "]"; 
    }
}