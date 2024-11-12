package PART3;

import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        while (true) {
            System.out.println("Enter a name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            names.add(name);
        }

        System.out.println("In total: " + names.size());
    }
}
