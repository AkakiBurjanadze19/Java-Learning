package PART6;

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> items;

    public Stack() {
        this.items = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    public void add(String value) {
        this.items.add(value);
    }

    public ArrayList<String> values() {
        return this.items;
    }

    public String take() {
        String item = this.items.get(this.items.size() - 1);
        this.items.remove(item);
        return item;
    }
}
