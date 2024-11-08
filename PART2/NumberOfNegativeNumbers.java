package PART2;

import java.util.Scanner;

public class NumberOfNegativeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int negativeNumbersCount = 0;

        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number < 0) {
                negativeNumbersCount = negativeNumbersCount + 1;
            }
        }

        System.out.println("Number of negative numbers: " + negativeNumbersCount);
    }
}
