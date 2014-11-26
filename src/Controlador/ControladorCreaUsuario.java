/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Pokemon;
import Vista.VistaCreaU;
import java.sql.SQLException;

public class ControladorCreaUsuario {
    
    private VistaCreaU vu;
    private ControladorPrincipal cp;
    
    public void Iniciar(ControladorPrincipal op) throws SQLException {
        VistaCreaU vu = new VistaCreaU(this,true);
        vu.setVisible(true);
        this.cp=op;
    }

    public String[] devuelvePoke() throws SQLException{
        String[] nombreP;
        Pokemon poke = new Pokemon();
        nombreP = poke.muestraPokemonBD();
        return nombreP;
    }
    public void cerrar() {
       this.cp.iniciarL();
       this.vu.setVisible(false);
    }
    
}
