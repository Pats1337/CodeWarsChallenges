package day3Homework;

public class L14Ex8 {
    public static void main(String[] args) {
        print(destroyNegatives(new int[]{1, 2, -10, -15, 11}));
        print(destroyNegatives(new int[]{-1, -1000, -10, -15, 0, 0, 1123}));
    }

    private static void print(int[] destroyNegatives) {
        for (int i = 0; i < destroyNegatives.length; i++) {
            System.out.print(destroyNegatives[i] + " ");
        }
        System.out.println();
    }

    private static int[] destroyNegatives(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                numbers[i] *= -1;
            }
        }
        return numbers;
    }
}
