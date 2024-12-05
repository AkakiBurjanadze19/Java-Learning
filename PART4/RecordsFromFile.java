package PART4;

import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromFile {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String fileName = inputScanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get("./PART4/" + fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                String[] parts = line.split(",");

                String name = parts[0];
                int age = Integer.parseInt(parts[1]);

                if (age > 1) {
                    System.out.println(name + ", " + "age: " + age + " years");
                } else {
                    System.out.println(name + ", " + "age: " + age + " year");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
