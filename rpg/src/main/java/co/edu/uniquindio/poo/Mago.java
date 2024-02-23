package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

public class Mago extends Personaje {

    private int inteligencia=43;
    private int sabiduria=64;
    private int energiaEnergia=37;
    public List<HabilidadesMago> habilidades;
    
    public Mago(String nombre,String descripcion, String apodo, float dineroInicial, int inteligencia, int sabiduria,
            int energiaEnergia) {
        super(nombre,descripcion, apodo, dineroInicial);
        this.inteligencia = inteligencia;
        this.sabiduria = sabiduria;
        this.energiaEnergia = energiaEnergia;
        this.habilidades= new LinkedList<>();

    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getSabiduria() {
        return sabiduria;
    }

    public int getEnergiaEnergia() {
        return energiaEnergia;
    }

    @Override

    public boolean verificarAtributos(){

        return inteligencia==43 && sabiduria==64 && energiaEnergia==37;
    }

    @Override

    public void agregarHabilidad(){
        habilidades.add(HabilidadesMago.BOLA_DE_FUEGO);
        habilidades.add(HabilidadesMago.HECHIZO_DE_CURACION);
        habilidades.add(HabilidadesMago.RAYO_ELECTRICO);
    }

   
    
}
