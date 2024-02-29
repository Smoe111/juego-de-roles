package co.edu.uniquindio.poo;
import java.util.ArrayList;
import java.util.List;

public class Jugador{
    List<Personaje> listaPersonajes;
    DirectorPersonaje personaje;

}

public Jugador() {
    listaPersonajes = new ArrayList<>();
}

public void adicionarMago(String nombre, String descripcion, String apodo, float dineroInicial, List<String> atributos, List<String>habilidades){

    personaje= new DirectorPersonaje(new ConstructorMago());
}