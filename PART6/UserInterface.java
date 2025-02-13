package PART6;

import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals("add")) {
                System.out.println("To add: ");
                String task = scanner.nextLine();

                this.list.add(task);
            } else if (command.equals("list")) {
                this.list.print();
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int todoId = Integer.parseInt(scanner.nextLine());

                this.list.remove(todoId);
            } else if (command.equals("stop")) {
                break;
            }
        }
    }
}
