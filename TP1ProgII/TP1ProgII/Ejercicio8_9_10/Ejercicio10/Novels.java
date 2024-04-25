package Programacion.Ejercicio8_9_10.Ejercicio10;

public class Novels extends Book{

    private NovelsType type;

    public Novels(String title, String author, double price, NovelsType type) {
        super(title, author, price);
        this.type = type;
    }

    public NovelsType getType() {
        return type;
    }

    public void setType(NovelsType type) {
        this.type = type;
    }

    @Override
    public String getDatos() {
        return super.getDatos()+ " Tipo de novela: "+ getType();
    }
}
