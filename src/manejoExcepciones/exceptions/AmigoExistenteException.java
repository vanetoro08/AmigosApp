package manejoExcepciones.exceptions;

/**
 * Modelo exception amigo existente
 * @since 20250326
 * @version 1.0
 * @author Nicoloas Agudelo
 * @author Vanessa Toro
 * @throws AmigoExistenteException Si el amigo ya existe ó ya está registrado
 */
public class AmigoExistenteException extends RuntimeException{
    public AmigoExistenteException(){
        super("El amigo ya esta registrado");
    }
}
