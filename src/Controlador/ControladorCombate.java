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
    //Esto se tiene que borrar ya que se sacará de la BD
    public Pokemon p1 = new Pokemon("Pikachu",(int)(Math.random()*50+1),(int)(Math.random()*50+1), (int)(Math.random()*50+1),(int)(Math.random()*50+1), 170);
    public Pokemon p2 = new Pokemon("Evee",(int)(Math.random()*50+1),(int)(Math.random()*50+1), (int)(Math.random()*50+1),(int)(Math.random()*50+1), 140);
    public Pokemon p3 = new Pokemon("Bulbasaur",(int)(Math.random()*50+1),(int)(Math.random()*50+1), (int)(Math.random()*50+1),(int)(Math.random()*50+1), 146);
    public Pokemon p4 = new Pokemon("Caterpie",(int)(Math.random()*50+1),(int)(Math.random()*50+1), (int)(Math.random()*50+1),(int)(Math.random()*50+1), 90);
    public Pokemon p5 = new Pokemon("Geodude",(int)(Math.random()*50+1),(int)(Math.random()*50+1), (int)(Math.random()*50+1),(int)(Math.random()*50+1), 220);
    public Pokemon p6 = new Pokemon("Snorlax",(int)(Math.random()*50+1),(int)(Math.random()*50+1), (int)(Math.random()*50+1),(int)(Math.random()*50+1), 250);
    public Pokemon[] equipoP= {p1,p2,p3,p4,p5,p6};
    public int hpFinal;
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
            else{
                this.hpFinal = ps - (atk - def);
                return ps - (atk - def);
            }
        }
        else{
            if(defEsp > atkEsp)
                return 1;
            else{
                this.hpFinal = ps - (atkEsp - defEsp);
                return ps - (atkEsp - defEsp);
            }
        }
    }
    
    public void actualizaHp(Pokemon[] listaPkmn){
        listaPkmn[0].setPS(this.hpFinal);
    }
    
    public void actualizaCambio(){
        
    }
    
    /*public void cambio(Pokemon[] listadoPkmn, int selPkmn){
        Pokemon aux;
        aux = listadoPkmn[0];
        listadoPkmn[0] = listadoPkmn[selPkmn];
        listadoPkmn[selPkmn] = aux;
    }*/
    
    public Pokemon[] cambio(Pokemon[] listadoPkmn, int selPkmn){
        Pokemon aux;
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
    public void realizarAccion(String[] e1, String[] e2,  int op, int indice, 
            String nombreAtaque, Pokemon[] team1, Pokemon[] team2){
        System.out.println("Intenta realizar acción");
        if (op==1){//Si Opcion es igual a 1 representará que el jugdor desea atacar
            atacar(team1[0].movimientos.movimientosA[indice].isContacto(),team1[0].getPS(),team1[0].getAtaque()
                    ,team1[0].getAtkEsp(),team1[0].getDef(), team1[0].getDefEsp());
        }
        //Acá se debe agregar la opción de poder cambiar al pokemon con el que se tiene que pelear 
        else if (op == 2){
            cambio(team1, indice);
        }
    }
    
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

    
    
    

    public String[] asignaA(Pokemon[] e) {
        MovAprendido ma;
        ma=e[0].getMovimientos();
        System.out.println("El movimiento es: "+ma.movimientosA[0].getNombre());
        String[] ataques = new String[ma.movimientosA.length];
        for (int i=0;i<ma.movimientosA.length;i++){
            ataques[i]=ma.movimientosA[i].getNombre();
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
