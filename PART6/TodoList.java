package PART6;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<String> todos;

    public TodoList() {
        this.todos = new ArrayList<>();
    }

    public void add(String task) {
        this.todos.add(task);
    }

    public void print() {
        for (int i = 0; i < todos.size(); i++) {
            String todo = todos.get(i);
            int todoIndex = i + 1;
            System.out.println(todoIndex + ": " + todo);
        }
    }

    public void remove(int number) {
        int removeIndex = number - 1;
        this.todos.remove(removeIndex);
    }
}
