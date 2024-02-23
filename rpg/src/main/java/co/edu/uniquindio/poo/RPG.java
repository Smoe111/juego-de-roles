package co.edu.uniquindio.poo;


import java.util.LinkedList;
import java.util.List;

public class RPG {

    private String nombreJuego;
    private List<Personaje> personajes;

    public RPG (String nombreJuego) {
        this.nombreJuego = nombreJuego;
        this.personajes= new LinkedList<>();
    }

    public String getNombre() {
        return nombreJuego;
    }


    public boolean verificarNombreExistente(String nombre){

        for(Personaje personaje: personajes){

            if (personaje.getNombre().equals(nombre)){
                //El nombre ya existe
                return true;
            }
        }
        return false;
    }

    public void agregarJugador(Personaje jugador){

        if(!verificarNombreExistente(jugador.getNombre())){
            personajes.add(jugador);
        }
        else{
            System.out.println("Este nombre ya ha sido elegido");
        }
    }
    
    
}
