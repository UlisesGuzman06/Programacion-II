package Programacion.Ejercicio8_9_10.Ejercicio10;

public class UniversityTextBook extends TextBook {

    private String university;

    public UniversityTextBook(String title, String author, double price, int curse, String university) {
        super(title, author, price, curse);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String getDatos() {
        return super.getDatos()+ " Universidad publicadora: "+this.getUniversity();
    }
}
