package PART3;

import java.util.Scanner;

public class AvClub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String string = scanner.nextLine();

            if (string.isEmpty()) {
                break;
            }

            String[] words = string.split(" ");
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
        }
    }
}
