package Programacion.Ejercicio8_9_10.Ejercicio10;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price){

        this.author = author;
        this.price = price;
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDatos(){

        return "Libro: "+ this.getTitle()+ " Autor: "+ this.getAuthor()+ " Precio: "+ this.getPrice();

    }

}
