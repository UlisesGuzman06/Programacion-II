package Punto2;
public class University extends Book{
    private String career;
    public University(String author, String title, int publication_year, String career) {
        super(author, title, publication_year);
        this.career = career;
    }
    public String getCareer() {
        return career;
    }
    public void setCareer(String career) {
        this.career = career;
    }
}