package co.edu.uniquindio.poo;

import java.util.List;

public class DirectorPersonaje {
    
    private ConstructorPersonaje constructor;

    public DirectorPersonaje(){
        this.constructor=constructor;
    }
    
    public void producto(String nombre, String descripcion, String apodo, float dineroInicial, List<String> atributos,List<String> habilidades){

        constructor.nombre(nombre);
        constructor.descripcion(descripcion);
        constructor.apodo(apodo);
        constructor.dineroInicial(dineroInicial);
        constructor.atributos(atributos);
        constructor.habilidades(habilidades);    

    }    
}
