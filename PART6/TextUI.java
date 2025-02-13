package PART6;

import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.simpleDictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();

                System.out.println("Translation: ");
                String translation = scanner.nextLine();

                this.simpleDictionary.add(word, translation);
            } else if (command.equals("search")) {
                System.out.println("To be translated: ");
                String wordToTranslate = scanner.nextLine();

                String translatedWord = simpleDictionary.translate(wordToTranslate);

                if (translatedWord == null) {
                    System.out.println("Word " + wordToTranslate + " was not found");
                }
            } else if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
