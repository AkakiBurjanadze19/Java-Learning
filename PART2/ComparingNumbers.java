package PART2;

import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int first = Integer.valueOf(reader.nextLine());

        System.out.println("Give the second number: ");
        int second = Integer.valueOf(reader.nextLine());

        if (first > second) {
            System.out.println(first + " is greater than " + second + '.');
        } else if (first < second) {
            System.out.println(first + " is smaller than " + second + '.');
        } else {
            System.out.println(first + " is equal to " + second + '.');
        }
    }
}
