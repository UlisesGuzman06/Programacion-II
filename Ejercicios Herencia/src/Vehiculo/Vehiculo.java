package Vehiculo;

public abstract class Vehiculo{

    private String color;
    private int ruedas;
    public Vehiculo() {
    }
    public Vehiculo(String color, int ruedas) {
        this.color = color;
        this.ruedas = ruedas;
    }

    public String getColor() {
        return color;
    }

    public int getRuedas() {
        return ruedas;
    }

    abstract void caracteristicas();
}


