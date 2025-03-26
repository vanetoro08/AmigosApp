package aplicacionAmigos.models;

/**
 * Modelo de app de amigos
 * @since 20250326
 * @version 1.0
 * @author Nicoloas Agudelo
 * @author Vanessa Toro
 */

public class Amigo {
    /**
    * atributos
    */
    //nombre del amigo
    private String nombre; 
    //numero de telefono del amigo
    private String telefono; 
    //correo del amigo
    private String correoElectronico; 

    /**
     * Inicializa los atributos de la clase Amigo
     * 
     * @param nombre
     * @param telefono
     * @param correoElectronico 
     */
    public Amigo(String nombre, String telefono, String correoElectronico) {
        
        this.nombre = nombre;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    } 
    /**
     * devuelve el nombre del amigo
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * devuelve el telefono del amigo
     * @return telefono
     */
    public String getTelefono() {
        return telefono;
    }
    /**
     * devuelve el correo electronico del amigo
     * @return correoElectronico
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    
    
}
