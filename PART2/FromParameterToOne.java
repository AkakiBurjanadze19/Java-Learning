package PART2;

public class FromParameterToOne {
    public static void main(String[] args) {
        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne(int numberFrom) {
        int i = numberFrom;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }
}
