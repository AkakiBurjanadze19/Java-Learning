package PART4;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();

        ArrayList<Person> persons = readRecordsFromFile(fileName);

        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get("./PART4/" + file))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");

                String name = parts[0];
                int age = Integer.parseInt(parts[1]);

                persons.add(new Person(name, age));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return persons;
    }
}
