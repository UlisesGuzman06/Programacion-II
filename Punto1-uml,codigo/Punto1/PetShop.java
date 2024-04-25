package Programacion.TP2Animal;

import java.util.ArrayList;
import java.util.Objects;

public class PetShop {

    private ArrayList<Animal> arrayAnimals;
    private double moneyPetShop;

    public PetShop (double moneyPetShop){
        this.moneyPetShop = moneyPetShop;
        arrayAnimals = new ArrayList<>();
    }

    public double getMoneyPetShop() {
        return moneyPetShop;
    }

    public void setMoneyPetShop(double moneyPetShop) {
        this.moneyPetShop = moneyPetShop;
    }

    public void addAnimales(Animal a){

        if (arrayAnimals.contains(a)){

            System.out.println("El animal "+ a.getName() +"de raza "+a.getTypeAnimal()+ " ya se ha agregado a la " +
                    "tienda, no se puede agregar el mismo");

        }else {

            System.out.println("El animal "+ a.getName()+ " se ha agregado correctamente");
            arrayAnimals.add(a);

        }

    }

    public void Feed(String name){

        boolean variable = false;

        for (Animal a : arrayAnimals){

            if (Objects.equals(a.getName(), name) && !variable){

                variable = true;
                a.Alimentar();

            }

        }
        if (!variable){
            System.out.println("Animal con nombre "+ name+ " no encontrado");
        }

    }

    public void ListAnimals(){

        for (Animal a : arrayAnimals){

            System.out.println(a.toString());

        }

    }

    public void SoldAnimals(String name){

        boolean variable = false;
        Animal auxiliar = null;

        for (Animal a: arrayAnimals){

            if (Objects.equals(a.getName(), name) && !variable){

                System.out.println("Se ha vendido el animal "+ a.getName() + " de tipo "+ a.getTypeAnimal());
                moneyPetShop+= a.getPrice();
                auxiliar = a;
                variable = true;

            }

        }
        arrayAnimals.remove(auxiliar);
        if (!variable){

            System.out.println("No se ha encontrado el animal con nombre " + name);

        }

    }


}
