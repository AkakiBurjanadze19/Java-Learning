package PART2;

public class PrintRectangle {
    public static void main(String[] args) {
//        printRectangle(17, 3);
        printRectangle(15, 5);
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }
}
