package manejoExcepciones.exceptions;

// @author vanes
public class DatosObligatoriosException extends RuntimeException{
    public DatosObligatoriosException(){
        super("Todos los campos son obligatorios");
    }

}
