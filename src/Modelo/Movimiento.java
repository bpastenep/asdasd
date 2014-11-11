package Modelo;


public class Movimiento {
    private String nombre, efectoSecundario, tipo;
    private int potencia, precision, pP;
    private boolean contacto;
    
    public Movimiento(){
    }

    public Movimiento(int i) {
        System.out.println("Entra al constructor de movimiento");
        switch(i){
            case 0:
                System.out.println("Asigna cabezazo");
                this.nombre="Cabezazo";
                this.potencia=(int)(Math.random()*50+1);
                this.contacto=true;
                System.out.println("termina de asignar cabezazo");
                break;
            case 1:
                System.out.println("Asigna placaje");
                this.nombre="Placaje";
                this.potencia=(int)(Math.random()*50+1);
                this.contacto=true;
                System.out.println("termina con placaje");
                break; 
            case 2:
                this.nombre="Chirrido";
                this.potencia=(int)(Math.random()*50+1);
                this.contacto=false;
                break;
            case 3:
                this.nombre="Rapidez";
                this.potencia=(int)(Math.random()*50+1);
                this.contacto=false;
                break;                           
        }
    }

// get y set's  
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEfectoSecundario() {
        return efectoSecundario;
    }

    public void setEfectoSecundario(String efectoSecundario) {
        this.efectoSecundario = efectoSecundario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public int getpP() {
        return pP;
    }

    public void setpP(int pP) {
        this.pP = pP;
    }

    public boolean isContacto() {
        return contacto;
    }

    public void setContacto(boolean contacto) {
        this.contacto = contacto;
    }
}
