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
    
   //Crea un equipo para un entrenador, ya asignado en la Base de Datos 
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
            equipoP[i]=equipoa[i-1];
        }
        return equipoP;
    }

    public String[] muestraAtaquePBD(String nombreP) throws SQLException {
        String[] ataquesA = new String[10000];
        ConsultaSQL ataques = new ConsultaSQL();
        ataques.setResult("select movimiento.nombre_movimiento  from movimiento inner join movimientos_posibles  on (movimiento.ID_MOVIMIENTO=movimientos_posibles.id_movimiento) inner join familia_pokemon on(familia_pokemon.ID_FAMILIAPOKEMON=movimientos_posibles.ID_FAMILIAPOKEMON) where familia_pokemon.NOMBRE_FAMILIAPOKEMON='"+nombreP+"'");
        int r=0;
        while(ataques.getResult().next()){
            ataquesA[r]=ataques.getResult().getString(1);
            r=r+1;
        }
        String[] ataquesF = new String[r+1];
        ataquesF[0]="Seleccione";
        for (int i=1;i<r+1;i++){
            ataquesF[i]=ataquesA[i-1];
            System.out.println("Ataques asignados :"+ataquesF[i]);
        }
        return ataquesF;
    }

    public int creaP(String mote, String nvl, String nombre) throws SQLException {
        ConsultaSQL poke = new ConsultaSQL();
        poke.setResult("select ID_FAMILIAPOKEMON,ataquebase_familiapokemon,ataquemax_familiapokemon,ataqueespecialbase_familiapokemon,ataqueespecialmax_familiapokemon,defensabase_familiapokemon,defensamax_familiapokemon,defensaespecialbase_familiapokemon,defensaespecialmax_familiapokemon,velocidadbase_familiapokemon,velocidadmax_familiapokemon,hpbase_familiapokemon,hpmax_familiapokemon from familia_pokemon where nombre_familiapokemon='"+nombre+"'");
        int idF=0,atkB=0,atkM=0,atkEB=0,atkEM=0,defB=0,defM=0,defEB=0,defEM=0,velB=0,velM=0,hpB=0,hpM=0;
        while(poke.getResult().next()){
            idF=poke.getResult().getInt(1);
            atkB=poke.getResult().getInt(2);
            atkM=poke.getResult().getInt(3);
            atkEB=poke.getResult().getInt(4);
            atkEM=poke.getResult().getInt(5);
            defB=poke.getResult().getInt(6);
            defM=poke.getResult().getInt(7);
            defEB=poke.getResult().getInt(8);
            defEM=poke.getResult().getInt(9);
            velB=poke.getResult().getInt(10);
            velM=poke.getResult().getInt(11);
            hpB=poke.getResult().getInt(12);
            hpM=poke.getResult().getInt(12);
        }
        int idP=0;
        poke.setResult("select pokemon.ID_pokemon from pokemon order by id_pokemon");
        while(poke.getResult().next()){
            idP=poke.getResult().getInt(1);
        }
        int ataque=0,ataqueE=0,defensa=0,defensaE=0,velocidad=0,puntosS=0;
        ataque=calculaPorc(atkB,atkM,Integer.parseInt(nvl));
        ataqueE=calculaPorc(atkEB,atkEM,Integer.parseInt(nvl));
        defensa=calculaPorc(defB,defM,Integer.parseInt(nvl));
        defensaE=calculaPorc(defEB,defEM,Integer.parseInt(nvl));
        velocidad=calculaPorc(velB,velM,Integer.parseInt(nvl));
        puntosS=calculaPorc(hpB,hpM,Integer.parseInt(nvl));
        poke.getUpdate("insert into pokemon (id_familiapokemon,id_pokemon,pseudonimo_pokemon,nivel_pokemon,puntossaludtotales_pokemon,puntossaludrestantes,ataque_pokemon,ataqueespecial_pokemon,defensa_pokemon,defensaespecial_pokemon,velocidad_pokemon) values ("+idF+","+(idP+1)+",'"+mote+"',"+nvl+","+puntosS+","+puntosS+","+ataque+","+ataqueE+","+defensa+","+defensaE+","+velocidad+")");
        return idP+1;
    }

    public int calculaPorc(int base, int maximo, int nvl){
        return (int)(base+(((nvl)*(maximo-base))/100));
    }


    
    
    
    
}
