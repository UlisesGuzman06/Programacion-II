package Programacion.TP2Animal;

public class Cat extends Animal{

    private String breed;
    private boolean neutered;


    public Cat(int age, String name, double price, String breed, boolean neutered) {
        super(age, name, price, AnimalType.FELINO);
        this.breed = breed;
        this.neutered = neutered;

    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setNeutered(boolean neutered) {
        this.neutered = neutered;
    }

    public String getBreed() {
        return breed;
    }

    public boolean getNeutered() {
        return this.neutered;
    }

    @Override
    public String toString() {
        if (neutered){
            return super.toString()+"    Raza gato: "+this.getBreed()+ "    Esterilizado: Si";
        }else{
            return super.toString()+ "    Raza gato: "+this.getBreed()+ "    Esterilizado: No";
        }
    }
}
