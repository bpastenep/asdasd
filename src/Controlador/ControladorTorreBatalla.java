package Controlador;

import Modelo.TorreDeBatalla;
import Modelo.Entrenador;
import Vista.VistaTorreBatalla;
import Controlador.*;

public class ControladorTorreBatalla {
    public TorreDeBatalla tDB;
    public Entrenador ent;
    public VistaTorreBatalla vtb;
    public ControladorPrincipal cp;
    public ControladorCombateCpu ccpu;
    public ControladorCombate cc;
    public int detNumC;
    public String ganador;
    
    public ControladorTorreBatalla(/*int nB*/){
        //this.detNumC = nB;
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
        System.out.println("entra iniciaTdB");
        vtb = new VistaTorreBatalla();
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
        cp = new ControladorPrincipal();
        cp.simularCombate("a");
    }
}
