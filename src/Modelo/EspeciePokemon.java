package Modelo;



abstract class EspeciePokemon {
    private String nombre, especie, natPrimaria, natSecundaria;
    private int nPokedex;

// get y set's
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNatPrimaria() {
        return natPrimaria;
    }

    public void setNatPrimaria(String natPrimaria) {
        this.natPrimaria = natPrimaria;
    }

    public String getNatSecundaria() {
        return natSecundaria;
    }

    public void setNatSecundaria(String natSecundaria) {
        this.natSecundaria = natSecundaria;
    }

    public int getnPokedex() {
        return nPokedex;
    }

    public void setnPokedex(int nPokedex) {
        this.nPokedex = nPokedex;
    }

    /*public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }*/
    
}
