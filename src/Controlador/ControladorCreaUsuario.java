/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Vista.VistaCreaU;

/**
 *
 * @author Benjamin
 */
public class ControladorCreaUsuario {
    private VistaCreaU vu;
    private ControladorPrincipal cp;
    public void Iniciar(ControladorPrincipal op) {
        VistaCreaU vu = new VistaCreaU(this,true);
        vu.setVisible(true);
        this.cp=op;
    }

    void cerrar() {
       this.cp.iniciarL();
       this.vu.setVisible(false);
       
    }
    
}
