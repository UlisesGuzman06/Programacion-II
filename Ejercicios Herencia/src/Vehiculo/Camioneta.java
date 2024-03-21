package Vehiculo;

public class Camioneta extends Vehiculo {
    private int carga;

    public Camioneta(String color, int ruedas, int carga) {
        super(color, ruedas);
        this.carga = carga;
    }
    void caracteristicas(){
        System.out.println("Color: "+getColor()+"\nRuedas: "+getRuedas()+"\nCarga (kg): "+carga);
    }
}
