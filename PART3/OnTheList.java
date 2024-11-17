package PART3;

import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        while (true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            names.add(name);
        }

        System.out.println("Search for? ");
        String searchFor = scanner.nextLine();

        if (names.contains(searchFor)) {
            System.out.println(searchFor + " was found!");
        } else {
            System.out.println(searchFor + " was not found!");
        }
    }
}
