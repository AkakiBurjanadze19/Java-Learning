package PART6;

public class SimpleCollectionUsage {
    public static void main(String[] args) {
//        SimpleCollection s = new SimpleCollection("alphabet");
//
//        s.add("a");
//        System.out.println(s);
//
//        s.add("b");
//        System.out.println(s);
//
//        s.add("c");
//        System.out.println(s);

        SimpleCollection j = new SimpleCollection("characters");
        System.out.println("Longest: " + j.longest());

        j.add("magneto");
        j.add("mystique");
        j.add("phoenix");

        System.out.println("Longest: " + j.longest());
    }
}
