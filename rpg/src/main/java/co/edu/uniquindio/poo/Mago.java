package co.edu.uniquindio.poo;

public class Mago extends Personaje {

    private int inteligencia=43;
    private int sabiduria=64;
    private int energiaEnergia=37;
    
    public Mago(String nombre,String descripcion, String apodo, float dineroInicial, int inteligencia, int sabiduria,
            int energiaEnergia) {
        super(nombre,descripcion, apodo, dineroInicial);
        this.inteligencia = inteligencia;
        this.sabiduria = sabiduria;
        this.energiaEnergia = energiaEnergia;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getSabiduria() {
        return sabiduria;
    }

    public int getEnergiaEnergia() {
        return energiaEnergia;
    }

    @Override

    public boolean validarAtributos(){

        return inteligencia==43 && sabiduria==64 && energiaEnergia==37;
    }

   
    
}
