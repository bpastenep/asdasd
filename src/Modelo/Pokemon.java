package Modelo;

import java.util.HashSet;
import java.util.Set;


public class Pokemon extends EspeciePokemon {
    public int PS, atk, def, atkEsp, defEsp;
    public String estado;
    public MovAprendido movimientos = new MovAprendido();
    public Habilidad habilidad;
    
    public Pokemon(String name, int a, int d, int ae, int de, int hp){
        this.setNombre(name);
        setPS(hp);
        setAtk(a);
        setDef(d);
        setAtkEsp(ae);
        setDefEsp(d);
        for(int i=0;i<4;i++){
            movimientos.asignarAtaques();
        }
        
    }
// get y set's  
    

    
    public int getPS(){
        return PS;
    }
    
    public int getAtaque(){
        return getAtk();
    }

    public void setPS(int PS) {
        this.PS = PS;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getAtkEsp() {
        return atkEsp;
    }

    public void setAtkEsp(int atkEsp) {
        this.atkEsp = atkEsp;
    }

    public int getDefEsp() {
        return defEsp;
    }

    public void setDefEsp(int defEsp) {
        this.defEsp = defEsp;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public MovAprendido getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(MovAprendido movimientos) {
        this.movimientos = movimientos;
    }

    public Habilidad getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(Habilidad habilidad) {
        this.habilidad = habilidad;
    }
    
}
