package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;


public class Personaje {

    private String nombre;
    private String descripcion;
    private String apodo;
    private float dineroInicial;
    private List<String> atributos;
    private List<String> habilidades;

    public Personaje(){

        this.atributos= new ArrayList<>();
        this.habilidades= new ArrayList<>();
    }



    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getApodo() {
        return apodo;
    }
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }
    public float getDineroInicial() {
        return dineroInicial;
    }
    public void setDineroInicial(float dineroInicial) {
        this.dineroInicial = dineroInicial;
    }
    public List<String> getAtributos() {
        return atributos;
    }
    public void setAtributos(List<String> atributos) {
        this.atributos = atributos;
    }
    public List<String> getHabilidades() {
        return habilidades;
    }
    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }


}

