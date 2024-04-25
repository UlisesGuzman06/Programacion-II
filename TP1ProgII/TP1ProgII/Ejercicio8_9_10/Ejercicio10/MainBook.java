package Programacion.Ejercicio8_9_10.Ejercicio10;

public class MainBook {
    public static void main(String[] args) {


        Book b1 = new Book("Las sombras del amor", "Roony Cooleman", 45.12);
        System.out.println(b1.getDatos());

        TextBook text1 = new TextBook("Harry Potter", "J.K. Rowling", 150.12, 3);
        System.out.println(text1.getDatos());

        UniversityTextBook uni1 = new UniversityTextBook("Los animales de Africa", "Julian Serrano", 255.8, 4,
                "Universidad de colombia");
        System.out.println(uni1.getDatos());

        Novels novela1 = new Novels("Sherlock Holmes: El Sabueso de los Baskerville", "Sir Arthur Conan Doyle",
                150.22, NovelsType.Policial );
        System.out.println(novela1.getDatos());

        System.out.println("Holaa capooo ");


        

    }
}
