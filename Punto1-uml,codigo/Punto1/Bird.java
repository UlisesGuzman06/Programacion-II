package Programacion.TP2Animal;

public class Bird extends Animal{

    private String breed;
    private boolean speaker;

    public Bird(int age, String name, double price, String breed, boolean speaker) {
        super(age, name, price, AnimalType.PLUMIFERO);
        this.breed = breed;
        this.speaker = speaker;

    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setSpeaker(boolean speaker) {
        this.speaker = speaker;
    }

    public String getBreed() {
        return breed;
    }

    public boolean getSpeaker() {
        return speaker;
    }

    @Override
    public String toString() {
        if (speaker) {
            return super.toString() + "    Raza Pajaro: " + this.getBreed() + "    Parlante: Si";
        }else {
            return super.toString() + "    Raza Pajaro: " + this.getBreed() + "    Parlante: No";
        }
    }
}
