package co.edu.uniquindio.poo;

public class Guerrero extends Personaje{

    private int fuerza=62;
    private int resistencia=35;
    private int vitalidad=37;
    
    public Guerrero(String nombre,String descripcion, String apodo, float dineroInicial, int fuerza, int resistencia, int vitalidad) {
        super(nombre,descripcion, apodo, dineroInicial);
        this.fuerza = fuerza;
        this.resistencia = resistencia;
        this.vitalidad = vitalidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getVitalidad() {
        return vitalidad;
    }

    @Override

    public boolean verificarAtributos(){

        return fuerza==62 && resistencia==35 && vitalidad==37;
    }


    
}
