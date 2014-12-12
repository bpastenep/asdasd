package Controlador;

import Modelo.Combate;
import Modelo.ConsultaSQL;
import Modelo.Entrenador;
import Modelo.MovAprendido;
import Modelo.Movimiento;
import Modelo.Pokemon;
import Vista.VistaCombateUvU;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControladorCombate {
    private VistaCombateUvU vc;
    private ControladorPrincipal cp;
    private String usu1,usu2,ganador;
    private Entrenador j1 = new Entrenador();
    private Entrenador j2 = new Entrenador();
    private float cteTipo;
    private boolean atkEx;
    private Pokemon[] equipoP;
    private Pokemon[] equipo2;
    private int hpFinal;
    private Combate com = new Combate();
    
    //Contstructor  
    public ControladorCombate(ControladorPrincipal op, String nusurio, String usua2) throws SQLException {
        this.usu1 = nusurio;
        this.cp = op;
        this.usu2 = usua2;
        try{
        j1.creaEntrenador(usu1);
        j2.creaEntrenador(getUsu2());
        }catch(SQLException ex){
            System.out.println(ex);
        }
        equipoP=j1.getePokemon();
        setEquipo2(j2.getePokemon());
    }
    
    //Se instancia la vista  
    public void iniciarVUvU() throws SQLException{
        vc = new VistaCombateUvU(this,cp, getUsu1(), getUsu2(), getEquipoP(), getEquipo2(), j1, j2);
        vc.setVisible(true);
    }

    public boolean hpTotal(Pokemon[] listaPActual){
        int hpT = 0;
        for(int i = 0; i < listaPActual.length; i++){
            int hpPkmn = listaPActual[i].getPS();
            hpT = hpT + hpPkmn;
        }
        if(hpT <= 0){
            return true;
        }
        else
            return false;
    }
    
    public void presAtk(int pres){
        int pA = (int)(Math.random()*100+1);
        if(pA >= pres || pA < 100){
            setAtkEx(false);
        }
        setAtkEx(true);
    }
    
    public int barraHp(Pokemon[] lista){
        int valor;
        valor = (int)(lista[0].getPS()/lista[0].getPSi())*100;
        return valor;
    }
    
    public void danoTipo(int idElAtk, int idElDef) throws SQLException{
        ConsultaSQL cte = new ConsultaSQL();
        cte.setResult("SELECT MULTIPLICADORDANO FROM NIVEL_DE_RESISTENCIA WHERE ID_ELEMENTOATACA =" + idElAtk + "AND ID_ELEMENTODEFIENDE =" + idElDef);
        while(cte.getResult().next()){
            setCteTipo(cte.getResult().getFloat(1));
        }
    }
    
    // recibe: PS, ATK, ATKESP, DEF, DEF, cteTipo (que corresponde al multiplicador del daño
    // dependiendo del tipo del ataque de entrada y el tipo del pokemon que recibe el ataque), pow (que es la potencia), 
    // la lista de pokemon y el tipo de contacto de un movimiento.
    public void atacar(int ps, int atk, int atkEsp, int def, int defEsp, int pres, float mTipo, int pow, int lvl, Pokemon[] lista1, boolean contacto){
        double dTipoC = (mTipo * (((0.2 * lvl + 1) * atk * pow)/(25 * def)));
        double dTipoD = (mTipo * (((0.2 * lvl + 1) * atkEsp * pow)/(25 * defEsp)));
        presAtk(pres);
        if(isAtkEx()){    
            if(contacto){
                if(ps - (int)dTipoC < 0){
                    lista1[0].setPS(0);
                    cambiaDebil(lista1);
                }
                else
                    lista1[0].setPS(ps - (int)dTipoC);
            }
            else{
                if(ps - (int)dTipoD < 0){
                    lista1[0].setPS(0);
                    cambiaDebil(lista1);
                }
                else
                    lista1[0].setPS(ps - (int)dTipoD);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "El ataque falló.");
        }    
    }
    
    //Cambiar un pokemon debitilitado 
    public void cambiaDebil(Pokemon[] listaActiva){
        int posicion = 0;
        JOptionPane.showMessageDialog(null, listaActiva[0].getNombre()+" ha sido debilitado.");
        for(int i = 0; i < listaActiva.length; i++){
            if(listaActiva[i].getPS() > 0){
                posicion = i;
                break;
            }
        }
        cambio(listaActiva, posicion);
    }
    
    //Cambia el orden de un pokemon
    public Pokemon[] cambio(Pokemon[] listadoPkmn, int selPkmn){
        Pokemon[] listadoPokemon=null;
        if(debilitado(listadoPkmn, selPkmn)){
            Pokemon aux;
            aux = listadoPkmn[0];
            listadoPkmn[0] = listadoPkmn[selPkmn];
            listadoPkmn[selPkmn] = aux;
            listadoPokemon = listadoPkmn;
        }
        else{   
            int pos=0;
            JOptionPane.showMessageDialog(null,listadoPkmn[selPkmn].getNombre()+ " Se encuentra DEBILITADO. Se asignará el siguiente del equipo que tenga PS para luchar´");
            for(int i = 0; i < (listadoPkmn.length) ;i++){
                if(listadoPkmn[i].getPS() > 0){
                    pos = i;
                    break;
                }
            }
            Pokemon aux;
            aux = listadoPkmn[0];
            listadoPkmn[0] = listadoPkmn[pos];
            listadoPkmn[pos] = aux;
            listadoPokemon = listadoPkmn;
        }
        return listadoPokemon;
    }

    //Verifica que un pokemon seleccionado no esté debilitado    
    public boolean debilitado(Pokemon[] e1, int index){
        if(e1[index].getPS()<=0)
            return false;
        else
            return true;
    }
    
    public int elFamilia(Pokemon poke) throws SQLException{
        int id = 0;
        ConsultaSQL obtId = new ConsultaSQL();
        obtId.setResult("select id_elemento from ELEMENTOS_POKEMON where ID_FAMILIAPOKEMON = " + poke.getIdFamilia());
        while(obtId.getResult().next()){
            id = obtId.getResult().getInt(1);
        }
        return id;
    }
    
    //Realiza la acción entre ataque o cambiar pokemon
    public Pokemon[] realizarAccion(int op, int indiceP, Pokemon[] team1, Pokemon[] team2, int indiceA) throws SQLException{
        if (op==1){
            danoTipo(team1[0].getMovimientos().getMovimientosA()[indiceA].getIdElemento(), elFamilia(team2[0]));
            hpTotal(team2);
            hpTotal(team1);
            //Si Opcion es igual a 1 representará que el jugdor desea atacar
            atacar(team2[0].getPS(), team1[0].getAtaque(), team1[0].getAtkEsp(), team2[0].getDef(), team2[0].getDefEsp(), 
            team1[0].getMovimientos().getMovimientosA()[indiceA].getPrecision() , getCteTipo(), team1[0].getMovimientos().getMovimientosA()[indiceA].getPotencia(), 
            team1[0].getnV(), team2 ,team1[0].getMovimientos().getMovimientosA()[indiceA].isContacto());
        }
        //Acá se debe agregar la opción de poder cambiar al pokemon con el que se tiene que pelear 
        else if (op == 2){
            team1 = cambio(team1, indiceP);
        }
        return team1;
    }
    
    

    //Metodo que inicializa los ataques que se mostrarán en la vista
    public String[] asignaA(Pokemon[] e) {
        String[] ataques = new String[e[0].getMovimientos().getMovimientosA().length];
        for (int i=0;i<e[0].getMovimientos().getMovimientosA().length;i++){
            ataques[i] = e[0].getMovimientos().getMovimientosA()[i].getNombre().trim();
        }
        return ataques;    
    }

    //Metodo que inicializa los pokemones que se mostrarán en la vista
    public String[] asignaP(Pokemon[] e) {
       String[] equipo=new String[e.length];
       for (int i=0;i<e.length;i++){
            if(e[i].getPS()<=0)
                equipo[i]="DEB "+e[i].getNombre().replaceAll(" ","");
            else
               equipo[i]=e[i].getNombre();
       }   
       return equipo;
    }
    
    public int pokeDeb(Pokemon[] e){
        int cont=0;
        for(int i=0;i<e.length;i++){
            if(e[i].getPS()>0){
                cont=cont+1;
            }
        }
        return cont;
    }

    public float getCteTipo() {
        return cteTipo;
    }

    public void setCteTipo(float muTipo) {
        this.cteTipo = muTipo;
    }

    public Pokemon[] getEquipoP() {
        return equipoP;
    }

    public void setEquipoP(Pokemon[] equipoP) {
        this.equipoP = equipoP;
    }

    public Pokemon[] getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Pokemon[] equipo2) {
        this.equipo2 = equipo2;
    }

    public String getUsu1() {
        return usu1;
    }

    public void setUsu1(String usu1) {
        this.usu1 = usu1;
    }

    public String getUsu2() {
        return usu2;
    }

    public void setUsu2(String usu2) {
        this.usu2 = usu2;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public boolean isAtkEx() {
        return atkEx;
    }

    public void setAtkEx(boolean atkEx) {
        this.atkEx = atkEx;
    }
    public Combate getCom(){
        return this.com;
    }
}
