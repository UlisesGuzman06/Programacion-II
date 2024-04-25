package Programacion.TP2Animal;

public class Dog extends Animal{

    private String breed;
    private boolean vaccinated;

    public Dog(int age, String name, double price, String breed, boolean vaccinated) {
        super(age, name, price, AnimalType.CANINO);
        this.breed = breed;
        this.vaccinated = vaccinated;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public String getBreed() {
        return breed;
    }

    public boolean getVaccinated(){
        return vaccinated;
    }

    @Override
    public String toString() {
        if (vaccinated){
        return super.toString()+ "    Raza perro: "+this.getBreed()+ "    Vacunado: Si";
        }else{
            return super.toString()+ "    Raza perro: "+this.getBreed()+ "    Vacunado: No";
        }
    }
}
