package PART3;

import java.util.Scanner;

public class NameOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = -1;
        String nameOfTheOldest = "";
        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String[] info = input.split(",");
            String name = info[0];
            int age = Integer.parseInt(info[1]);

            if (age > oldest) {
                oldest = age;
                nameOfTheOldest = name;
            }
        }

        if (!(nameOfTheOldest.isEmpty())) {
            System.out.println("Name of the oldest: " + nameOfTheOldest);
        }
    }
}
