package PART6;

import java.util.ArrayList;
import java.util.List;

public class Hold {
    private List<Suitcase> suitcases;
    private int maxWeight;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() < this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Suitcase suitcase : this.suitcases) {
            totalWeight += suitcase.totalWeight();
        }

        return totalWeight;
    }

    public String toString() {
        return this.suitcases.size() + " suitcases" + " (" + this.totalWeight() + " kg)";
    }
}
