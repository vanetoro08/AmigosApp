package aplicacionAmigos.models;
import java.util.ArrayList; 
import manejoExcepciones.exceptions.AmigoExistenteException;
import manejoExcepciones.exceptions.AmigoNoEncontradoException;
// @author vanes
public class Aplicacion {
    
    ArrayList<Amigo> amigos = new ArrayList<>();
    
    public boolean agregarAmigo(Amigo amigoNuevo) throws AmigoExistenteException{
        for (int i = 0; i < amigos.size(); i++) {
            if (amigos.get(i).getCorreoElectronico().equals(amigoNuevo.getCorreoElectronico())) {
                throw new AmigoExistenteException();
            }
        }
        return this.amigos.add(amigoNuevo); 
    }
    
    public Amigo buscarAmigo(String correoElectronicoABuscar) throws AmigoNoEncontradoException{
        for(int i=0 ; i<amigos.size(); i++){
            String correo = amigos.get(i).getCorreoElectronico();
            if (correo.equals(correoElectronicoABuscar)){
                return amigos.get(i);
            }
        }
        throw new AmigoNoEncontradoException(); 
    }
    
    public void EliminarAmigo(String correoElectronicoABuscar){
         for(int i=0 ; i<amigos.size(); i++){
            String correo = amigos.get(i).getCorreoElectronico();
            if (correo.equals(correoElectronicoABuscar)){
                amigos.remove(i);
            }
        }
    }
    
    public ArrayList<Amigo> obtenerAmigos(){
        return amigos;
    }
    
}
