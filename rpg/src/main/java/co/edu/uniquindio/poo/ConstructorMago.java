package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;



public class ConstructorMago implements ConstructorPersonaje {

    private String nombre;
    private String descripcion;
    private String apodo;
    private float dineroInicial;
    private List<String> atributos;
    private List<String> habilidades;
    
    public ConstructorMago(){
        this.atributos= new ArrayList<>();
        this.habilidades= new ArrayList<>();
    }
    
    public ConstructorPersonaje nombre(String nombre){
        this.nombre=nombre;
        return this;
    }

    public ConstructorPersonaje descripcion(String descripcion){
        this.descripcion=descripcion;
        return this;
    }        

    public ConstructorPersonaje apodo(String apodo){
        this.apodo=apodo;
        return this;
    }

    public ConstructorPersonaje dineroInicial(float dineroInicial){
        this.dineroInicial=dineroInicial;
        return this;
    }

    public ConstructorPersonaje atributos(List<String> atributos){
        this.atributos=atributos;
        return this;
    }

    public ConstructorPersonaje habilidades(List<String> habilidades){
        this.habilidades=habilidades;
        return this;

    }

    @Override
    public Personaje construir() {
        
        Personaje personaje = new Personaje();

        personaje.setNombre(nombre);
        personaje.setDescripcion(descripcion);
        personaje.setApodo(apodo);
        personaje.setDineroInicial(dineroInicial);
        personaje.setAtributos(atributos);
        personaje.setHabilidades(habilidades);
        return personaje;

    }

    
}
