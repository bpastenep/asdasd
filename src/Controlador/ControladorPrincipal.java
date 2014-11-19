package Controlador;

import Vista.VistaPrincipal;
import Vista.VistaLogin;
import Modelo.Entrenador;

public class ControladorPrincipal {
    private VistaPrincipal vp;
    private VistaLogin vl;
    
    public ControladorPrincipal(){
    
    vl = new VistaLogin(this);
}
    public void iniciar(String nu){
        vp = new VistaPrincipal(this,nu);
        vl.setVisible(false);
        vp.setVisible(true);
    }
    public void iniciarL() {
        this.vl.setVisible(true);
    }

    public void cerrarIniciar() {
        this.vl.setVisible(true);
        ControladorCreaUsuario cu = new ControladorCreaUsuario();
        cu.Iniciar(this);
    }
    
    public Entrenador simularCombate (Entrenador j1){
        return j1;
    }
}
