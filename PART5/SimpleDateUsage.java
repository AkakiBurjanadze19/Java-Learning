package PART5;

public class SimpleDateUsage {
    public static void main(String[] args) {
        SimpleDate date1 = new SimpleDate(4, 1, 2025);
        SimpleDate date2 = new SimpleDate(4, 1, 2025);

        System.out.println(date1);
        System.out.println(date2);

        System.out.println(date1.equals(date2));
    }
}
