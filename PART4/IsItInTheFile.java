package PART4;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> content = new ArrayList<>();

        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get("./PART4/" + fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                content.add(line);
            }
        } catch (Exception e) {

        }

        Scanner contentScanner = new Scanner(System.in);

        System.out.print("Search for: ");
        String query = contentScanner.nextLine();

        if (content.isEmpty()) {
            System.out.println("Reading the file " + fileName + " failed");
        } else if (content.contains(query)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
    }
}
