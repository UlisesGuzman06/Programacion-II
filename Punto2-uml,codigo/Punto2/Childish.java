package Punto2;
public class Childish extends Book {
    private int recommended_age;
    public Childish(String author, String title, int publication_year, int recommended_age) {
        super(author, title, publication_year);
        this.recommended_age = recommended_age;
    }
    public int getRecommended_age() {
        return recommended_age;
    }
    public void setRecommended_age(int recommended_age) {
        this.recommended_age = recommended_age;
    }
}