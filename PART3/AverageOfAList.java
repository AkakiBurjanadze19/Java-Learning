package PART3;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {
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

        int sum = 0;
        double average = 0;
        for (Integer num : nums) {
            sum += num;
        }

        average = (1.0 * sum) / nums.size();
        System.out.println("Average: " + average);
    }
}
