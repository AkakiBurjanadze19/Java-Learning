package PART6.JokeManager;

public class JokeManagerUsage {
    public static void main(String[] args) {
        JokeManager
                manager = new JokeManager();

        manager.addJoke("What is red and smells of blue paint? - Red paint.");
        manager.addJoke("What is blue and smells of red paint? - Blue paint.");

        System.out.println(manager.drawJoke());
        System.out.println(manager.drawJoke());

        System.out.println();

        manager.printJokes();
    }
}
