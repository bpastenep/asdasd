package Modelo;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;


public class Pokemon extends EspeciePokemon {
    private int PSi;
    private int PS;
    private int atk;
    private int def;
    private int atkEsp;
    private int defEsp;
    private int nV;
    private int idPokemon;
    private int idFamilia;
    private int vel;
    private String estado;
    private String nombre;
    private MovAprendido movimientos=new MovAprendido();
    private Habilidad habilidad;
    
   public Pokemon[] creaEquipo(int idE) throws SQLException {
        ConsultaSQL datosP = new ConsultaSQL();
        Pokemon[] equipoP = new Pokemon[6];
        for(int i=0;i<equipoP.length;i++){
            equipoP[i]=new Pokemon();
        }
        datosP.setResult("select *  from pokemon inner join equipopokemon on(equipopokemon.ID_ENTRENADOR="+idE+" and pokemon.ID_POKEMON=equipopokemon.ID_POKEMON)");
        int r=0;
        while(datosP.getResult().next()){
            if(r<6){
                equipoP[r].setIdFamilia(datosP.getResult().getInt(1));
                equipoP[r].setIdPokemon(datosP.getResult().getInt(2));
                equipoP[r].movimientos.setMovimientosA(movimientos.asignaAtaquesAprendidos(datosP.getResult().getInt(2)));
                equipoP[r].setNombre(datosP.getResult().getString(3));
                equipoP[r].setnV(datosP.getResult().getInt(4));
                equipoP[r].setPSi(datosP.getResult().getInt(5));
                equipoP[r].setPS(datosP.getResult().getInt(6));
                equipoP[r].setAtk(datosP.getResult().getInt(7));
                equipoP[r].setAtkEsp(datosP.getResult().getInt(8));
                equipoP[r].setDef(datosP.getResult().getInt(9));
                equipoP[r].setDefEsp(datosP.getResult().getInt(10));
                equipoP[r].setVel(datosP.getResult().getInt(11));
                r=r+1;  
            }
        }
        datosP.cerrarConexion();
        return equipoP;
    }
    public Pokemon(String name, int a, int d, int ae, int de, int hp){
        movimientos.asignarAtaques();
        this.setNombre(name);
        setPS(hp);
        setAtk(a);
        setDef(d);
        setAtkEsp(ae);
        setDefEsp(d);
        setPSi(50);
        for(int i=0;i<4;i++){
            movimientos.asignarAtaques();
        }
        
    }
// get y set's  

     public Pokemon() {
  
    }
    

    public int getidP(){
        return getIdPokemon();
    }
    public int getPS(){
        return this.PS;
    }
    
    public int getAtaque(){
        return getAtk();
    }

    public void setPS(int PS) {
        this.PS=PS;
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

    public int getPSi() {
        return PSi;
    }

    public void setPSi(int PSi) {
        this.PSi = PSi;
    }

    public int getnV() {
        return nV;
    }

    public void setnV(int nV) {
        this.nV = nV;
    }

    public int getIdPokemon() {
        return idPokemon;
    }

    public void setIdPokemon(int idPokemon) {
        this.idPokemon = idPokemon;
    }

    public int getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(int idFamilia) {
        this.idFamilia = idFamilia;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] muestraPokemonBD() throws SQLException {
        String[] equipoa= new String[10000];
        ConsultaSQL nombres = new ConsultaSQL();
        nombres.setResult("select nombre_familiapokemon from familia_pokemon");
        int r=0;
        while(nombres.getResult().next()){
            equipoa[r]=nombres.getResult().getString(1);
            r=r+1;
        }
        String[] equipoP=new String[r+1];
        equipoP[0]="Selecciona tu Pokémon";
        for (int i=1;i<r+1;i++){
            equipoP[i]=equipoa[i];
        }
        return equipoP;
    }



    
    
    
    
}
