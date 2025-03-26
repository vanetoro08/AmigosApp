package aplicacionAmigos.models;
import java.util.ArrayList; 
// @author vanes
public class Aplicacion {
    
    ArrayList<Amigo> amigos = new ArrayList<Amigo>();
    
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
            if (correo == correoElectronicoABuscar){
                return amigos.get(i);
            }
        }
        return null; 
    }
    
    public void EliminarAmigo(String correoElectronicoABuscar){
         for(int i=0 ; i<amigos.size(); i++){
            String correo = amigos.get(i).getCorreoElectronico();
            if (correo == correoElectronicoABuscar){
                amigos.remove(i);
            }
        }
    }
    
}
