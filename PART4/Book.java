package PART4;

public class Book {
    private String title;
    private int pages;
    private int publicationYear;

    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return this.title;
    }

    public String toString() {
        return title + ", " + pages + " pages, " + publicationYear;
    }
}
