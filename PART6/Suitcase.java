package PART6;

import java.util.ArrayList;
import java.util.List;

public class Suitcase {
    private List<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (this.calculateTotalWeight() + item.getWeight() < this.maxWeight) {
            this.items.add(item);
        }
    }

    private int calculateTotalWeight() {
        int totalWeight = 0;

        for (Item item : this.items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    public String toString() {
        String output = "";
        String weightString = " (" + this.calculateTotalWeight() + " kg)";

        int itemsSize = this.items.size();

        if (this.items.isEmpty()) {
            output += "no items" + weightString;
        } else if (itemsSize == 1) {
            output += itemsSize + " item" + weightString;
        } else {
            output += itemsSize + " items" + weightString;
        }

        return output;
    }
}
