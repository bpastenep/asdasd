package Controlador;

import Modelo.TorreDeBatalla;
import Modelo.Entrenador;
import Vista.VistaTorreBatalla;
import Controlador.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControladorTorreBatalla {
    private TorreDeBatalla tDB = new TorreDeBatalla();
    private Entrenador ent;
    private VistaTorreBatalla vtb;
    private ControladorPrincipal cp;
    private ControladorCombateCpu ccpu;
    private ControladorCombate cc;
    private int detNumC;//Numero de combates recibidos desde la vistaPrincipal
    private int numCV;//Numero de combates vencidos 
    private int cantidadCombateGanar;
    private String usu;
    private String ganador;
    private boolean conti;
    private int selec;
    
    
    public ControladorTorreBatalla(String usua, ControladorPrincipal co,int nB) throws SQLException{
        this.detNumC = nB;
        this.numCV =0;
        this.cp=co;
        this.usu=usua;
        if(nB!=5){
            conti=false;
            this.cantidadCombateGanar=numeroCombates();
            this.selec=nB;
        }
        else{
            conti=true;
            this.cantidadCombateGanar=Integer.parseInt(tDB.tipoTorre(usu).trim());
            this.selec=tDB.cantBatallas(cantidadCombateGanar);
        }
    }
    
    //metodo para contar nro victorias/derrotas
    
    public int numeroCombates() throws SQLException{
        if(getDetNumC() == 1)
            return 5;
        else if(getDetNumC() == 2)
            return 25;
        else if(getDetNumC() == 3)
            return 50;
        else 
            return 100;
    }
            

    public void validarTerminoTDB(){
        if(cantidadCombateGanar==getCBatallas()){
            JOptionPane.showMessageDialog(null, "HAS GANADO! FELICITACIONES");
            vtb.setVisible(false);
        }
    }
    
    public void iniciaTdB() throws SQLException{
        setVtb(new VistaTorreBatalla(this, getUsu(),conti));
        getVtb().setVisible(true);
    }    
    
    

    public void avanceTorre() throws SQLException{
            getCp().simularCombate(getUsu());
            if(validaGanador(getCp().getGanador())){
                setNumCV(getNumCV() + 1);
            }
            else {
                JOptionPane.showMessageDialog(null, "HAS PERDIDO!, VOLVERÁS AL MENU PRINCIPAL");
                vtb.setVisible(false);
            }
            
     }
        
    
    public boolean validaGanador(String u){
        if(u.compareToIgnoreCase(getUsu())==0){
            return true;
        }
        else
            return false;
    }
    
    public void guardarRegistro() throws SQLException {
        tDB.actualizar(getCBatallas(),usu,selec);
    }
    
    public ControladorTorreBatalla getcTb(){
        return this;
    }
    public void setGanador(String g){
        this.ganador=g;
    }

    public int getCBatallas() {
        return this.getNumCV();
    }

    public TorreDeBatalla gettDB() {
        return tDB;
    }

    public void settDB(TorreDeBatalla tDB) {
        this.tDB = tDB;
    }

    public Entrenador getEnt() {
        return ent;
    }

    public void setEnt(Entrenador ent) {
        this.ent = ent;
    }

    public VistaTorreBatalla getVtb() {
        return vtb;
    }

    public void setVtb(VistaTorreBatalla vtb) {
        this.vtb = vtb;
    }

    public ControladorPrincipal getCp() {
        return cp;
    }

    public void setCp(ControladorPrincipal cp) {
        this.cp = cp;
    }

    public ControladorCombateCpu getCcpu() {
        return ccpu;
    }

    public void setCcpu(ControladorCombateCpu ccpu) {
        this.ccpu = ccpu;
    }

    public ControladorCombate getCc() {
        return cc;
    }

    public void setCc(ControladorCombate cc) {
        this.cc = cc;
    }

    public int getDetNumC() {
        return detNumC;
    }

    public void setDetNumC(int detNumC) {
        this.detNumC = detNumC;
    }

    public int getNumCV() {
        return numCV;
    }

    public void setNumCV(int numCV) {
        this.numCV = numCV;
    }

    public String getUsu() {
        return usu;
    }

    public void setUsu(String usu) {
        this.usu = usu;
    }

    public String getGanador() {
        return ganador;
    }

    public int cBatallas(String usua1) throws SQLException {
        this.numCV=tDB.batallasDB(usu);
        return tDB.batallasDB(usu);
    }
    public int getCantidadCombateGanar(){
        return this.cantidadCombateGanar;
    }

    public int retornaPorcen() {
        int valor =(int)((getCBatallas()*100)/ cantidadCombateGanar);
        System.out.println(valor);
        return valor;
    }


}
