package Controlador;


import Modelo.Pokemon;
import Modelo.Entrenador;
import Vista.VistaCombate;


public class ControladorCombate {
    public VistaCombate vc;
    public ControladorPrincipal cp;
    String[] cambio=null;
    public void iniciarV(){
        vc= new VistaCombate(this,cp);
        vc.setVisible(true);
    }

    public ControladorCombate(ControladorPrincipal op) {
        this.cp=op;
    }
    public int atacar(boolean contacto, int ps, int atk, int atkEsp, int def, int defEsp){
        if(contacto){
            if(def > atk)
                return 1;
            else
                return ps - (atk - def);
        }
        else{
            if(defEsp > atkEsp)
                return 1;
            else
                return ps - (atkEsp - defEsp);
        }
    }
    
    /*public void cambio(Pokemon[] listadoPkmn, int selPkmn){
        Pokemon aux;
        aux = listadoPkmn[0];
        listadoPkmn[0] = listadoPkmn[selPkmn];
        listadoPkmn[selPkmn] = aux;
    }*/
    
    public String[] cambioPrueba(String[] listadoPkmn, int selPkmn){
        System.out.println("llame la prueba");
        String aux;
        aux = listadoPkmn[0];
        listadoPkmn[0] = listadoPkmn[selPkmn];
        listadoPkmn[selPkmn] = aux;
        return listadoPkmn;
    }
    
    public boolean debilitado(Pokemon[] e1, Pokemon[] e2){
        for (int i=0;i<e1.length;i++){
            for(int j=0;j<e1.length;i++){
                if (e1[i].getPS() <= 0){
                    return false;
                }
                if (e2[j].getPS() <= 0){
                    return false;
                }
            }
        }
        return true;
    }
    /*public void realizarAccion(Entrenador ja, Entrenador jb,  int op){
        if (op==1){//Si Opcion es igual a 1 representará que el jugdor desea atacar
            atacar(ja.getPokemon(0).getContacto(), jb.getPokemon(0).getPS(), ja.getPokemon(0).getAtk(), ja.getPokemon(0).getAtkEsp(), ja.getPokemon(0).getDef(), ja.getPokemon(0).getDefEsp());
        }
        //Acá se debe agregar la opción de poder cambiar al pokemon con el que se tiene que pelear 
        else if (op == 2){
            //cambio();
        }
    }*/
    
    public int jugadorGanador(Pokemon[] e1, Pokemon[] e2){
        int c1=0, c2=0;
            for (int i=0;i<e1.length;i++){
            for(int j=0;j<e1.length;i++){
                if (e1[i].getPS() <= 0){
                    c1=c1+1;
                }
                if (e2[j].getPS() <= 0){
                    c2=c2+1;
                }
            }
        }
        if (c1==e1.length){
            return 1;
        }
        else if(c2==e2.length){
        return 2;
    }
        return 0;
    }

    public void realizarTurno(String[] l1, int opcion, int pos) {
        System.out.println(pos);
        System.out.println("llame al metodo");
        System.out.println(l1[0]);
        //if(opcion == 1){
        //}
        //else{
            System.out.println("Entre al metodo");
            cambio = cambioPrueba(l1, pos);
        //} 
    }

    public String[] actualizarDatos() {
        return cambio;
    }

    
}
