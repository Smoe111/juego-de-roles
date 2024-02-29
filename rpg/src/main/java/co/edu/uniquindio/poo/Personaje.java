package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;


public class Personaje {

    private String nombre;
    private String descripcion;
    private String apodo;
    private float dineroInicial;
    private List<String> atributos;
    private List<String> habilidades;

    public void setNombre(String nombre) {
        Personaje.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        Personaje.descripcion = descripcion;
    }
    public static void setApodo(String apodo) {
        Personaje.apodo = apodo;
    }
    public static void setDineroInicial(float dineroInicial) {
        Personaje.dineroInicial = dineroInicial;
    }
    public static void setAtributos(List<String> atributos) {
        Personaje.atributos = atributos;
    }
    public static void setHabilidades(List<String> habilidades) {
        Personaje.habilidades = habilidades;
    }
    public static String getNombre() {
        return nombre;
    }
    public static String getDescripcion() {
        return descripcion;
    }
    public static String getApodo() {
        return apodo;
    }
    public static float getDineroInicial() {
        return dineroInicial;
    }
    public static List<String> getAtributos() {
        return atributos;
    }
    public static List<String> getHabilidades() {
        return habilidades;
    }

    public Personaje construir(){
        
        Personaje personaje =new Personaje();
        Personaje.setNombre(nombre);
        Personaje.setDescripcion(descripcion);
        Personaje.setApodo(apodo);
        Personaje.setDineroInicial(dineroInicial);
        Personaje.setAtributos(atributos);
        Personaje.setHabilidades(habilidades);
        return personaje;

    }

    
}
