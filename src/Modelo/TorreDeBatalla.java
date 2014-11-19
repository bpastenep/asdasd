package Modelo;

public class TorreDeBatalla {
    
    private boolean cincoBatallas, venticincoBatallas, cincuentaBatallas, cienBatallas;
    private int cuentaVictorias;
    private int cuentaDerrotas;

// get y set's    
    
    public boolean isCincoBatallas() {
        return cincoBatallas;
    }

    public void setCincoBatallas(boolean cincoBatallas) {
        this.cincoBatallas = cincoBatallas;
    }

    public boolean isVenticincoBatallas() {
        return venticincoBatallas;
    }

    public void setVenticincoBatallas(boolean venticincoBatallas) {
        this.venticincoBatallas = venticincoBatallas;
    }

    public boolean isCincuentaBatallas() {
        return cincuentaBatallas;
    }

    public void setCincuentaBatallas(boolean cincuentaBatallas) {
        this.cincuentaBatallas = cincuentaBatallas;
    }

    public boolean isCienBatallas() {
        return cienBatallas;
    }

    public void setCienBatallas(boolean cienBatallas) {
        this.cienBatallas = cienBatallas;
    }

    public int getCuentaVictorias() {
        return cuentaVictorias;
    }

    public void setCuentaVictorias(int cuentaVictorias) {
        this.cuentaVictorias = cuentaVictorias;
    }

    public int getCuentaDerrotas() {
        return cuentaDerrotas;
    }

    public void setCuentaDerrotas(int cuentaDerrotas) {
        this.cuentaDerrotas = cuentaDerrotas;
    }
    
}
