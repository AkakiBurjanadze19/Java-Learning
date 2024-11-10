package PART2;

public class Division {
    public static void main(String[] args) {
        division(3, 5);
        division(10, 5);
        division(8, 4);
        division(1, 10);
        division(5, 10);
    }

    public static void division(int numerator, int denominator) {
        double result = 1.0 * numerator / denominator;
        System.out.println(result);
    }
}
