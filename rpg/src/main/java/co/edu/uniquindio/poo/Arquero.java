package co.edu.uniquindio.poo;

public class Arquero extends Personaje {

    private int destreza=30;
    private int agilidad=67;
    private int precision=44;
    
    public Arquero(String nombre,String descripcion, String apodo, float dineroInicial, int destreza, int agilidad, int precision) {
        super(nombre,descripcion, apodo, dineroInicial);
        this.destreza = destreza;
        this.agilidad = agilidad;
        this.precision = precision;
    }

    public int getDestreza() {
        return destreza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public int getPrecision() {
        return precision;
    }

    @Override

    public boolean verificarAtributos(){

        return destreza==30 && agilidad==67 &&precision==44;
    }


    
}
