/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;
import Vista.VistaPrincipal;
import Vista.VistaLogin;
/**
 *
 * @author Benjamin
 */
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
    

    
}
