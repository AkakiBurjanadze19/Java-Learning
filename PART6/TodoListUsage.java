package PART6;

public class TodoListUsage {
    public static void main(String[] args) {
        TodoList list = new TodoList();

        list.add("read the course material");
        list.add("watch in the middle of city");
        list.add("study algorithms and data structures");

        list.print();

        list.remove(1);

        System.out.println();

        list.print();
    }
}
