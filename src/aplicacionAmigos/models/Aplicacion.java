package aplicacionAmigos.models;
import java.util.ArrayList; 
// @author vanes
public class Aplicacion {
    
    ArrayList<Amigo> amigos = new ArrayList<>();
    
    public boolean agregarAmigo(Amigo amigoNuevo){
        for(int i=0 ; i<amigos.size(); i++){
            if(amigoNuevo == amigos.get(i)){
                return false; 
            }
        }
        return true; 
    }
    
    public Amigo buscarAmigo(String correoElectronicoABuscar) {
        for(int i=0 ; i<amigos.size(); i++){
            String correo = amigos.get(i).getCorreoElectronico();
            if (correo.equals(correoElectronicoABuscar)){
                return amigos.get(i);
            }
        }
        return null; 
    }
    
    public void EliminarAmigo(String correoElectronicoABuscar){
         for(int i=0 ; i<amigos.size(); i++){
            String correo = amigos.get(i).getCorreoElectronico();
            if (correo.equals(correoElectronicoABuscar)){
                amigos.remove(i);
            }
        }
    }
    
}
