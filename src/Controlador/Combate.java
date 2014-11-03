

package Controlador;
import Modelo.Pokemon;
import Modelo.Entrenador;
/**
 *
 * @author Benjamin
 */
public class Combate {
    public int Atacar(int ps, int daño){
        return (ps-daño);
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
    public void realizarAccion(Entrenador ja, Entrenador jb,  int op){
        if (op==1){//Si Opcion es igual a 1 representará que el jugdor desea atacar
            Atacar(ja.getPokemon(0).getAtaque(), jb.getPokemon(0).getPS());
        }
        //Acá se debe agregar la opción de poder cambiar al pokemon con el que se tiene que pelear 
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


    
}
