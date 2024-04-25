package Programacion.Ejercicio8_9_10.Ejercicio9;

public class Rectangle extends GeometricFigure{

    private double base;
    private double heigth;

    public Rectangle(double base, double heigth){

        this.heigth = heigth;
        this.base = base;

    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeigth() {
        return heigth;
    }

    public double getBase() {
        return base;
    }

    @Override
    double CalcularArea() {
        return heigth*base;
    }

    @Override
    double CalcularPerimetro() {
        return 2*(heigth)+2*(base);
    }
}
