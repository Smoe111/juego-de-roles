package co.edu.uniquindio.poo;

import java.util.List;

public interface ConstructorPersonaje {
    
    void nombre(String nombre);
    void descripcion(String descripcion);
    void apodo(String apodo);
    void dineroInicial(float dineroInicial );
    void atributos( List<String> atributos);
    void habilidades (List<String> habilidades);
    Personaje construir();
}
