package PART6;

import java.util.Scanner;

public class UserInterfaceUsage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList list = new TodoList();

        UserInterface ui = new UserInterface(list, scanner);

        ui.start();
    }
}
