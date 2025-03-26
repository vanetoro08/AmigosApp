package aplicacionAmigos.main;

// @author vanes

import aplicacionAmigos.models.Aplicacion;
import aplicacionAmigos.views.VentanaPrincipal;

/**
 * Modelo de app de amigos
 * @since 20250326
 * @version 1.0
 * @author Nicoloas Agudelo
 * @author Vanessa Toro
 */



public class Main {
    
    public static void main(String[] args) {
        /**
         * 
         * instancia de la app
         * 
         */
        Aplicacion appAmigos = new Aplicacion();
        /**
         * 
         * instancia de la ventana principal
         * 
         */
        VentanaPrincipal ventana = new VentanaPrincipal (appAmigos);
        ventana.setVisible (true);
    }
}
