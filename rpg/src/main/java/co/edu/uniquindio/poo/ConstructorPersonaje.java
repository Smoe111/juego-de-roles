package co.edu.uniquindio.poo;

import java.util.List;

public interface ConstructorPersonaje {
    
    ConstructorPersonaje nombre(String nombre);
    ConstructorPersonaje descripcion(String descripcion);
    ConstructorPersonaje apodo(String apodo);
    ConstructorPersonaje dineroInicial(float dineroInicial );
    ConstructorPersonaje atributos( List<String> atributos);
    ConstructorPersonaje habilidades (List<String> habilidades);
    Personaje construir();
}
