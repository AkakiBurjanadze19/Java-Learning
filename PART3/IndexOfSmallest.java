package PART3;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();

        while (true) {
            System.out.println("Number: ");
            int num = scanner.nextInt();

            if (num == 9999) {
                break;
            }

            nums.add(num);
        }

        int smallest = nums.get(0);
        int minIndex = -1;
        for (int i = 0; i < nums.size(); i++) {
            int current = nums.get(i);
            if (current < smallest) {
                smallest = current;
                minIndex = i;
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Found at index: " + minIndex);
    }
}
