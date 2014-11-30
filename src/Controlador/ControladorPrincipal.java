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
    private String ganador;
    private ControladorCombateCpu ccpu;
    
    public ControladorPrincipal(){
    
    vl = new VistaLogin(this);
}
    public void iniciar(String nu){
        setVp(new VistaPrincipal(this,nu));
        getVl().setVisible(false);
        getVp().setVisible(true);
    }
    public void iniciarL() {
        this.getVl().setVisible(true);
    }

    public void cerrarIniciar() throws SQLException {
        this.getVl().setVisible(true);
        ControladorCreaUsuario cu = new ControladorCreaUsuario();
        cu.Iniciar(this);
    }
    
    // cambiar el String por un entrenador
    public void simularCombate (String j1) throws SQLException{
        this.setCcpu(new ControladorCombateCpu(this, j1));
        getCcpu().iniciarVUvsCpu();
    }
    
    public void setGanador(String u){
        this.ganador=u;
    }

    public VistaCombateUvsCpu getVcpu() {
        return vcpu;
    }

    public void setVcpu(VistaCombateUvsCpu vcpu) {
        this.vcpu = vcpu;
    }

    public VistaPrincipal getVp() {
        return vp;
    }

    public void setVp(VistaPrincipal vp) {
        this.vp = vp;
    }

    public VistaLogin getVl() {
        return vl;
    }

    public void setVl(VistaLogin vl) {
        this.vl = vl;
    }

    public String getGanador() {
        return ganador;
    }

    public ControladorCombateCpu getCcpu() {
        return ccpu;
    }

    public void setCcpu(ControladorCombateCpu ccpu) {
        this.ccpu = ccpu;
    }
}
