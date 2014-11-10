package Modelo;


public class Entrenador {
    private String nombreE;
    private String pass;
    private int nroMedallas;
    private Pokemon equipoPokemon[] = new Pokemon[6];
    
    public void cambiarPokemon(){
        
    }
    
// get y set's   

    public Pokemon[] getePokemon(){
        return this.equipoPokemon;
    }
    
    public Pokemon getPokemon(int id){
        return this.equipoPokemon[id];
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getNroMedallas() {
        return nroMedallas;
    }

    public void setNroMedallas(int nroMedallas) {
        this.nroMedallas = nroMedallas;
    }

}
