package PART2;

import java.util.Scanner;

public class WhereTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to? ");
        int number = Integer.valueOf(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}
