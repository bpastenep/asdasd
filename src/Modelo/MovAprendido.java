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

    public int creaMov(String ata1, String ata2, String ata3, String ata4, int idE, int id1, String nombre) throws SQLException {
        int idF=0;
        int[] idMov = new int[4];
        int[] pps = new int[4];
        String[] ataques = {ata1,ata2 ,ata3 ,ata4};
        ConsultaSQL sql = new ConsultaSQL();
        sql.setResult("select id_familiapokemon from familia_pokemon where nombre_familiapokemon='"+nombre+"'");
        while(sql.getResult().next()){
            idF=sql.getResult().getInt(1);
        }
        for (int i=0;i<4;i++){
            sql.setResult("select id_movimiento, puntospoder_movimiento from movimiento where nombre_movimiento='"+ataques[i]+"'");
            while(sql.getResult().next()){
                idMov[i]=sql.getResult().getInt(1);
                pps[i]=sql.getResult().getInt(2);
            }
        }
        for (int j=0;j<4;j++){
            sql.getUpdate("insert into movimiento_aprendido (id_movimiento,id_familiapokemon,POK_ID_FAMILIAPOKEMON,ID_POKEMON,PUNTOSPODERRESTANTES_MOVIMIENTOPOKEMON) values ("+idMov[j]+","+idF+","+idF+","+id1+ ","+pps[j]+")");
        }
     return idF;   
    }
}
