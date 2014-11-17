package Controlador;

import Vista.VistaPrincipal;
import Vista.VistaLogin;

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
        this.vl.setVisible(false);
        ControladorCreaUsuario cu = new ControladorCreaUsuario();
        cu.Iniciar(this);
    }
}
