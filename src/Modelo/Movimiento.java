package Modelo;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;


public class Movimiento {
    private String nombre, efectoSecundario, tipo,cantB;
    private int potencia, precision, pP,idMov,idElemento;
    private boolean contacto,confunde,envenena,congela,duerme,quema;
    
    public Movimiento(){
    }

    public Movimiento[] devuelveM() {
        
        Movimiento mov[] = new Movimiento[4];
        for (int i=0;i<mov.length;i++){
                mov[i]=new Movimiento();
            }
                mov[0].setNombre("Cabezazo");
                mov[0].setPotencia((int)(Math.random()*50+1));
                mov[0].setContacto(true);

                mov[1].setNombre("Placaje");
                mov[1].setPotencia((int)(Math.random()*50+1));
                mov[1].setContacto(true);

                mov[2].setNombre("Chirrido");
                mov[2].setPotencia((int)(Math.random()*50+1));
                mov[2].setContacto(false);

                mov[3].setNombre("Rapidez");
                mov[3].setPotencia((int)(Math.random()*50+1));
                mov[3].setContacto(false);

                return mov;
        }

    public Movimiento[] asignaAtaquesAprendidos(int indice)throws SQLException{
        Movimiento[] mov = new Movimiento[4];
        for (int i=0;i<mov.length;i++){
            mov[i]=new Movimiento();
        }
        ConsultaSQL datosM = new ConsultaSQL();
        datosM.setResult("select *  from movimiento inner join movimiento_aprendido on(movimiento_aprendido.ID_pokemon="+indice+" and movimiento.ID_MOVIMIENTO=movimiento_aprendido.ID_MOVIMIENTO)");
        int r=0;
        while(datosM.getResult().next()){
            if(r<4){ 
                mov[r].setIdMov(datosM.getResult().getInt(1));
                mov[r].setIdElemento(datosM.getResult().getInt(2));
                mov[r].setNombre(datosM.getResult().getString(3));
                mov[r].setPotencia(datosM.getResult().getInt(4));
                mov[r].setPrecision(datosM.getResult().getInt(5));
                mov[r].setpP(datosM.getResult().getInt(6));
                mov[r].setCantB(datosM.getResult().getString(7));
                mov[r].setConfunde(datosM.getResult().getBoolean(8));
                mov[r].setEnvenena(datosM.getResult().getBoolean(9));
                mov[r].setCongela(datosM.getResult().getBoolean(8));
                mov[r].setDuerme(datosM.getResult().getBoolean(10));
                mov[r].setQuema(datosM.getResult().getBoolean(11));
                mov[r].setContacto(datosM.getResult().getBoolean(12));
            r=r+1;
            }
        }
        return mov;
     }

// get y set's  
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEfectoSecundario() {
        return efectoSecundario;
    }

    public void setEfectoSecundario(String efectoSecundario) {
        this.efectoSecundario = efectoSecundario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public int getpP() {
        return pP;
    }

    public void setpP(int pP) {
        this.pP = pP;
    }

    public boolean isContacto() {
        return contacto;
    }

    public void setContacto(boolean contacto) {
        this.contacto = contacto;
    }

    public String getCantB() {
        return cantB;
    }

    public void setCantB(String cantB) {
        this.cantB = cantB;
    }

    public int getIdMov() {
        return idMov;
    }

    public void setIdMov(int idMov) {
        this.idMov = idMov;
    }

    public int getIdElemento() {
        return idElemento;
    }

    public void setIdElemento(int idElemento) {
        this.idElemento = idElemento;
    }

    public boolean isConfunde() {
        return confunde;
    }

    public void setConfunde(boolean confunde) {
        this.confunde = confunde;
    }

    public boolean isEnvenena() {
        return envenena;
    }

    public void setEnvenena(boolean envenena) {
        this.envenena = envenena;
    }

    public boolean isCongela() {
        return congela;
    }

    public void setCongela(boolean congela) {
        this.congela = congela;
    }

    public boolean isDuerme() {
        return duerme;
    }

    public void setDuerme(boolean duerme) {
        this.duerme = duerme;
    }

    public boolean isQuema() {
        return quema;
    }

    public void setQuema(boolean quema) {
        this.quema = quema;
    }
}
