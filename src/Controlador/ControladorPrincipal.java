/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;
import Vista.VistaPrincipal;
/**
 *
 * @author Benjamin
 */
public class ControladorPrincipal {
    private VistaPrincipal vp;
    
    public ControladorPrincipal(){
    vp = new VistaPrincipal(this);
}

    public void iniciar() {
        this.vp.setVisible(true);
    }


    
}
