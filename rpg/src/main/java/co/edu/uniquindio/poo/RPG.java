package co.edu.uniquindio.poo;


import java.util.LinkedList;
import java.util.List;

public class RPG {

    private String nombre;
    private List<Personaje> personajes;

    public RPG (String nombre) {
        this.nombre = nombre;
        this.personajes= new LinkedList();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarPersonajes(Personaje personaje){
        personajes.add(personaje);
    
    }

   
    
    
}
