package PART5;

import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop): ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("Author: ");
            String author = scanner.nextLine();

            System.out.println("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            Book book = new Book(name, author, pages);
            if (books.contains(book)) {
                System.out.println("The book is already on the list. Let's not add the same book again.");
            } else {
                books.add(book);
            }
        }

        System.out.println("Thank you! Books added: " + books.size());
    }
}
