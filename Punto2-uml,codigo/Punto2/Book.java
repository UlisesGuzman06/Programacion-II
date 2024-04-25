package Punto2;
public abstract class Book implements Loanable {
    private String author,title;
    private int publication_year;
    private boolean borrowed;
    public Book(String author, String title, int publication_year) {
        this.author = author;
        this.title = title;
        this.publication_year = publication_year;
        this.borrowed = false;
    }
    @Override
    public void lend(String name) {
        borrowed=true;
    }
    @Override
    public void returnIt(String name) {
        borrowed=false;
    }
    public boolean isBorrowed() {
        return borrowed;
    }
    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPublication_year() {
        return publication_year;
    }
    public void setPublication_year(int publication_year) {
        this.publication_year = publication_year;
    }
}