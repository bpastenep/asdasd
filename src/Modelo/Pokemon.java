package Modelo;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;


public class Pokemon extends EspeciePokemon {
    public int PSi, PS, atk, def, atkEsp, defEsp,nV,idPokemon,idFamilia;
    public String estado,nombre;
    public MovAprendido movimientos = new MovAprendido();
    public Habilidad habilidad;
    
   public Pokemon[] creaEquipo(int idE) throws SQLException {
        ConsultaSQL datosP = new ConsultaSQL();
        Pokemon[] equipoP = new Pokemon[11];
        datosP.setResult("select POKEMON.*  from pokemon inner join equipopokemon on (equipopokemon.ID_ENTRENADOR="+idE);
        int r=0;
        while(datosP.getResult().next()){
            if(r<6){
                equipoP[r].idFamilia=datosP.getResult().getInt(1);
                equipoP[r].idPokemon=datosP.getResult().getInt(2);
                
                r=r+1;  
            }
        }
        datosP.cerrarConexion();
        return equipoP;
    }
    public Pokemon(String name, int a, int d, int ae, int de, int hp){
        this.setNombre(name);
        setPSi(hp);
        setAtk(a);
        setDef(d);
        setAtkEsp(ae);
        setDefEsp(d);
        for(int i=0;i<4;i++){
            movimientos.asignarAtaques();
        }
        
    }
// get y set's  

    Pokemon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    public int getPS(){
        return PSi;
    }
    
    public int getAtaque(){
        return getAtk();
    }

    public void setPS(int PS) {
        this.PSi = PS;
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
