package Punto2;
public class Novel extends Book{
    private String gender;
    public Novel(String author, String title, int publication_year, String gender) {
        super(author, title, publication_year);
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}