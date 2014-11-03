/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author Benjamin
 */
public class Pokemon extends EspeciePokemon {
    EspeciePokemon especieP;
    int PS, atk, def, atkEsp, defEsp;
    String estado;
    MovAprendido movimientos;
    
    public int getPS(){
        return PS;
    }
    public int getAtaque(){
        return atk;
    }
    
}
