package Programacion.TP2Animal;

import java.util.ArrayList;

public class mainAnimal {
    public static void main(String[] args) {
        Dog d = new Dog(7,"Bobby", 155.2, "Border Coly", true);
        Dog d1 = new Dog(7,"Bobby", 155.2, "Border Coly", false);
        Cat c = new Cat(5,"Antonio", 455.4, "Gato Persa", false);
        Fish f = new Fish(2,"Jorge", 1555, "Pez Payaso", TypeWater.Salada);
        Bird b = new Bird(3,"Tuki", 78546, "Guacamayo Rojo", true);

        PetShop p = new PetShop(0);

        p.addAnimales(d);
        p.addAnimales(c);
        p.addAnimales(d1);
        p.addAnimales(f);
        p.addAnimales(b);

        p.ListAnimals();

        p.Feed("Bobby");

        p.SoldAnimals("Bobby");

        System.out.println(p.getMoneyPetShop());

        p.ListAnimals();


    }
}
