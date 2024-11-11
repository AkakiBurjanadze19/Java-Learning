package PART3;

import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int longestStringLength = 0;
        int sum = 0;
        int namesCount = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String[] details = input.split(",");
            String name = details[0];
            int birthYear = Integer.parseInt(details[1]);

            if (name.length() > longestStringLength) {
                longestStringLength = name.length();
                longestName = name;
            }

            sum += birthYear;
            namesCount++;
        }

        double averageOfBirthYears = (1.0 * sum) / namesCount;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of birth years: " + averageOfBirthYears);
    }
}
