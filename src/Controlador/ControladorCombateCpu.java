package Controlador;

import Modelo.Pokemon;
import Vista.VistaCombateUvsCpu;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControladorCombateCpu {
    public ControladorPrincipal cp;
    public ControladorCombate cc;
    public VistaCombateUvsCpu vcpu;
    public int pCambio = 0;
    String usua1;
    public int accion;
    
    
    public ControladorCombateCpu(ControladorPrincipal co, String u1) throws SQLException{
        this.cp=co;
        this.usua1=u1;
        this.cc=new ControladorCombate(this.cp, this.usua1, "CPU");
    }
    
    public void iniciarVUvsCpu(){
        vcpu = new VistaCombateUvsCpu(this, cc, this.cp, cc.usu1, cc.equipoP, cc.equipo2);
        vcpu.setVisible(true);
     }
    
    public int verificaHpCpu(Pokemon[] listaCpu){
        System.out.println("El PS es: "+ listaCpu[0].getPS());
        if(listaCpu[0].getPS() >20 /*Cambiar por HP INICIAL*/){
            this.accion = 1;
        }
        else if(listaCpu[0].getPS() <= 20 /*Cambiar por HP INICIAL*/){
            this.accion = 2;
        }
        else if(listaCpu[0].getPS() == 0){
            this.accion = 3;
        }
        return this.accion;
    }  
    
    // método que determina la acción a ser realizada por la cpu
    public Pokemon[] accionCpu(Pokemon[] listaCpu, Pokemon[] listaHumano, int caso){
        if(caso == 1){
            accionOfensiva(listaCpu, listaHumano);
        }
        else if(caso == 2){
            accionDefensiva(listaCpu, listaHumano);
        }
        else if(caso == 3){
            cc.cambiaDebil(listaCpu);
        }
        return listaCpu;
    }
    
    
    // método que determina la acción ofensiva de la cpu
    public Pokemon[] accionOfensiva(Pokemon[] listaCpu, Pokemon[] listaRival){
        if(listaCpu[0].getAtk() > listaCpu[0].getAtkEsp()){
            listaRival[0].setPS(listaRival[0].getPS() - listaCpu[0].getAtk());
            if(listaRival[0].getPS()<=0){
                listaRival[0].setPS(0);
                cc.cambiaDebil(listaRival);
            }
        }
        else if(listaCpu[0].getAtk() < listaCpu[0].getAtkEsp()){
            listaRival[0].setPS(listaRival[0].getPS() - listaCpu[0].getAtkEsp());
            if(listaRival[0].getPS()<=0){
                listaRival[0].setPS(0);
                cc.cambiaDebil(listaRival);
            }
        }
        return listaRival;
    }
    
    
    // método que determina la acción defensiva de la cpu
    public Pokemon[] accionDefensiva(Pokemon[] listaCpu, Pokemon[] listaRival){
        if(listaCpu[0].getDef() < listaRival[0].getAtk() && listaCpu[0].getDefEsp() >= listaRival[0].getAtkEsp()){
            for(int i = 0; i < listaCpu.length; i++){
                if(listaCpu[0].getDef() < listaCpu[i].getDef()){
                if( listaCpu[i].getPS()>0){
                    pCambio = i;
                    JOptionPane.showMessageDialog(null, "¡Cuidado! tu enemigo cambiará su pokemón por:" + listaCpu[pCambio].getNombre());
                    listaCpu=cc.cambio(listaCpu, pCambio); 
                    break;
                    }
                }
            }
            return listaCpu;
        }
        else if(listaCpu[0].getDef() >= listaRival[0].getAtk() && listaCpu[0].getDefEsp() < listaRival[0].getAtkEsp()){
            for(int i = 0; i < listaCpu.length; i++){
                if(listaCpu[0].getDefEsp()< listaCpu[i].getDefEsp()){
                    if( listaCpu[i].getPS()>0){
                    pCambio = i;
                    JOptionPane.showMessageDialog(null, "¡Cuidado! tu enemigo cambiará su pokemón por:" + listaCpu[pCambio].getNombre());
                    listaCpu=cc.cambio(listaCpu, pCambio); 
                    break;
                    }                   
                }
                
            }
            
            return listaCpu;
        }
        else if(listaCpu[0].getDef() < listaRival[0].getAtk() && listaCpu[0].getDefEsp() < listaRival[0].getAtkEsp()){
            for(int i = 0; i < listaCpu.length; i++){
                if(listaCpu[0].getDef() < listaCpu[i].getDef() || listaCpu[0].getDefEsp()< listaCpu[i].getDefEsp()){
                    if( listaCpu[i].getPS()>0){
                    pCambio = i;
                    JOptionPane.showMessageDialog(null, "¡ATENCION! \n Tu enemigo cambiará su pokemón por: " + listaCpu[pCambio].getNombre());
                    listaCpu=cc.cambio(listaCpu, pCambio); 
                    break;
                    }
                }
                
            } 
            return listaCpu;
        }
        else {
            for(int i=0;i<listaCpu.length;i++){
                if(listaCpu[i].getPS()>0){
                    pCambio = i;
                    JOptionPane.showMessageDialog(null, "¡Cuidado! tu enemigo cambiará su pokemón por:" + listaCpu[pCambio].getNombre());
                    listaCpu=cc.cambio(listaCpu, pCambio); 
                    break;
                }
            }
        }
        return null;
    }
    
    //Verifica que jugador es el ganador (Los recorre como una matriz? not even, wtf) (No se está usando)
    // lo modifiqué para usarlo en la torre de batalla
    public String jugadorGanador(Pokemon[] listaHum, Pokemon[] listaCpu){
        int c1=0, c2=0;
        for (int i=0;i<listaHum.length;i++){
            if (listaHum[i].getPS() <= 0){
                c1=c1+1;
            }
        }
        for(int j = 0; j < listaCpu.length; j++){
            if (listaCpu[j].getPS() <= 0){
                c2=c2+1;
            }
        }
        if (c1==listaHum.length){
            return "CPU";
        }
        else if(c2==listaCpu.length){
            return cc.usu1;
        }
        return null;
    }
    
    public boolean combateT(){
        if(vcpu.combateF){
            return false;
        }
        else{
            return true;
        }
    }
    public String Ganador(Pokemon[] e1, Pokemon[] e2){
           if(jugadorGanador(e1, e2) == usua1){
            JOptionPane.showMessageDialog(null, "El ganador es " + usua1 + "!");
            cp.setGanador(usua1);
            vcpu.setVisible(false);
            return usua1;
           }
           else if(jugadorGanador(e1,e2)=="CPU"){
            JOptionPane.showMessageDialog(null, "El ganador es CPU!");
            cp.setGanador("CPU");
            vcpu.setVisible(false);
            return "CPU";
           }
           return null;
    }   

    
    
}
