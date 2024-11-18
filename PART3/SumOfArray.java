package PART3;

public class SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(numbers));
    }

    public static int sumOfNumbersInArray(int[] array) {
        if (array.length == 0) {
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            sum += number;
        }

        return sum;
    }
}
