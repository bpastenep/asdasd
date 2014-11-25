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
    
    public ControladorLiga() throws SQLException{
        System.out.println("Entra al constructor");
        this.region = (int)(Math.random()*(6)+1);
        casosRegiones(region);
        System.out.println("Sale del controlador");
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
    
    public void casosRegiones(int numRegion) throws SQLException{
        ConsultaSQL consultaRegion = new ConsultaSQL();
        consultaRegion.setResult("SELECT NOMBRE_REGION from region WHERE ID_REGION =" + numRegion);
        while(consultaRegion.getResult().next()){
            System.out.println("Entra al while con valor: "+consultaRegion.getResult().getString(1));
            setNombreRegion(consultaRegion.getResult().getString(1));
        }
    }
    
    public void iniciarVliga() throws SQLException{
        System.out.println("hola");
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