package PART3;

import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {
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

        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            int current = nums.get(i);
            if (current > max) {
                max = current;
            }
        }

        System.out.println(max);
    }
}
