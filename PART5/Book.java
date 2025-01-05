package PART5;

public class Book {
    private String author;
    private String name;
    private int pages;

    public Book(String author, String name, int pages) {
        this.author = author;
        this.name = name;
        this.pages = pages;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public int getPages() {
        return this.pages;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Book)) {
            return false;
        }

        Book comparedBook = (Book) compared;

        boolean authorEqual =
                (this.author == null && comparedBook.author == null) || (this.author != null && comparedBook.author != null && this.author.equals(comparedBook.author));
        boolean nameEqual =
                (this.name == null && comparedBook.name == null) || (this.name != null && comparedBook.name != null && this.name.equals(comparedBook.name));
        boolean pageEqual = this.pages == comparedBook.pages;

        return authorEqual && nameEqual && pageEqual;
    }

    public String toString() {
        return this.getAuthor() + ", " + this.getName() + ", " + this.getPages() + " pages";
    }
}
