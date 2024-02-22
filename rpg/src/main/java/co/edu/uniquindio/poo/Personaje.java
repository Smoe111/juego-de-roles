package co.edu.uniquindio.poo;

public class Personaje {

    private String nombre;
    private String descripcion;
    private String apodo;
    private float dineroInicial=0;
    
    public Personaje(String nombre, String descripcion, String apodo, float dineroInicial) {
        
        this.nombre= nombre;
        this.descripcion = descripcion;
        this.apodo = apodo;
        this.dineroInicial = dineroInicial;
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

    

    
}
