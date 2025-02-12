package PART6;

public class ItemUsage {
    public static void main(String[] args) {
        Item book = new Item("The lord of the rings", 2);
        Item phone = new Item("Iphone 14 pro max", 1);

        System.out.println("The book's name: " + book.getName());
        System.out.println("The book's weight: " + book.getWeight());

        System.out.println("Book: " + book);
        System.out.println("Phone: " + phone);
    }
}
