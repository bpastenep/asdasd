/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Pokemon;
import Vista.VistaCreaU;
import java.sql.SQLException;

/**
 *
 * @author Benjamin
 */
public class ControladorCreaUsuario {
    private VistaCreaU vu;
    Pokemon poke = new Pokemon();
    private ControladorPrincipal cp;
    public void Iniciar(ControladorPrincipal op) throws SQLException {
        VistaCreaU vu = new VistaCreaU(this,true);
        vu.setVisible(true);
        this.cp=op;
    }

    public String[] devuelvePoke() throws SQLException{
        String[] nombreP;
        nombreP = poke.muestraPokemonBD();
        return nombreP;
    }
    public void cerrar() {
       this.cp.iniciarL();
       this.vu.setVisible(false);
       
    }
    
    public String[] devuelveA(String nombreP) throws SQLException{
        String[] ataqueP;
        ataqueP=poke.muestraAtaquePBD(nombreP);
        return ataqueP;
    }
}
