package Animales;

public class Perro extends Animal {

    private String raza;
    private String pelaje;
    private String tamanio;

    public Perro() {
    }




    public Perro(String nombre, int edad, String genero, String raza, String pelaje, String tamanio) {
        super(nombre, edad, genero);
        this.raza = raza;
        this.pelaje = pelaje;
        this.tamanio = tamanio;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    @Override
    void hacerSonidos() {
        System.out.println("El perro ladra");
    }

    @Override
    void informacion() {
        System.out.println("El perro se llama "+getNombre()+" tiene "+getEdad()+" años, es de genero "+getGenero()+", es de raza "+raza+", su pelaje es color "+pelaje+" y su tamaño es "+tamanio);
    }
}
