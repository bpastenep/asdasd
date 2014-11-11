package Modelo;

public class MovAprendido extends Movimiento {
    
    public Movimiento[] movimientosA = new Movimiento[4];
    

    public MovAprendido() {
        
    }
    
    public void asignarAtaques(){
        for (int i=0;i<4;i++){
            this.movimientosA[i]= new Movimiento(i);
        }
    }
}
