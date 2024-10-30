import java.util.Scanner;

public class DaySeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int SECONDS_IN_A_DAY = 86400;

        System.out.println("How many days would you like to convert to seconds? ");
        int days = Integer.valueOf(scanner.nextLine());

        int result = days * SECONDS_IN_A_DAY;

        System.out.println(result);
    }
}
