package PART3;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        while (true) {
            System.out.println("Enter name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            names.add(name);
        }

        System.out.println(names.get(0));
        System.out.println(names.get(names.size() - 1));
    }
}
