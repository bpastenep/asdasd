package Modelo;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;


public class Entrenador {
    private String nombreE,pass;
    private int nroMedallas;
    private int idE;
    private Pokemon equipoPokemon[] = new Pokemon[6];
    
    public void cambiarPokemon(){
        
    }
    public int creaE(String u, String p) throws SQLException{
        ConsultaSQL datosE = new ConsultaSQL();
        datosE.setResult("select id_entrenador from entrenador order by id_entrenador");
        int id=0;
        while(datosE.getResult().next()){
            id=datosE.getResult().getInt(1);
        }
        datosE.getUpdate("insert into entrenador (id_entrenador,id_medalla,id_region,nombre_entrenador,categoria_entrenador,pass) values ("+(id+1)+",1,1,'"+u+"','Entrenador','"+p+"')");
        return(id+1);
    }
    public boolean verificaEntrenador(String u, String p)throws SQLException{
        ConsultaSQL datosE = new ConsultaSQL();
        datosE.setResult("select pass from ENTRENADOR where nombre_entrenador='"+u+"'");
        while(datosE.getResult().next()){
            if(datosE.getResult().getString(1).equalsIgnoreCase(p)){
                datosE.cerrarConexion();
                return true;
            }
        }
        datosE.cerrarConexion();
        return false;
    }
    
    public void creaEntrenador(String nombreE)throws SQLException{
        ConsultaSQL datosE = new ConsultaSQL();
        datosE.setResult("select nombre_entrenador,id_entrenador,id_medalla from ENTRENADOR where nombre_entrenador='"+nombreE+"'");
        while(datosE.getResult().next()){
            this.nombreE=datosE.getResult().getString(1);
            this.nroMedallas=datosE.getResult().getInt(2);
            this.idE=datosE.getResult().getInt(2);
        }
        if(this.nroMedallas==1){
            this.nroMedallas=0;
        }
        Pokemon p = new Pokemon();
        this.equipoPokemon=p.creaEquipo(idE);
        datosE.cerrarConexion();
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
    public int getIdE(){
        return this.idE;
    }

    public void asignaEquipo(int idE, int idP, int idF) throws SQLException {
        ConsultaSQL insertaE = new ConsultaSQL();
        insertaE.getUpdate("insert into equipopokemon (id_familiapokemon,id_pokemon,id_entrenador) values ("+idF+","+idP+","+idE+")");
        insertaE.cerrarConexion();
    }

}
