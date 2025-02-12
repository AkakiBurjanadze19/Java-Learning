package PART6;

public class SuitcaseUsage {
    public static void main(String[] args) {
        Item book = new Item("The lord of the rings", 2);
        Item phone = new Item("Iphone 14 pro max", 1);
        Item brick = new Item("Brick", 4);

        Suitcase suitcase = new Suitcase(10);

        suitcase.addItem(book);
        suitcase.addItem(phone);
        suitcase.addItem(brick);

        System.out.println("Heaviest item: " + suitcase.heavisetItem());
    }
}
