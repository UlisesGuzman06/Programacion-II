package Vehiculo;

public class Main {
    public static void main(String[] args) {

        Coche auto1 = new Coche("Rojo",4,250,1600);
        Motocicleta moto1 = new Motocicleta("Azul",2,200,600);
        Bicicleta bici1= new Bicicleta("Verde",2,"Urbana");
        Camioneta camioneta1= new Camioneta("Gris",4,500);

        auto1.caracteristicas();
        System.out.println("\n");
        moto1.caracteristicas();
        System.out.println("\n");
        bici1.caracteristicas();
        System.out.println("\n");
        camioneta1.caracteristicas();


    }
}