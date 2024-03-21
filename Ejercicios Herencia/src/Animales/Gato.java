package Animales;

public class Gato extends Animal{
    private String color;
    private String colorOjos;

    public Gato(String nombre, int edad, String genero, String color, String colorOjos) {
        super(nombre, edad, genero);
        this.color = color;
        this.colorOjos = colorOjos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    @Override
    void hacerSonidos() {
        System.out.println("El gato maulla");
    }

    @Override
    void informacion() {
        System.out.println("El gato se llama "+getNombre()+" tiene "+getEdad()+" años, es de genero "+getGenero()+" su color es "+color+" y el color de sus ojos es "+colorOjos);
    }
}
