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
        this.cc = new ControladorCombate(cp, "CPU", "CPU_2");
        setCpu1(cc.getEquipoP());
        setCpu2(cc.getEquipo2());
    }
    
    // EL EQUIPO ESTÁ COMPUESTO SOLO POR PKMNS CON HP 0???
    // Se necesita el metodo que asigna el equipo a la cpu...
    public int hpEquipo(Pokemon[] listaPokemon){
        int hp = 0;
        for(int i = 0; i < listaPokemon.length ; i++){
            hp = hp + listaPokemon[i].getPS();
            System.out.println(hp);
            setHpTotal(hp);
        }
        return getHpTotal();
    }
    
    // metodo que haga pelear las dos cpus hasta que una tenga a todos
    // sus pkmns con hp == 0, o un hp total == 0
    public void combateEntreCpu(Pokemon[] listaCpu1, Pokemon[] listaCpu2){
        hpEquipo(listaCpu1);
        int h1 = getHpTotal();
        System.out.println(h1);
        hpEquipo(listaCpu2);
        int h2 = getHpTotal();
        System.out.println(h2);
        while(h1 > 0 && h2 > 0){
            /*se actualizan las listas de cada cpu a partir de la acción que realizan*/
            try{
                System.out.println("Combate");
                ccpu.verificaHpCpu(listaCpu1);
                listaCpu1 = ccpu.accionCpu(listaCpu1, listaCpu2, ccpu.getAccion());
                ccpu.verificaHpCpu(listaCpu2);
                listaCpu2 = ccpu.accionCpu(listaCpu2, listaCpu1, ccpu.getAccion());
            }catch(SQLException ex){System.out.println("oops");}
            if(h1 <= 0){
                setGanador("CPU 2, con " + listaCpu2[0].getNombre());
                break;
            }
            else if(h2 <= 0){
                setGanador("CPU, con " + listaCpu1[0].getNombre());
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