package Programacion.Ejercicio8_9_10.Ejercicio9;

public class Circle extends GeometricFigure{

    private double radius;

    public Circle (double radius){

        this.radius = radius;

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double CalcularArea() {

        return Math.PI * Math.pow(radius,2);

    }

    @Override
    public double CalcularPerimetro() {

        return 2*Math.PI*radius;

    }


}
