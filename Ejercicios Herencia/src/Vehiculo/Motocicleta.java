package Vehiculo;

public class Motocicleta extends Vehiculo {
    private int km;
    private int cilindrada;

    public Motocicleta(String color, int ruedas,int km, int cilindrada) {
        super(color, ruedas);
        this.cilindrada = cilindrada;
        this.km = km;

    }

    public int getCilindrada() {
        return cilindrada;
    }
    public int getKm() {
        return km;
    }

    @Override
    void caracteristicas() {
            System.out.println("Color: "+getColor()+ "\nCantidad de Km/h maxima : "+ km+"\nRuedas: "+getRuedas()+"\n Cilindrada: "+cilindrada);
        }
    }



