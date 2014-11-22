package Modelo;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;


public class Entrenador {
    private String nombreE;
    private String pass;
    private int nroMedallas;
    private Pokemon equipoPokemon[] = new Pokemon[6];
    
    public void cambiarPokemon(){
        
    }
    
    public boolean verificaEntrenador(String u, String p)throws SQLException{
        ConsultaSQL datosE = new ConsultaSQL();
        datosE.setResult("select pass,nombre_entrenador from ENTRENADOR where nombre_entrenador='"+u+"'");
        while(datosE.getResult().next()){
            if(datosE.getResult().getString(1).equalsIgnoreCase(p)){
                datosE.cerrarConexion();
                return true;
            }
        }
        datosE.cerrarConexion();
        return false;
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
