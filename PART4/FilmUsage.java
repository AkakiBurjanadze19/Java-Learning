package PART4;

import java.util.Scanner;

public class FilmUsage {
    public static void main(String[] args) {
        Film goodfellas = new Film("The Goodfellas", 16);

        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you? ");
        int age = scanner.nextInt();

        if (age >= goodfellas.ageRating()) {
            System.out.println("You may watch the film " + goodfellas.name());
        } else {
            System.out.println("You may not watch the film " + goodfellas.name());
        }
    }
}
