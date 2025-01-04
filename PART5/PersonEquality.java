package PART5;

public class PersonEquality {
    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(24, 3, 2017);

        Person leo = new Person("Leo", 62, 9, date);
        Person lily = new Person("Leo", 62, 9, date2);

        System.out.println(leo.equals(lily));

        Person andrew = new Person("Andrew", 62, 9, date);
        Person thomas = new Person("Thomas", 62, 9, date2);

        System.out.println(andrew.equals(thomas));
    }
}
