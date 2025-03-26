package aplicacionAmigos.models;
import java.util.ArrayList; 
import manejoExcepciones.exceptions.AmigoExistenteException;
import manejoExcepciones.exceptions.AmigoNoEncontradoException;

/**
 * Modelo de app de amigos
 * @since 20250326
 * @version 1.0
 * @author Nicoloas Agudelo
 * @author Vanessa Toro
 */



public class Aplicacion {
    //atributos
    /**
     * arreglo dinamico que almacena los amigos
     */
    ArrayList<Amigo> amigos = new ArrayList<>();
    
    
    /**
     * Agrega un nuevo amigo al arreglo de amigos
     * @param amigoNuevo
     * @return
     * @throws AmigoExistenteException 
     */
    public boolean agregarAmigo(Amigo amigoNuevo) throws AmigoExistenteException{
        for (int i = 0; i < amigos.size(); i++) {
            if (amigos.get(i).getCorreoElectronico().equals(amigoNuevo.getCorreoElectronico())) {
                throw new AmigoExistenteException();
            }
        }
        return this.amigos.add(amigoNuevo); 
    }
    /**
     * Muestra el amigo que se desea buscar
     * @param correoElectronicoABuscar
     * @return
     * @throws AmigoNoEncontradoException 
     */
    public Amigo buscarAmigo(String correoElectronicoABuscar) throws AmigoNoEncontradoException{
        for(int i=0 ; i<amigos.size(); i++){
            String correo = amigos.get(i).getCorreoElectronico();
            if (correo.equals(correoElectronicoABuscar)){
                return amigos.get(i);
            }
        }
        throw new AmigoNoEncontradoException(); 
    }
    
    /**
     * Elimina un amigo mediante el correo electronico 
     * @param correoElectronicoABuscar 
     */
    public void EliminarAmigo(String correoElectronicoABuscar){
         for(int i=0 ; i<amigos.size(); i++){
            String correo = amigos.get(i).getCorreoElectronico();
            if (correo.equals(correoElectronicoABuscar)){
                amigos.remove(i);
            }
        }
    }
    /**
     * Retorna el arreglo de amigos
     * @return 
     */
    public ArrayList<Amigo> obtenerAmigos(){
        return amigos;
    }
    
}
