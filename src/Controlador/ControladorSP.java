package Controlador;

import Vista.VistaSP;
import java.sql.SQLException;

public class ControladorSP {

    private VistaSP vistaSel;
    private String[] listaCPU;
    
    public void iniciaVSP() throws SQLException{
        this.vistaSel = new VistaSP(this, true);
        vistaSel.setVisible(true);
    }
    
    
}
