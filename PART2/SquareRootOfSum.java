package PART2;

import java.util.Scanner;

public class SquareRootOfSum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give a first number: ");
        int first = Integer.valueOf(reader.nextLine());

        System.out.println("Give a second number: ");
        int second = Integer.valueOf(reader.nextLine());

        double result = Math.sqrt(first) + Math.sqrt(second);
        System.out.println((int) result);
    }
}
