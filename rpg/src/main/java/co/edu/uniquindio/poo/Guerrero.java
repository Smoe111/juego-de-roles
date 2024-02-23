package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

public class Guerrero extends Personaje{

    private int fuerza=62;
    private int resistencia=35;
    private int vitalidad=37;
    public List<HabilidadesGuerrero> habilidades;

    
    public Guerrero(String nombre,String descripcion, String apodo, float dineroInicial, int fuerza, int resistencia, int vitalidad) {
        super(nombre,descripcion, apodo, dineroInicial);
        this.fuerza = fuerza;
        this.resistencia = resistencia;
        this.vitalidad = vitalidad;
        this.habilidades= new LinkedList<>();
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

    @Override

    public void agregarHabilidad(){

        habilidades.add(HabilidadesGuerrero.ESCUDO_PROTECTOR);
        habilidades.add(HabilidadesGuerrero.ESPADA_AFILADA);
        habilidades.add(HabilidadesGuerrero.GOLPE_DEFINITIVO);
    }

    
}
