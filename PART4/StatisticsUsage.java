package PART4;

import java.util.Scanner;

public class StatisticsUsage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics statistics1 = new Statistics();
        Statistics statistics2 = new Statistics();
        Statistics statistics3 = new Statistics();

        System.out.println("Enter numbers: ");
        while (true) {
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            statistics1.addNumber(number);

            if (number % 2 == 0) {
                statistics2.addNumber(number);
            }

            if (number % 2 != 0) {
                statistics3.addNumber(number);
            }
        }

        System.out.println("Sum: " + statistics1.sum());
        System.out.println("Sum of even numbers: " + statistics2.sum());
        System.out.println("Sum of odd numbers: " + statistics3.sum());
    }
}
