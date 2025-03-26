package manejoExcepciones.exceptions;

// @author vanes
public class AmigoExistenteException extends RuntimeException{
    public AmigoExistenteException(){
        super("El amigo ya esta registrado");
    }
}
