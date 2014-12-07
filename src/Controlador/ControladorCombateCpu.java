package Controlador;

import Modelo.ConsultaSQL;
import Modelo.Pokemon;
import Vista.VistaCombateUvsCpu;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControladorCombateCpu {
    private ControladorPrincipal cp;
    private ControladorCombate cc;
    private VistaCombateUvsCpu vcpu;
    private int pCambio = 0;
    private String usua1;
    private int accion;
    private float cteCambio;
    
    public ControladorCombateCpu(ControladorPrincipal co, String u1) throws SQLException{
        this.cp=co;
        this.usua1=u1;
        this.cc=new ControladorCombate(this.getCp(), this.getUsua1(), "CPU");
    }
    
    public void iniciarVUvsCpu(){
        setVcpu(new VistaCombateUvsCpu(this, getCc(), this.getCp(), getCc().getUsu1(), getCc().getEquipoP(), getCc().getEquipo2()));
        getVcpu().setVisible(true);
    }
    
    public int verificaHpCpu(Pokemon[] listaCpu){
        System.out.println("El PS es: "+ listaCpu[0].getPS());
        if(listaCpu[0].getPS() > (listaCpu[0].getPSi()/3) ){
            setAccion(1);
        }
        else if(listaCpu[0].getPS() <= (listaCpu[0].getPSi()/3) ){
            setAccion(2);
        }
        else if(listaCpu[0].getPS() <= 0){
            setAccion(3);
        }
        return getAccion();
    }  
    
    // método que determina la acción a ser realizada por la cpu
    public Pokemon[] accionCpu(Pokemon[] listaCpu, Pokemon[] listaHumano, int caso) throws SQLException{
        if(caso == 1){
            accionOfensiva(listaCpu, listaHumano);
        }
        else if(caso == 2){
            accionDefensiva(listaCpu, listaHumano);
        }
        else if(caso == 3){
            getCc().cambiaDebil(listaCpu);
        }
        return listaCpu;
    }
    
    /*public void buscaDebilidad(Pokemon elHum, Pokemon elCpu) throws SQLException{
        cc.danoTipo(cc.elFamilia(elHum), cc.elFamilia(elCpu));
        setCteCambio(cc.getCteTipo());
    }*/
    
    /*public void cambioDebilidad(Pokemon hum, Pokemon[] lista) throws SQLException{
        int cte1 = getCteCambio();
        System.out.println(cte1);
        for(int i = 0; i < lista.length; i++){
            buscaDebilidad(hum, lista[i]);
            int cte2 = getCteCambio();
            System.out.println(cte2);
            if(cte1 > cte2){
                cc.cambio(lista, i);
            }
            break;
        }
    }*/
    
    // método que determina la acción ofensiva de la cpu
    public Pokemon[] accionOfensiva(Pokemon[] listaCpu, Pokemon[] listaRival) throws SQLException{
        int inMov = (int)(Math.random()*3+0);
        
        if(listaCpu[0].getMovimientos().getMovimientosA()[inMov].isContacto()){
            System.out.println(getCteCambio()+", "+listaCpu[0].getnV()+", "+listaCpu[0].getAtk()+", "+ listaCpu[0].getMovimientos().getMovimientosA()[inMov].getPotencia()+", "+listaRival[0].getDef());
            cc.danoTipo(listaCpu[0].getMovimientos().getMovimientosA()[inMov].getIdElemento(), cc.elFamilia(listaRival[0]));
            setCteCambio(cc.getCteTipo());
            double dañoC = (getCteCambio() * (((0.2 * listaCpu[0].getnV() + 1) * listaCpu[0].getAtk() * listaCpu[0].getMovimientos().getMovimientosA()[inMov].getPotencia())/(25 * listaRival[0].getDef())));
            listaRival[0].setPS(listaRival[0].getPS() - (int) dañoC);
            if(listaRival[0].getPS() <= 0 ){
                listaRival[0].setPS(0);
                getCc().cambiaDebil(listaRival);
            }
        }
        else{
            System.out.println(getCteCambio()+", "+listaCpu[0].getnV()+", "+listaCpu[0].getAtk()+", "+ listaCpu[0].getMovimientos().getMovimientosA()[inMov].getPotencia()+", "+listaRival[0].getDef());
            cc.danoTipo(listaCpu[0].getMovimientos().getMovimientosA()[inMov].getIdElemento(), cc.elFamilia(listaRival[0]));
            setCteCambio(cc.getCteTipo());
            double dañoD = (getpCambio() * (((0.2 * listaCpu[0].getnV() + 1) * listaCpu[0].getAtkEsp()* listaCpu[0].getMovimientos().getMovimientosA()[inMov].getPotencia())/(25 * listaRival[0].getDefEsp())));
            listaRival[0].setPS(listaRival[0].getPS() - (int) dañoD);
            if(listaRival[0].getPS()<=0){
                listaRival[0].setPS(0);
                getCc().cambiaDebil(listaRival);
            }
        }
        return listaRival;
    }
    
    
    // método que determina la acción defensiva de la cpu
    public Pokemon[] accionDefensiva(Pokemon[] listaCpu, Pokemon[] listaRival){
        if(listaCpu[0].getDef() < listaRival[0].getAtk() && listaCpu[0].getDefEsp() >= listaRival[0].getAtkEsp()){
            for(int i = 0; i < listaCpu.length; i++){
                if(listaCpu[0].getDef() < listaCpu[i].getDef()){
                if( listaCpu[i].getPS()>0){
                        setpCambio(i);
                    JOptionPane.showMessageDialog(null, "¡ATENCION! \n Tu enemigo cambiará su pokemón por:" + listaCpu[getpCambio()].getNombre());
                    listaCpu = getCc().cambio(listaCpu, getpCambio()); 
                    break;
                    }
                }
            }
            return listaCpu;
        }
        else if(listaCpu[0].getDef() >= listaRival[0].getAtk() && listaCpu[0].getDefEsp() < listaRival[0].getAtkEsp()){
            for(int i = 0; i < listaCpu.length; i++){
                if(listaCpu[0].getDefEsp()< listaCpu[i].getDefEsp()){
                    if( listaCpu[i].getPS()>0){
                        setpCambio(i);
                    JOptionPane.showMessageDialog(null, "¡ATENCION! \n Tu enemigo cambiará su pokemón por:" + listaCpu[getpCambio()].getNombre());
                    listaCpu=getCc().cambio(listaCpu, getpCambio()); 
                    break;
                    }                   
                }
            }
            return listaCpu;
        }
        else if(listaCpu[0].getDef() < listaRival[0].getAtk() && listaCpu[0].getDefEsp() < listaRival[0].getAtkEsp()){
            for(int i = 0; i < listaCpu.length; i++){
                if(listaCpu[0].getDef() < listaCpu[i].getDef() || listaCpu[0].getDefEsp()< listaCpu[i].getDefEsp()){
                    if( listaCpu[i].getPS()>0){
                        setpCambio(i);
                    JOptionPane.showMessageDialog(null, "¡ATENCION! \n Tu enemigo cambiará su pokemón por: " + listaCpu[getpCambio()].getNombre());
                    listaCpu=getCc().cambio(listaCpu, getpCambio()); 
                    break;
                    }
                }
                
            } 
            return listaCpu;
        }
        else {
            for(int i=0;i<listaCpu.length;i++){
                if(listaCpu[i].getPS()>0){
                    setpCambio(i);
                    JOptionPane.showMessageDialog(null, "¡ATENCION! \n Tu enemigo cambiará su pokemón por:" + listaCpu[getpCambio()].getNombre());
                    listaCpu=getCc().cambio(listaCpu, getpCambio()); 
                    break;
                }
            }
        }
        return null;
    }
    
    //Verifica que jugador es el ganador (Los recorre como una matriz? not even, wtf) (No se está usando)
    // lo modifiqué para usarlo en la torre de batalla
    public String jugadorGanador(Pokemon[] listaHum, Pokemon[] listaCpu){
        int c1=0, c2=0;
        for (int i=0;i<listaHum.length;i++){
            if (listaHum[i].getPS() <= 0){
                c1=c1+1;
            }
        }
        for(int j = 0; j < listaCpu.length; j++){
            if (listaCpu[j].getPS() <= 0){
                c2=c2+1;
            }
        }
        if (c1==listaHum.length){
            return "CPU";
        }
        else if(c2==listaCpu.length){
            return getCc().getUsu1();
        }
        return null;
    }
    
    public boolean combateT(){
        if(getVcpu().isCombateF()){
            return false;
        }
        else{
            return true;
        }
    }
    public String Ganador(Pokemon[] e1, Pokemon[] e2){
           if(jugadorGanador(e1, e2) == getUsua1()){
            JOptionPane.showMessageDialog(null, "El ganador es " + getUsua1() + "!");
            getCp().setGanador(getUsua1());
            getVcpu().setVisible(false);
            return getUsua1();
           }
           else if(jugadorGanador(e1,e2)=="CPU"){
            JOptionPane.showMessageDialog(null, "El ganador es CPU!");
            getCp().setGanador("CPU");
            getVcpu().setVisible(false);
            return "CPU";
           }
           return null;
    }

    public ControladorPrincipal getCp() {
        return cp;
    }

    public void setCp(ControladorPrincipal cp) {
        this.cp = cp;
    }

    public ControladorCombate getCc() {
        return cc;
    }

    public void setCc(ControladorCombate cc) {
        this.cc = cc;
    }

    public VistaCombateUvsCpu getVcpu() {
        return vcpu;
    }

    public void setVcpu(VistaCombateUvsCpu vcpu) {
        this.vcpu = vcpu;
    }

    public int getpCambio() {
        return pCambio;
    }

    public void setpCambio(int pCambio) {
        this.pCambio = pCambio;
    }

    public String getUsua1() {
        return usua1;
    }

    public void setUsua1(String usua1) {
        this.usua1 = usua1;
    }

    public int getAccion() {
        return accion;
    }

    public void setAccion(int accion) {
        this.accion = accion;
    }

    public float getCteCambio() {
        return cteCambio;
    }

    public void setCteCambio(float cteCambio) {
        this.cteCambio = cteCambio;
    }
}