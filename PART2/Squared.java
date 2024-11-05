package PART2;

import java.util.Scanner;

public class Squared {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give a number: ");
        int number = Integer.valueOf(reader.nextLine());

        System.out.println(number * number);
    }
}
