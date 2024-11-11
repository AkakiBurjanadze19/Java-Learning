package PART3;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
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

        System.out.println("Search for? ");
        int target = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < nums.size(); i++) {
            int current = nums.get(i);
            if (current == target) {
                index = i;
                break;
            }
        }

        System.out.println(target + " is at index " + index);
    }
}
