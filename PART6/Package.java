package PART6;

import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts;

    public Package() {
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }

    public int totalWeight() {
        if (this.gifts.isEmpty()) {
            return 0;
        }

        int total = 0;
        for (int i = 0; i < this.gifts.size(); i++) {
            Gift gift = this.gifts.get(i);
            int giftWeight = gift.getWeight();
            total += giftWeight;
        }

        return total;
    }
}
