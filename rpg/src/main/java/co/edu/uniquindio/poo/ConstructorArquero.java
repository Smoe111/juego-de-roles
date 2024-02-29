package co.edu.uniquindio.poo;

import java.util.List;

public class ConstructorArquero implements ConstructorPersonaje {

    private String nombre;
    private String descripcion;
    private String apodo;
    private float dineroInicial;
    private List<String> atributos;
    private List<String> habilidades;
    private ConstructorArquero(){}

    
    public void nombre(String nombre){
        this.nombre=nombre;
    }

    public void descripcion(String descripcion){
        this.descripcion=descripcion;
    }        

    public void apodo(String apodo){
        this.apodo=apodo;
    }

    public void dineroInicial(float dineroInicial){
        this.dineroInicial=dineroInicial;
    }

    public void atributos(List<String> atributos){
        this.atributos=atributos;
    }

    public void habilidades(List<String> habilidades){
        this.habilidades=habilidades;

    }


    @Override
    public Personaje construir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'construir'");
    }


}
