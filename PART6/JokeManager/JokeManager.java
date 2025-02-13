package PART6.JokeManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokeManager {
    private List<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        Random draw = new Random();
        int index = draw.nextInt(this.jokes.size());

        return this.jokes.get(index);
    }

    public void printJokes() {
        for (String joke : this.jokes) {
            System.out.println(joke);
        }
    }

    public int size() {
        return this.jokes.size();
    }
}
