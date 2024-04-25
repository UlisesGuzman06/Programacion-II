package Punto2;
import java.util.ArrayList;
public class Library implements Loanable{
    private ArrayList<Book> books=new ArrayList<>();
    public Library() {
    }
    public void lend(String name) {
        for (Book book : books) {
            if (book.getTitle().equals(name) && !book.isBorrowed()) {
                book.lend(name);
                System.out.println("Libro prestado: " + book.getTitle());
                return;
            }
        }
        System.out.println("El libro no esta disponible");
    }
    public void returnIt(String name) {
        for (Book book : books) {
            if (book.getTitle().equals(name) && book.isBorrowed()) {
                book.returnIt(name);
                System.out.println("Libro devuelto: " + book.getTitle());
                return;
            }
        }
        System.out.println("No se puede devolver el libro porque no esta prestado.");
    }
    public void addBook(Book book) {
        this.books.add(book);
    }
    public void avaliableBooks(){
        for(Book b : books){
            if (!b.isBorrowed()) {
                System.out.println("Libro: " + b.getTitle());
            }
        }
    }
}