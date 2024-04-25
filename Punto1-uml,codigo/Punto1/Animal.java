package Programacion.TP2Animal;

abstract public class Animal {

    private int age;

    private String name;

    private double price;

    private AnimalType typeAnimal;

    public Animal(int age, String name, double price, AnimalType typeAnimal){
        this.name = name;
        this.price = price;
        this.typeAnimal = typeAnimal;
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public AnimalType getTypeAnimal() {
        return typeAnimal;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTypeAnimal(AnimalType typeAnimal) {
        this.typeAnimal = typeAnimal;
    }


    public void Alimentar(){
        System.out.println("El animal "+ this.getName()+ ", de tipo "+this.getTypeAnimal() +" ha sido alimentado.");
    }

    public String toString(){

        return "Animal de tipo: "+ this.getTypeAnimal() + "    Nombre: "+ this.name+ "    Edad: "+ this.age+ " " +
                "    Precio: "+ this.price;

    }



}
