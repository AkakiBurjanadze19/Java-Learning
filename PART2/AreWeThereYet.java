package PART2;

import java.util.Scanner;

public class AreWeThereYet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Are we there yet? ");
            int command = Integer.valueOf(scanner.nextLine());

            if (command == 4) {
                break;
            }
        }
    }
}
