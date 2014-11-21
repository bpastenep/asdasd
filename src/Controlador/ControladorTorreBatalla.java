package Controlador;

import Modelo.TorreDeBatalla;
import Modelo.Entrenador;
import Vista.VistaTorreBatalla;
import Controlador.*;
import javax.swing.JOptionPane;

public class ControladorTorreBatalla {
    public TorreDeBatalla tDB;
    public Entrenador ent;
    public VistaTorreBatalla vtb;
    public ControladorPrincipal cp;
    public ControladorCombateCpu ccpu;
    public ControladorCombate cc;
    public int detNumC;
    public String usu;
    public String ganador;
    
    public ControladorTorreBatalla(String usua, ControladorPrincipal co/*int nB*/){
        //this.detNumC = nB;
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
    
    public void avanceTorre(){
        cp.simularCombate(usu);
       
        System.out.println("Pasa el intento de simulación del combate");
        if(validaGanador(cp.ganador)){
            JOptionPane.showMessageDialog(null, "El usuario ganó ´1 en la torre de batalla ");
        }
        else
            JOptionPane.showMessageDialog(null, "El usuario no gano nah en la torre de batalla ");
    }
    
    public boolean validaGanador(String u){
        JOptionPane.showMessageDialog(null, "Entra a éste metodo");
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
}
