package Modelo;

import java.sql.SQLException;

public class MovAprendido extends Movimiento {
    
    private Movimiento[] movimientosA = new Movimiento[4];
    private Movimiento m = new Movimiento();
    
    public MovAprendido() {
        inicializaM(this.movimientosA);
    }
    
    public void asignarAtaques(){
        this.setMovimientosA(getM().devuelveM());
       
    }

    public void asgignarAtaques(int indice) throws SQLException {
        this.setMovimientosA(getM().asignaAtaquesAprendidos(indice));

    }
    

    private void inicializaM(Movimiento[] m) {
        for (int i=0;i<m.length;i++)
        {
            m[i]=new Movimiento();
        }
    }

    public Movimiento[] getMovimientosA() {
        return movimientosA;
    }

    public void setMovimientosA(Movimiento[] movimientosA) {
        this.movimientosA = movimientosA;
    }

    public Movimiento getM() {
        return m;
    }

    public void setM(Movimiento m) {
        this.m = m;
    }
}
