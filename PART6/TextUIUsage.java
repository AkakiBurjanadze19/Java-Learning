package PART6;

import java.util.Scanner;

public class TextUIUsage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        TextUI ui = new TextUI(scanner, dictionary);

        ui.start();
    }
}
