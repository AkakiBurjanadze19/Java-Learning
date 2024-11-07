package PART2;

import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int negativeNumbersCount = 0;
        int positiveNumbersCount = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number < 0) {
                negativeNumbersCount = negativeNumbersCount + 1;
            }

            if (number > 0) {
                positiveNumbersCount = positiveNumbersCount + 1;
                sum = sum + number;
            }
        }

        double averageOfPositives;

        if (positiveNumbersCount > negativeNumbersCount) {
            averageOfPositives = 1.0 * sum / positiveNumbersCount;
            System.out.println("Average of the positive numbers: " + averageOfPositives);
        }

        if (positiveNumbersCount == 1) {
            averageOfPositives = 1.0 * sum / sum;
            System.out.println("Average of the positve numbers: " + averageOfPositives);
        }

        if (positiveNumbersCount == 0) {
            System.out.println("Cannot calculate the average");
        }
    }
}
