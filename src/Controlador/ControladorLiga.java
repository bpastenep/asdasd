package Controlador;

import Modelo.ConsultaSQL;
import java.lang.Math;
import Vista.VistaLiga;
import java.sql.SQLException;

public class ControladorLiga {
    private VistaLiga vl;
    private int region;
    private String nombreRegion;
    private String[] listaEntrenadores = new String[8];
    
    public ControladorLiga(){
        this.region = (int)(Math.random()*(6)+1);
        casosRegiones(this.region);
    }
    
    public void combateRandom() throws SQLException{
        ConsultaSQL regActual = new ConsultaSQL();
        regActual.setResult("select NOMBRE_ENTRENADOR FROM ENTRENADOR WHERE ID_REGION =" + this.region + " and CATEGORIA_ENTRENADOR = 'Lider de Gimnasio'");
        int i = 0;
        while(regActual.getResult().next()){
            if(i < 8){
                listaEntrenadores[i] = regActual.getResult().getString(1);
                System.out.println(listaEntrenadores[i] + ". ");
                System.out.println(i);
            }
            i++;
        }
        System.out.println(getNombreRegion());
    }
    
    public void casosRegiones(int numRegion){
        switch(numRegion){
            case 1: setNombreRegion("Kanto");
                    break;
            case 2: setNombreRegion("Johto");
                    break;
            case 3: setNombreRegion("Hoenn");
                    break;
            case 4: setNombreRegion("Sinnoh");
                    break;
            case 5: setNombreRegion("Teselia");
                    break;
            case 6: setNombreRegion("Kalos");
                    break;
        }
    }
    
    public void iniciarVliga(){
        vl = new VistaLiga();
        vl.setVisible(true);
    }
    
    public String[] getListaEntrenadores() {
        return listaEntrenadores;
    }

    public void setListaEntrenadores(String[] listaEntrenadores) {
        this.listaEntrenadores = listaEntrenadores;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }
}