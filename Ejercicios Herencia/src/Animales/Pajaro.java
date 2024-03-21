package Animales;

public class Pajaro extends Animal{
    private String especie;
    private String color;

    public Pajaro() {
    }

    public Pajaro(String nombre, int edad, String genero, String especie, String color) {
        super(nombre, edad, genero);
        this.especie = especie;
        this.color = color;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    void hacerSonidos() {
        System.out.println("El pájaro canta");
    }

    @Override
    void informacion() {
        System.out.println("El pajaro se llama "+getNombre()+" tiene "+getEdad()+" años, es de genero "+getGenero()+" es de especie "+ especie+" y el color de su plumaje es "+color);
    }
}
