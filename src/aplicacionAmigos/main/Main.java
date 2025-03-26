package aplicacionAmigos.main;

// @author vanes

import aplicacionAmigos.models.Aplicacion;
import aplicacionAmigos.views.VentanaPrincipal;

public class Main {
    
    public static void main(String[] args) {
        Aplicacion appAmigos = new Aplicacion();
        
        VentanaPrincipal ventana = new VentanaPrincipal (appAmigos);
        ventana.setVisible (true);
    }
}
