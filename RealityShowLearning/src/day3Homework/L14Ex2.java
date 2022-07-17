package day3Homework;

public class L14Ex2 {
    public static void main(String[] args) {
        checkMultiplicity(5, 137);
    }

    private static void checkMultiplicity(int multipleOf, int maxValue ) {
        for (int i = 1; i <= maxValue; i++) {
            if (i % multipleOf == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
