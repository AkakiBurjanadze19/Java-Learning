package PART6;

public class HoldUsage {
    public static void main(String[] args) {
        Item book = new Item("The lord of the rings", 2);
        Item phone = new Item("Iphone 14 pro max", 1);
        Item brick = new Item("Brick", 4);

        Suitcase johnsCase = new Suitcase(10);
        johnsCase.addItem(book);
        johnsCase.addItem(phone);

        Suitcase anonsCase = new Suitcase(10);
        anonsCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(johnsCase);
        hold.addSuitcase(anonsCase);

        System.out.println(hold);

        System.out.println("Suitcases in the hold contain the following items: ");
        hold.printItems();
    }
}
