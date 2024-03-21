package Animales;

public class Animal {
    private String nombre;
    private int edad;
    private String genero;

    public Animal() {
    }

    public Animal(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getGenero() {
        return genero;
    }

    void hacerSonidos(){
        System.out.println("El animal hace un sonido genérico");
    }

    void informacion(){

    }
}
