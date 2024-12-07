package PART5;

public class CounterUsage {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        counter1.increase(10);
        counter1.increase();
        counter1.increase();
        counter1.decrease();
        counter1.decrease(9);

        counter2.decrease(10);
        counter2.decrease(10);
        counter2.decrease(10);

        System.out.println(counter1.value());
        System.out.println(counter2.value());
    }
}
