package PART4;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuessList {
    public static void main(String[] args) {
        ArrayList<String> guessList = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get("./PART4/guesslist.txt"))) {
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                guessList.add(name);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter names, an empty line quits.");
        while (true) {
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            if (guessList.contains(name)) {
                System.out.println("The name is on the list");
            } else {
                System.out.println("The name is not on the list");
            }
        }
    }
}
