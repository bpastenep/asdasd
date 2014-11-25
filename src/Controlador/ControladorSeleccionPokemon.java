package Controlador;

import Modelo.ConsultaSQL;
import java.sql.SQLException;
import Vista.VistaSeleccionPokemon;

public class ControladorSeleccionPokemon {
    
    private VistaSeleccionPokemon vSP;
    
     public void iniciarSeleccion() throws SQLException{
        vSP = new VistaSeleccionPokemon();
        vSP.setVisible(true);
    }
}
