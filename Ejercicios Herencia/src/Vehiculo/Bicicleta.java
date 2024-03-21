package Vehiculo;

public class Bicicleta extends Vehiculo{
    private String tipo;

    public Bicicleta(String color, int ruedas, String tipo) {
        super(color, ruedas);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    void caracteristicas() {
        System.out.println("Bicicleta tipo: "+tipo+"\nColor: "+getColor()+"\nRuedas: "+getRuedas());
    }
}
