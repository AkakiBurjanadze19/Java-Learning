package PART3;

import java.util.ArrayList;

public class RemoveLast {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }

    public static void removeLast(ArrayList<String> strings) {
        if (strings.isEmpty()) {
            return;
        }

        int lastIndex = strings.size() - 1;
        String last = strings.get(lastIndex);
        strings.remove(last);
    }
}
