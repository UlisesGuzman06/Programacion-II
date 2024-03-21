package Vehiculo;

public class Coche extends Vehiculo {

    private int km;
    private int cilindrada;

    public Coche(String color, int ruedas,int km, int cilindrada) {
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

    public void setKm(int km) {
        this.km = km;
    }


    @Override
    void caracteristicas() {
        System.out.println("Color: "+getColor()+ "\nCantidad de Km/h maxima : "+ km+"\nRuedas: "+getRuedas()+"\n Cilindrada: "+cilindrada);
    }
}
