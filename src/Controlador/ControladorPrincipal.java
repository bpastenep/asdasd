package Controlador;

import Vista.VistaPrincipal;
import Vista.VistaLogin;
import Vista.VistaCombateUvsCpu;
import Modelo.Entrenador;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorPrincipal {
    private VistaCombateUvsCpu vcpu;
    private VistaPrincipal vp;
    private VistaLogin vl;
    public String ganador;
    ControladorCombateCpu ccpu;
    
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
    
    // cambiar el String por un entrenador
    public void simularCombate (String j1) throws SQLException{
        this.ccpu = new ControladorCombateCpu(this, j1);
        ccpu.iniciarVUvsCpu();
    }
    
    public void setGanador(String u){
        this.ganador=u;
    }
}
