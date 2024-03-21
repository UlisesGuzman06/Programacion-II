package Animales;

public class Main {
    public static void main(String[] args) {

        Perro perro1 = new Perro("Kalen",5,"macho","caniche","blanco","pequeño");
        Gato gato1 = new Gato("Monica",12,"Hembra","Negro","Celestes");
        Pajaro pajaro1 = new Pajaro("Jorgelito",26,"Macho","Loro","Verde");

        perro1.informacion();
        perro1.hacerSonidos();
        System.out.println("\n");
        gato1.informacion();
        gato1.hacerSonidos();
        System.out.println("\n");
        pajaro1.informacion();
        pajaro1.hacerSonidos();
    }
}
