package Controlador;


import Modelo.Entrenador;
import Modelo.MovAprendido;
import Modelo.Movimiento;
import Modelo.Pokemon;
import Vista.VistaCombate;


public class ControladorCombate {
    public VistaCombate vc;
    public ControladorPrincipal cp;
    public String usu1,usu2;
    String[] cambio=null;
    //Esto se tiene que borrar ya que se sacará de la BD
    public Pokemon p1 = new Pokemon("Pikachu",(int)(Math.random()*50+1),(int)(Math.random()*50+1), (int)(Math.random()*50+1),(int)(Math.random()*50+1), 170);
    public Pokemon p2 = new Pokemon("Evee",(int)(Math.random()*50+1),(int)(Math.random()*50+1), (int)(Math.random()*50+1),(int)(Math.random()*50+1), 140);
    public Pokemon p3 = new Pokemon("Bulbasaur",(int)(Math.random()*50+1),(int)(Math.random()*50+1), (int)(Math.random()*50+1),(int)(Math.random()*50+1), 146);
    public Pokemon p4 = new Pokemon("Caterpie",(int)(Math.random()*50+1),(int)(Math.random()*50+1), (int)(Math.random()*50+1),(int)(Math.random()*50+1), 90);
    public Pokemon p5 = new Pokemon("Geodude",(int)(Math.random()*50+1),(int)(Math.random()*50+1), (int)(Math.random()*50+1),(int)(Math.random()*50+1), 220);
    public Pokemon p6 = new Pokemon("Snorlax",(int)(Math.random()*50+1),(int)(Math.random()*50+1), (int)(Math.random()*50+1),(int)(Math.random()*50+1), 250);
    public Pokemon[] equipoP= {p1,p2,p3,p4,p5,p6};
    //Contstructor
    
    public ControladorCombate(ControladorPrincipal op, String nusurio, String usua2) {
        System.out.println("entro al constructor");
        this.usu1=nusurio;
        this.cp=op;
        this.usu2=usua2;
        System.out.println("Salio del constructor");
    }
    
    public void iniciarV(){
        System.out.println("intento crear la vista");
        vc= new VistaCombate(this,cp,usu1,usu2,equipoP);
        System.out.println("llego hasta acá");
        vc.setVisible(true);
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

    public String[] asignaA(Pokemon[] e) {
        System.out.println("entra al metodo de los nombres");
        Movimiento[] ma;
        ma=e[0].getMovimientos();
        System.out.println(ma[0].getNombre());
        System.out.println("Logra crear el arreglo");
        String[] ataques = new String[ma.length];
        for (int i=0;i<ma.length;i++){
            System.out.println(ataques[i]);
            ataques[i]=ma[i].getNombre();
        }
        return ataques;    
    }

    public String[] asignaP(Pokemon[] e) {
       String[] equipo=new String[e.length];
       for (int i=0;i<e.length;i++){
           equipo[i]=e[i].getNombre();
       }
       return equipo;
    }

    
}
