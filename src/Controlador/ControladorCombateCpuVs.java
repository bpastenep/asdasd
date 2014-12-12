package Controlador;

import Controlador.ControladorCombateCpu;
import Modelo.Pokemon;
import Vista.VistaPrincipal;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ControladorCombateCpuVs {
    private ControladorPrincipal cp;
    private ControladorCombate cc;
    private ControladorCombateCpu ccpu;
    private int hpTotal;
    private VistaPrincipal vp;
    private Pokemon[] cpu1, cpu2;
    private String ganador;
    
    public ControladorCombateCpuVs(ControladorPrincipal co) throws SQLException{
        this.cp = co;
        this.ccpu = new ControladorCombateCpu(cp, "CPU");
        this.cc = new ControladorCombate(cp, "CPU", "CPU");
        setCpu1(cc.getEquipoP());
        setCpu2(cc.getEquipo2());
    }
    
    public int hpEquipo(Pokemon[] listaPokemon){
        System.out.println("Primer pokemón primera lista :"+listaPokemon[0].getNombre());
        for(int i = 1; i < listaPokemon.length ; i++){
            setHpTotal(listaPokemon[0].getPS()+listaPokemon[i].getPS());
        }
        return getHpTotal();
    }
    
    // metodo que haga pelear las dos cpus hasta que una tenga a todos
    // sus pkmns con hp == 0, o un hp total == 0
    public void combateEntreCpu(Pokemon[] listaCpu1, Pokemon[] listaCpu2){
        /*mientras haya hp en las dos listas*/
        while(hpEquipo(listaCpu1) > 0 && hpEquipo(listaCpu2) > 0){
            
            /*se actualizan las listas de cada cpu a partir de la acción que realizan*/
            try{
            listaCpu1 = ccpu.accionCpu(listaCpu1, listaCpu2, ccpu.verificaHpCpu(listaCpu1));
            listaCpu2 = ccpu.accionCpu(listaCpu2, listaCpu1, ccpu.verificaHpCpu(listaCpu2));
            }catch(SQLException ex){}
            if(hpEquipo(listaCpu1) <= 0){
                
                System.out.println("setea ganador 1");
                setGanador("CPU 2");
                break;
            }
            else if(hpEquipo(listaCpu2) <= 0){
                System.out.println("setea ganador 2");
                setGanador("CPU 1, con");
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Gano "+ getGanador());
    }

    public Pokemon[] getCpu1() {
        return cpu1;
    }

    public void setCpu1(Pokemon[] cpu1) {
        this.cpu1 = cpu1;
    }

    public Pokemon[] getCpu2() {
        return cpu2;
    }

    public void setCpu2(Pokemon[] cpu2) {
        this.cpu2 = cpu2;
    }

    public int getHpTotal() {
        return hpTotal;
    }

    public void setHpTotal(int hpTotal) {
        this.hpTotal = hpTotal;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }
}