package PART3;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();

        while (true) {
            System.out.println("Number: ");
            int num = scanner.nextInt();

            if (num == -1) {
                break;
            }

            nums.add(num);
        }

        System.out.println("From where? ");
        int start = scanner.nextInt();

        System.out.println("To where? ");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.println(nums.get(i));
        }
    }
}
