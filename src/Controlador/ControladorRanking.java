package Controlador;

import Modelo.ConsultaSQL;
import Vista.VistaRanking;
import java.sql.SQLException;
import java.text.*;
import java.util.Date;

public class ControladorRanking {
    
    private String[][] ranking;
    private VistaRanking vR;
    private ConsultaSQL reqData;
    private int index;
    
    public ControladorRanking(){
        setReqData(new ConsultaSQL());
    }
    
    public void iniciaRanking(){
        setvR(new VistaRanking());
        getvR().setVisible(true);
    }

    public void largoLista() throws SQLException{
        getReqData().setResult("SELECT COUNT(*) FROM ENTRENADOR WHERE CATEGORIA_ENTRENADOR = 'Entrenador'");
        while(reqData.getResult().next()){
            setIndex(reqData.getResult().getInt(1));
        }
    }
    
    public void rankingVictorias() throws SQLException{
        int i = 0;
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("En rankingVictorias");
        largoLista();
        getReqData().setResult("select NOMBRE_ENTRENADOR, NUM_VICTORIAS from ENTRENADOR where CATEGORIA_ENTRENADOR = 'Entrenador' order by NUM_VICTORIAS desc");
        System.out.println(getIndex());
        this.ranking = new String[getIndex()][3];
        while(reqData.getResult().next()){
            System.out.println("segundo while");    
            if(i < getIndex()){
                this.ranking[i][0] = Integer.toString(i+1);
                this.ranking[i][1] = reqData.getResult().getString(1);
                this.ranking[i][2] = reqData.getResult().getString(2);
                i++;
            }
        }
        for(int a = 0; a < getRanking().length;a++){
            for(int b = 0; b < 3; b++){
                System.out.println(this.ranking[a][b]);
            }
        }
    }
    
    public VistaRanking getvR() {
        return vR;
    }

    public void setvR(VistaRanking vR) {
        this.vR = vR;
    }

    public ConsultaSQL getReqData() {
        return reqData;
    }

    public void setReqData(ConsultaSQL reqData) {
        this.reqData = reqData;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String[][] getRanking() {
        return ranking;
    }

    public void setRanking(String[][] ranking) {
        this.ranking = ranking;
    }   
}