package PART2;

public class Greatest {
    public static void main(String[] args) {
      int answer = greatest(2, 7, 3);
      System.out.println("Answer: " + answer);
      answer = greatest(10, 5, 2);
      System.out.println("Answer: " + answer);
      answer = greatest(15, 20, 30);
      System.out.println("Answer: " + answer);
    }

    public static int greatest(int number1, int number2, int number3) {
        int max = 0;

        if ((number1 > number2) && (number1 > number3)) {
            max = number1;
        }

        if ((number2 > number1) && (number2 > number3)) {
            max = number2;
        }

        if ((number3 > number2) && (number3 > number1)) {
            max = number3;
        }

        return max;
    }
}
