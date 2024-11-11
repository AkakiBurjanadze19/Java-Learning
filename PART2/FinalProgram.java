package PART2;

import java.util.Scanner;

public class FinalProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers: ");
        int sum = 0;
        int numbers = 0;
        double average = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                System.out.println("Thx, Bye!");
                break;
            }

            if (number % 2 == 0) {
                evenNumbers = evenNumbers + 1;
            }

            if (number % 2 != 0) {
                oddNumbers = oddNumbers + 1;
            }

            sum = sum + number;
            numbers = numbers + 1;
        }

        average = 1.0 * sum / numbers;

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenNumbers);
        System.out.println("Odd: " + oddNumbers);
    }
}
