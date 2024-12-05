package PART4;

import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String bookTitle = scanner.nextLine();

            if (bookTitle.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int numOfPages = Integer.parseInt(scanner.nextLine());

            System.out.print("Publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            books.add(new Book(bookTitle, numOfPages, publicationYear));
        }

        System.out.print("What information will be printed? ");
        String question = scanner.nextLine();

        if (question.equals("name")) {
            printBookNames(books);
        } else if (question.equals("everything")) {
            printBookDetails(books);
        }
    }

    public static void printBookDetails(ArrayList<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void printBookNames(ArrayList<Book> books) {
        for (Book book : books) {
            System.out.println(book.getName());
        }
    }
}
