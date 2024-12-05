package PART4;

import java.util.ArrayList;
import java.util.Scanner;

public class Items {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList();

        while (true) {
            System.out.println("Name: ");
            String itemName = scanner.nextLine();

            if (itemName.isEmpty()) {
                break;
            }

            items.add(new Item(itemName));
        }

        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
    }
}
