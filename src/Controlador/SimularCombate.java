/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;
import Modelo.Entrenador;

/**
 *
 * @author Benjamin
 */
public class SimularCombate {
    Combate c = new Combate();
    Entrenador winer;
    int seleccion;
    public Entrenador simularCombate(Entrenador j1, Entrenador j2){
        while(c.debilitado(j1.getePokemon(), j2.getePokemon())){
            c.realizarAccion(j1, j2, seleccion);
            c.realizarAccion(j2, j1, seleccion);
        }
        int gana;
        gana=c.jugadorGanador(j1.getePokemon(), j2.getePokemon());
        if(gana==1){
            winer=j1;
        }
        else{
            winer=j2;
        }
        return winer;
    }
    
}
