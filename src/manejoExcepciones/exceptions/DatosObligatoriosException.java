package manejoExcepciones.exceptions;

/**
 * Modelo exception amigo no encontrado
 * @since 20250326
 * @version 1.0
 * @author Nicoloas Agudelo
 * @author Vanessa Toro
 * @throws DatosObligatoriosException Si existe algun campo de texto vacio 
 */
public class DatosObligatoriosException extends RuntimeException{
    public DatosObligatoriosException(){
        super("Todos los campos son obligatorios");
    }

}
