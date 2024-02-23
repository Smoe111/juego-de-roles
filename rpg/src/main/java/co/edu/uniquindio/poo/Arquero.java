package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

public class Arquero extends Personaje {

    private int destreza=30;
    private int agilidad=67;
    private int precision=44;
    public List<HabilidadesArquero> habilidades;
    
    public Arquero(String nombre,String descripcion, String apodo, float dineroInicial, int destreza, int agilidad, int precision) {
        super(nombre,descripcion, apodo, dineroInicial);
        this.destreza = destreza;
        this.agilidad = agilidad;
        this.precision = precision;
        this.habilidades= new LinkedList<>();
        
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

    @Override

    public void agregarHabilidad(){

        habilidades.add(HabilidadesArquero.DISPARO_RAPIDO);
        habilidades.add(HabilidadesArquero.FLECHA_VENENOSA);
        habilidades.add(HabilidadesArquero.TIRO_CERTERO);
    }


    
}
