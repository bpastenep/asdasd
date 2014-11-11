package Controlador;


import Modelo.Entrenador;
import Modelo.MovAprendido;
import Modelo.Movimiento;
import Modelo.Pokemon;
import Vista.VistaCombate;


public class ControladorCombate {
    public VistaCombate vc;
    public Pokemon[] listadoPokemon;
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
    public Pokemon[] equipo2={p2,p1,p3,p4,p5,p6};
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
        vc= new VistaCombate(this,cp,usu1,usu2,equipoP, equipo2);
        System.out.println("llego hasta acá");
        vc.setVisible(true);
    }


    public void atacar(boolean contacto, int ps, int atk, int atkEsp, int def, int defEsp, Pokemon[] e1){
        System.out.println("Intentará atacar");
        if(contacto){
            System.out.println("Ataque: "+ atk);
            System.out.println("Defensa: "+def);
            if(def > atk)
                e1[0].setPS(ps-1);
            else{
                System.out.println("Atacó");
                e1[0].setPS(ps-(atk-def));
            }
        }
        else{
            if(defEsp > atkEsp)
                e1[0].setPS((ps-1));
            else{
                System.out.println("Atacó");
                e1[0].setPS(ps-(atkEsp-defEsp));
            }
        }
    }
    
    public void actualizaDatos(){
    
    }
    
    public int actualizaHp(Pokemon[] listaPkmn){
        listaPkmn[0].setPS(this.hpFinal);
        System.out.println(this.hpFinal);
        return this.hpFinal;
    }
    
    public void actualizaCambio(int accion){
        
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
        this.listadoPokemon = listadoPkmn;
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
    public Pokemon[] realizarAccion(int op, int indiceP, Pokemon[] team1, Pokemon[] team2, int indiceA){
        System.out.println("Intenta realizar acción");
        if (op==1){//Si Opcion es igual a 1 representará que el jugdor desea atacar
            atacar(team1[0].movimientos.movimientosA[indiceA].isContacto(),team1[0].getPS(),team1[0].getAtaque()
                    ,team1[0].getAtkEsp(),team2[0].getDef(), team2[0].getDefEsp(), team2);
        }
        //Acá se debe agregar la opción de poder cambiar al pokemon con el que se tiene que pelear 
        else if (op == 2){
            team1=cambio(team1, indiceP);
        }
        return team1;
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
