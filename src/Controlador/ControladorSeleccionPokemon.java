package Controlador;

import Modelo.ConsultaSQL;
import java.sql.SQLException;
import Vista.VistaSeleccionPokemon;

public class ControladorSeleccionPokemon {
    
    private ConsultaSQL listaP = new ConsultaSQL(), idMax = new ConsultaSQL();
    private String[] listaPkmnCB;
    private int numeroPokemon;
    private VistaSeleccionPokemon vSP;
    
     public void iniciarSeleccion() throws SQLException{
        vSP = new VistaSeleccionPokemon();
        vSP.setVisible(true);
    }
    
    public void obtieneMax() throws SQLException{
        idMax.setResult("SELECT MAX(ID_POKEMON) FROM POKEMON.POKEMON");
        while(idMax.getResult().next()){
            this.setNumeroPokemon(idMax.getResult().getInt(1));
        }
    }
    
    public void obtieneLista() throws SQLException{
        listaP.setResult("SELECT PSEUDONIMO_POKEMON FROM POKEMON.POKEMON");
        int itera = 0;
        setListaPkmnCB(new String[getNumeroPokemon()]);
        while(listaP.getResult().next()){
            if(itera < getNumeroPokemon()){
                getListaPkmnCB()[itera] = listaP.getResult().getString(1);
                System.out.println(getListaPkmnCB()[itera] + ". ");
                System.out.println(itera);
            }
            itera++;
        }
    }

    public String[] getListaPkmnCB() {
        return listaPkmnCB;
    }

    public void setListaPkmnCB(String[] listaPkmnCB) {
        this.listaPkmnCB = listaPkmnCB;
    }

    public int getNumeroPokemon() {
        return numeroPokemon;
    }

    public void setNumeroPokemon(int numeroPokemon) {
        this.numeroPokemon = numeroPokemon;
    }
}
