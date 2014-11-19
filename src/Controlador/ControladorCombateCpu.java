package Controlador;

import Modelo.Pokemon;
import Vista.VistaCombateUvsCpu;

public class ControladorCombateCpu {
    public ControladorPrincipal cp;
    public ControladorCombate cc;
    public VistaCombateUvsCpu vcpu;
    public int pCambio = 0;
    String usua1;
    public int accion;
    
    public ControladorCombateCpu(ControladorPrincipal co, String u1){
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
        System.out.println("Entro a clase con opcion" + caso);
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
            cc.cambiaDebil(listaRival);
        }
        else if(listaCpu[0].getAtk() < listaCpu[0].getAtkEsp()){
            listaRival[0].setPS(listaRival[0].getPS() - listaCpu[0].getAtkEsp());
            cc.cambiaDebil(listaRival);
        }
        return listaRival;
    }
    
    
    // método que determina la acción defensiva de la cpu
    public Pokemon[] accionDefensiva(Pokemon[] listaCpu, Pokemon[] listaRival){
        System.out.println("Entra acá");
        if(listaCpu[0].getDef() < listaRival[0].getAtk() && listaCpu[0].getDefEsp() >= listaRival[0].getAtkEsp()){
            for(int i = 0; i < listaCpu.length; i++){
                if(listaCpu[0].getDef() < listaCpu[i].getDef()){
                    pCambio = i;
                    break;
                }
            }
            listaCpu=cc.cambio(listaCpu, pCambio);
            return listaCpu;
        }
        else if(listaCpu[0].getDef() >= listaRival[0].getAtk() && listaCpu[0].getDefEsp() < listaRival[0].getAtkEsp()){
            for(int i = 0; i < listaCpu.length; i++){
                if(listaCpu[0].getDefEsp()< listaCpu[i].getDefEsp()){
                    pCambio = i;
                    break;
                    
                }
                
            }
            listaCpu=cc.cambio(listaCpu, pCambio);
            return listaCpu;
        }
        else if(listaCpu[0].getDef() < listaRival[0].getAtk() && listaCpu[0].getDefEsp() < listaRival[0].getAtkEsp()){
            for(int i = 0; i < listaCpu.length; i++){
                if(listaCpu[0].getDef() < listaCpu[i].getDef() || listaCpu[0].getDefEsp()< listaCpu[i].getDefEsp()){
                    pCambio = i;
                   break;
                }
                
            }
            listaCpu=cc.cambio(listaCpu, pCambio);
            return listaCpu;
        }
        return null;
    }
    
    
}
