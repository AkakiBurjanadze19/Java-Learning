package PART6;

import java.util.ArrayList;

public class SimpleCollection {
    private String type;
    private ArrayList<String> collection;

    public SimpleCollection(String type) {
        this.type = type;
        this.collection = new ArrayList<>();
    }

    public void add(String item) {
        this.collection.add(item);
    }

    public String toString() {
        String printOutput = "";

        if (this.collection.isEmpty()) {
            return "The collection " + this.type + " is empty";
        }

        String collectionString = "";
        for (String item : this.collection) {
            collectionString = collectionString + item + "\n";
        }

        int collectionSize = this.collection.size();
        String format = collectionSize > 1 ? "elements" : "element";
        return printOutput + "The collection " + this.type + " has " + collectionSize + " " + format + "\n" + collectionString;
    }
}
