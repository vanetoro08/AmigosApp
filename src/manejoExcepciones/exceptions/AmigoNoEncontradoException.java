package manejoExcepciones.exceptions;

// @author vanes
public class AmigoNoEncontradoException extends RuntimeException{
    public AmigoNoEncontradoException(){
        super("Amigo no encontrado. Registre el amigo");
    }
}
