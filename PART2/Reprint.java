package PART2;

import java.util.Scanner;

public class Reprint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times? ");
        int number = Integer.valueOf(scanner.nextLine());

        int i = 0;
        while (i < number) {
            printText();
            i = i + 1;
        }
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
