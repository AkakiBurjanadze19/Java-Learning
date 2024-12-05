package PART4;

import java.time.LocalDate;

public class Item {
    private String name;
    private LocalDate creationTime;

    public Item(String name) {
        this.name = name;
        this.creationTime = LocalDate.now();
    }

    public String toString() {
        return this.name + "(" + "created at:" + this.creationTime + ")";
    }
}
