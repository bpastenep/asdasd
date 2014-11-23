package Controlador;

import Modelo.TorreDeBatalla;
import Modelo.Entrenador;
import Vista.VistaTorreBatalla;
import Controlador.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControladorTorreBatalla {
    public TorreDeBatalla tDB;
    public Entrenador ent;
    public VistaTorreBatalla vtb;
    public ControladorPrincipal cp;
    public ControladorCombateCpu ccpu;
    public ControladorCombate cc;
    public int detNumC, numCV;
    public String usu;
    public String ganador;
    
    
    public ControladorTorreBatalla(String usua, ControladorPrincipal co/*int nB*/){
        //this.detNumC = nB;
        this.numCV =0;
        this.cp=co;
        this.usu=usua;
    }
    
    //metodo para contar nro victorias/derrotas
    
    public int numeroCombates(){
        if(detNumC == 1)
            return 5;
        else if(detNumC == 2)
            return 25;
        else if(detNumC == 3)
            return 50;
        else if(detNumC == 4)
            return 100;
        return 0;
    }
    
    public int contadorBatallas(){
        
        return 0;
    }
    
    
    
    public void iniciaTdB(){
        vtb = new VistaTorreBatalla(this,usu);
        vtb.setVisible(true);
    }    
    
    public void determinaGanador(){
        if(contadorBatallas() == 5)
            tDB.setCincoBatallas(true);
        if(contadorBatallas() == 25)
            tDB.setVenticincoBatallas(true);
        if(contadorBatallas() == 50)
            tDB.setCincuentaBatallas(true);
        if(contadorBatallas() == 100)
            tDB.setCienBatallas(true);
    }
    
    public void avanceTorre() throws SQLException{
            cp.simularCombate(usu);
            if(validaGanador(cp.ganador)){
                numCV=numCV+1;
            }
     }
        
    
    public boolean validaGanador(String u){
        if(u.compareToIgnoreCase(usu)==0){
            return true;
        }
        else
            return false;
    }
    
    public ControladorTorreBatalla getcTb(){
        return this;
    }
    public void setGanador(String g){
        this.ganador=g;
    }

    public int getCBatallas() {
        return this.numCV;
    }
}
