package PART6;

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> items;

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    public void add(String value) {
        this.items.add(value);
    }
}
