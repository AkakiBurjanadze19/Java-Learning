package PART4;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromFile {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner inputScanner1 = new Scanner(System.in);

        System.out.print("File? ");
        String fileName = inputScanner1.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get("./PART4/" + fileName))) {
            while (fileScanner.hasNextLine()) {
                int number = Integer.parseInt(fileScanner.nextLine());
                numbers.add(number);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        Scanner inputScanner2 = new Scanner(System.in);

        System.out.print("Lower bound? ");
        int lowerBound = Integer.parseInt(inputScanner2.nextLine());

        System.out.print("Upper bound? ");
        int upperBound = Integer.parseInt(inputScanner2.nextLine());

        int numbersInRange = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number >= lowerBound && number <= upperBound) {
                numbersInRange++;
            }
        }

        System.out.println("Numbers: " + numbersInRange);
    }
}
