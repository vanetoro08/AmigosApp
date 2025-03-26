package aplicacionAmigos.models;

// @author vanes
public class Amigo {

    private String nombre; 
    private String telefono; 
    private String correoElectronico; 

    
    public Amigo(String nombre, String telefono, String correoElectronico) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    
    
    
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
    
    
}
