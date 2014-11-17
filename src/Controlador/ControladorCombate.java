package Controlador;


import Modelo.Entrenador;
import Modelo.MovAprendido;
import Modelo.Movimiento;
import Modelo.Pokemon;
import Vista.VistaCombateUvU;
import javax.swing.JOptionPane;

public class ControladorCombate {
    public VistaCombateUvU vc;
    public ControladorPrincipal cp;
    public String usu1,usu2; 
    //Esto se tiene que borrar ya que se sacará de la BD
    public Pokemon p1 = new Pokemon("Pikachu",(int)(Math.random()*50+30),(int)(Math.random()*30+1), (int)(Math.random()*50+1),(int)(Math.random()*50+1), 50);
    public Pokemon p2 = new Pokemon("Evee",(int)(Math.random()*50+30),(int)(Math.random()*30+1), (int)(Math.random()*50+1),(int)(Math.random()*50+1), 50);
    public Pokemon p3 = new Pokemon("Bulbasaur",(int)(Math.random()*50+30),(int)(Math.random()*30+1), (int)(Math.random()*50+1),(int)(Math.random()*50+1), 50);
    public Pokemon p4 = new Pokemon("Caterpie",(int)(Math.random()*50+30),(int)(Math.random()*30+1), (int)(Math.random()*50+1),(int)(Math.random()*50+1), 50);
    public Pokemon p5 = new Pokemon("Geodude",(int)(Math.random()*50+30),(int)(Math.random()*30+1), (int)(Math.random()*50+1),(int)(Math.random()*50+1), 50);
    public Pokemon p6 = new Pokemon("Snorlax",(int)(Math.random()*50+30),(int)(Math.random()*30+1), (int)(Math.random()*50+1),(int)(Math.random()*50+1), 50);
    public Pokemon p7 = new Pokemon("Lapras",(int)(Math.random()*50+30),(int)(Math.random()*30+1), (int)(Math.random()*50+1),(int)(Math.random()*50+1), 50);
    public Pokemon p8 = new Pokemon("Haunter",(int)(Math.random()*50+30),(int)(Math.random()*30+1), (int)(Math.random()*50+1),(int)(Math.random()*50+1), 50);
    public Pokemon p9 = new Pokemon("Arceus",(int)(Math.random()*50+30),(int)(Math.random()*30+1), (int)(Math.random()*50+1),(int)(Math.random()*50+1), 50);
    public Pokemon p10 = new Pokemon("Celebi",(int)(Math.random()*50+30),(int)(Math.random()*30+1), (int)(Math.random()*50+1),(int)(Math.random()*50+1), 50);
    public Pokemon p11 = new Pokemon("Mew",(int)(Math.random()*50+30),(int)(Math.random()*30+1), (int)(Math.random()*50+1),(int)(Math.random()*50+1), 50);
    public Pokemon p12 = new Pokemon("Charizard",(int)(Math.random()*50+30),(int)(Math.random()*30+1), (int)(Math.random()*50+1),(int)(Math.random()*50+1), 50);
    public Pokemon[] equipoP= {p1,p2,p3,p4,p5,p6};
    public Pokemon[] equipo2={p7,p8,p9,p10,p11,p12};
    public int hpFinal;
    
    //Contstructor  
    public ControladorCombate(ControladorPrincipal op, String nusurio, String usua2) {
        System.out.println("entro al constructor");
        this.usu1=nusurio;
        this.cp=op;
        this.usu2=usua2;
        System.out.println("Salio del constructor");
    }
    
  //Se instancia la vista  
    public void iniciarVUvU(){
        vc= new VistaCombateUvU(this,cp,usu1,usu2,equipoP, equipo2);
        vc.setVisible(true);
    }

    public boolean hpTotal(Pokemon[] listaPActual){
        int hpT = 0;
        for(int i = 0; i < listaPActual.length; i++){
            int hpPkmn = listaPActual[i].getPS();
            hpT = hpT + hpPkmn;
        }
        if(hpT==0){
            return true;
        }
        else
            return false;
    }
    
    public int barraHp(Pokemon[] lista){
        int valor;
        System.out.println("PS POKEMON"+ lista[0].getPS());
        valor = (lista[0].getPS()*100)/50;
        System.out.println("Después de la división: "+ valor);
        //int porcentaje = Float.(valor);
        return valor;
    }
    
//Metodo que genera el ataque
    public void atacar(boolean contacto, int ps, int atk, int atkEsp, int def, int defEsp, Pokemon[] e1){
        System.out.println(atk +", "+ def);
        int pos = 0;
        if(contacto){
            if(def >= atk){
                if((ps - 1) <= 0){
                    e1[0].setPS(0);
                    cambiaDebil(e1);
                }
                else{
                    e1[0].setPS(ps-1);
                }
            }
            else{
                if(ps - (atk - def) <= 0){
                    e1[0].setPS(0);
                    cambiaDebil(e1);
                }
                else{
                    e1[0].setPS(ps-(atk-def));
                }
            }
        }
        else{
            if(defEsp >= atkEsp)
                if((ps - 1) <= 0){
                    e1[0].setPS(0);
                    cambiaDebil(e1);
                }
                else{
                    e1[0].setPS((ps-1));
                }
            else{
                if(ps-(atkEsp-defEsp) <= 0){
                    e1[0].setPS(0);
                    cambiaDebil(e1);
                }
                else{
                    e1[0].setPS(ps-(atkEsp-defEsp));
                }
            }
        }
    }
    
 //Cambiar un pokemon debitilitado 
    public void cambiaDebil(Pokemon[] listaActiva){
        int posicion = 0;
        JOptionPane.showMessageDialog(null, listaActiva[0].getNombre()+" ha sido debilitado.");
        for(int i = 0; i < listaActiva.length; i++){
            if(listaActiva[i].getPS() > 0){
                posicion = i;
                break;
            }
        }
        System.out.println(posicion);
        cambio(listaActiva, posicion);
    }
//Cambia el orden de un pokemon
    public Pokemon[] cambio(Pokemon[] listadoPkmn, int selPkmn){
        Pokemon[] listadoPokemon=null;
        if(debilitado(listadoPkmn, selPkmn)){
                System.out.println("Entro al primer if");
                Pokemon aux;
                aux = listadoPkmn[0];
                listadoPkmn[0] = listadoPkmn[selPkmn];
                listadoPkmn[selPkmn] = aux;
                listadoPokemon = listadoPkmn;
        }
        else{   
                int pos=0;
                JOptionPane.showMessageDialog(null,listadoPkmn[selPkmn].getNombre()+ " Se encuentra DEBILITADO. Se asignará el siguiente con pS :´"+listadoPkmn[selPkmn].getPS());
                for(int i = 0; i < (listadoPkmn.length) ;i++){
                        if(listadoPkmn[i].getPS() > 0){
                            System.out.println("Entra al if");
                            pos = i;
                            System.out.println("Posisicion asiganada"+i);
                            break;
                    }
                }        
                System.out.println("Ls posicion final fue. " + pos);
                Pokemon aux;
                aux = listadoPkmn[0];
                listadoPkmn[0] = listadoPkmn[pos];
                listadoPkmn[pos] = aux;
                listadoPokemon = listadoPkmn;
            
        }
        return listadoPokemon;
    }

//Verifica que un pokemon seleccionado no esté debilitado    
    public boolean debilitado(Pokemon[] e1, int index){
        if(e1[index].getPS()<=0)
            return false;
        else 
            return true;
    }

//Realiza la acción entre ataque o cambiar pokemon
    public Pokemon[] realizarAccion(int op, int indiceP, Pokemon[] team1, Pokemon[] team2, int indiceA){
        System.out.println("Intenta realizar acción");
        if (op==1){
            //Si Opcion es igual a 1 representará que el jugdor desea atacar
            
            atacar(team1[0].movimientos.movimientosA[indiceA].isContacto(),team2[0].getPS(),team1[0].getAtaque()
                    ,team1[0].getAtkEsp(),team2[0].getDef(), team2[0].getDefEsp(), team2);
        }
        //Acá se debe agregar la opción de poder cambiar al pokemon con el que se tiene que pelear 
        else if (op == 2){
            team1=cambio(team1, indiceP);
        }
        return team1;
    }
    
    
//Verifica que jugador es el ganador    
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

    //Metodo que inicializa los ataques que se mostrarán en la vista
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

    //Metodo que inicializa los pokemones que se mostrarán en la vista
    public String[] asignaP(Pokemon[] e) {
       String[] equipo=new String[e.length];
       for (int i=0;i<e.length;i++){
            if(e[i].getPS()<=0)
                equipo[i]="DEB "+e[i].getNombre();
            else
               equipo[i]=e[i].getNombre();
       }
       
       return equipo;
    }

    
}
