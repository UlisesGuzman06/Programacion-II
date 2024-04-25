package Programacion.TP2Animal;

public class Fish extends Animal{

    private String breed;
    private TypeWater waterType;
    public Fish(int age, String name, double price, String breed ,TypeWater waterType) {
        super(age, name, price, AnimalType.ESCAMOSO);
        this.breed = breed;
        this.waterType = waterType;
    }

    public String getBreed() {
        return breed;
    }

    public TypeWater getWaterType() {
        return waterType;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setWaterType(TypeWater waterType) {
        this.waterType = waterType;
    }

    @Override
    public String toString() {
        return super.toString()+ "    Raza Pez: "+ this.getBreed()+ "    Tipo de agua: "+ this.getWaterType();
    }
}
