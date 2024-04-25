package Punto2;
public class Main {
    public static void main(String[] args) {
        Library biblioteca =new Library();

        University libro1=new University("Einsten","Logica",2000,"Matematica");
        Childish libro2=new Childish("Pablo Ramirez","Amigos",2020,12);
        Novel libro3=new Novel("Maicon","Pasion",2018,"Literario");

        //Añadiendo libros
        biblioteca.addBook(libro1);
        biblioteca.addBook(libro2);
        biblioteca.addBook(libro3);

        //Libros disponibles
        biblioteca.avaliableBooks();
        System.out.println("--------------------------");

        //prestamos dos libros
        biblioteca.lend("Pasion");
        libro2.lend("Amigos");
        biblioteca.avaliableBooks();
        System.out.println("--------------------------");

        //Devolvemos un libro prestado
        libro2.returnIt("Amigos");
        biblioteca.avaliableBooks();
        System.out.println("--------------------------");

        //devolvemos otro libro prestado
        biblioteca.returnIt("Pasion");
        biblioteca.avaliableBooks();
        System.out.println("--------------------------");
    }
}