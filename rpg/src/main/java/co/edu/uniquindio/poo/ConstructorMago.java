package co.edu.uniquindio.poo;

import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

public class ConstructorMago implements ConstructorPersonaje {

    private String nombre;
    private String descripcion;
    private String apodo;
    private float dineroInicial;
    private List<String> atributos;
    private List<String> habilidades;
    private ConstructorMago(){}

    
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
        
        Mago.setNombre(nombre);
        Mago.setDescripcion(descripcion);
        Mago.setApodo(apodo);
        Mago.setDineroInicial(dineroInicial);
        Mago.setAtributos(atributos);
        Mago.setHabilidades(habilidades);
        return Mago;

        
    }

    
}
