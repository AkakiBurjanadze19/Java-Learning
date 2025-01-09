package PART5;

public class MoneyUsage {
    public static void main(String[] args) {
        Money a = new Money(10,0);
        Money b = new Money(5,0);

        Money c = a.plus(b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        a = a.plus(c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        a = new Money(20, 0);
        b = new Money(30, 0);

        System.out.println(a.lessThan(b));
        System.out.println(b.lessThan(a));
    }
}
