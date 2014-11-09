package Modelo;

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
