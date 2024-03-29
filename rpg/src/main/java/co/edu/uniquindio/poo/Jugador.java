package co.edu.uniquindio.poo;
import java.util.ArrayList;
import java.util.List;

public class Jugador{

    List<Personaje> listaPersonajes;
    DirectorPersonaje director;



//metodo verificar nombre   

    public Jugador() {
        listaPersonajes = new ArrayList<>();
    }

    public void adicionarMago(String nombre, String descripcion, String apodo, float dineroInicial, List<String> atributos, List<String>habilidades){

        ConstructorMago constructor= new ConstructorMago();
        director= new DirectorPersonaje(constructor);
        director.producto(nombre, descripcion, apodo, dineroInicial, atributos, habilidades);
        listaPersonajes.add(constructor.construir());
    } 

    public void adicionarArquero(String nombre, String descripcion, String apodo, float dineroInicial, List<String> atributos, List<String>habilidades){

        ConstructorArquero constructor= new ConstructorArquero();
        director= new DirectorPersonaje(constructor);
        director.producto(nombre, descripcion, apodo, dineroInicial, atributos, habilidades);
        listaPersonajes.add(constructor.construir());
    }

    public void adicionarGuerrero(String nombre, String descripcion, String apodo, float dineroInicial, List<String> atributos, List<String>habilidades){

        ConstructorGuerrero constructor= new ConstructorGuerrero();
        director= new DirectorPersonaje(constructor);
        director.producto(nombre, descripcion, apodo, dineroInicial, atributos, habilidades);
        listaPersonajes.add(constructor.construir());

    }


}

