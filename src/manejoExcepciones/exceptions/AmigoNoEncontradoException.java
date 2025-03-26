package manejoExcepciones.exceptions;

/**
 * Modelo exception amigo no encontrado
 * @since 20250326
 * @version 1.0
 * @author Nicoloas Agudelo
 * @author Vanessa Toro
 * @throws AmigoNoEncontradoException Si el amigo no se encuentra ó no existe
 */
public class AmigoNoEncontradoException extends RuntimeException{
    public AmigoNoEncontradoException(){
        super("Amigo no encontrado. Registre el amigo");
    }
}
