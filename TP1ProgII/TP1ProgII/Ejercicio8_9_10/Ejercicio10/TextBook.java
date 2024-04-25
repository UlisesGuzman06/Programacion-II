package Programacion.Ejercicio8_9_10.Ejercicio10;

public class TextBook extends Book{

    private int curse;

    public TextBook(String title, String author, double price, int curse) {
        super(title, author, price);
        this.curse = curse;
    }

    public void setCurse(int curse) {
        this.curse = curse;
    }

    public int getCurse() {
        return curse;
    }

    public String getDatos(){

        return super.getDatos()+ " Curso: "+ this.getCurse();

    }

}
