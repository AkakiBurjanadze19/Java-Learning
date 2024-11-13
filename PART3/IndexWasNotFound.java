package PART3;

import java.util.Scanner;

public class IndexWasNotFound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[30];
        numbers[0] = 10;
        numbers[1] = 3;
        numbers[2] = 20;
        numbers[3] = 35;
        numbers[4] = 21;
        numbers[5] = 19;

        System.out.println("Search for? ");
        int target = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println(target + " is at index " + index + ".");
        } else {
            System.out.println(target + " was not found.");
        }
    }
}
