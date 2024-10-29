import java.util.Scanner;

public class Conversation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How are you doing? ");
        String answer1 = scanner.nextLine();

        System.out.println("Oh, How interesting. Tell me more!");
        String answer2 = scanner.nextLine();

        System.out.println(answer1);
        System.out.println(answer2);

        System.out.println("Thanks for sharing!");
    }
}
