package Modelo;


public class Entrenador {
    String nombreE;
    String pass;
    int nroMedallas;
    Pokemon equipoPokemon[] = new Pokemon[6];
    
    public void cambiarPokemon(){
        
    }
    
    public Pokemon[] getePokemon(){
        return this.equipoPokemon;
    }
    public Pokemon getPokemon(int id){
        return this.equipoPokemon[id];
    }
}
