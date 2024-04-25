package Programacion.Ejercicio8_9_10.Ejercicio9;

public class mainNine {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10.5,22);

        Circle c1 = new Circle(31.12);

        System.out.println("Perimetro Ciruclo: "+ c1.CalcularPerimetro());
        System.out.println("Area ciruculo: "+ c1.CalcularArea());
        System.out.println("Perimetro rectangulo: "+ r1.CalcularPerimetro());
        System.out.println("Area rectangulo: "+ r1.CalcularArea());

    }
}
