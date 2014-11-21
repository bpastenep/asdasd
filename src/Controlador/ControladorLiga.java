package Controlador;

import Vista.VistaLiga;

public class ControladorLiga {
    public VistaLiga vl;
    
    public void iniciarVliga(){
        vl = new VistaLiga();
        vl.setVisible(true);
    }
}
