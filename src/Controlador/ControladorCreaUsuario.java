/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Entrenador;
import Modelo.MovAprendido;
import Modelo.Pokemon;
import Vista.VistaCreaU;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Benjamin
 */
public class ControladorCreaUsuario {
    private VistaCreaU vu;
    Pokemon poke = new Pokemon();
    Entrenador entre = new Entrenador();
    MovAprendido mov = new MovAprendido();
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

    public void creaU(String[] poke1,String[] poke2,String[] poke3,String[] poke4,String[] poke5,String[] poke6, String nUsuario, String pass) throws SQLException {
        int id1,id2,id3,id4,id5,id6,idE;
        JOptionPane.showMessageDialog(null, "Llega acá (?)");
        idE=entre.creaE(nUsuario,pass);
        id1=poke.creaP(poke1[0],poke1[1],poke1[6]);
        mov.creaMov(poke1[2],poke1[3],poke1[4],poke1[5],idE,id1,poke1[6]);
        id2=poke.creaP(poke2[0],poke2[1],poke2[6]);
        mov.creaMov(poke2[2],poke2[3],poke2[4],poke2[5],idE,id2,poke2[6]);
        id3=poke.creaP(poke3[0],poke3[1],poke3[6]);
        mov.creaMov(poke3[2],poke3[3],poke3[4],poke3[5],idE,id3,poke3[6]);
        id4=poke.creaP(poke4[0],poke4[1],poke4[6]);
        mov.creaMov(poke4[2],poke4[3],poke4[4],poke4[5],idE,id4,poke4[6]);
        id5=poke.creaP(poke5[0],poke5[1],poke5[6]);
        mov.creaMov(poke5[2],poke5[3],poke5[4],poke5[5],idE,id5,poke5[6]);
        id6=poke.creaP(poke6[0],poke6[1],poke6[6]);
        mov.creaMov(poke6[2],poke6[3],poke6[4],poke6[5],idE,id6,poke6[6]);
    }
}
