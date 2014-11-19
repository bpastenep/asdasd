package Controlador;

import Modelo.TorreDeBatalla;
import Modelo.Entrenador;

public class ControladorTorreBatalla {
    TorreDeBatalla tDB;
    Entrenador ent;
    
    //metodo para contar nro victorias/derrotas
    
    public int contadorBatallas(){
        /*METODO*/
        return 0;
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
    
    
}
