package day3Homework;

public class L14Ex6 {
    public static void main(String[] args) {
        mirrorArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        mirrorArray(new int[]{1});
        mirrorArray(new int[]{});
        mirrorArray(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
    }

    private static void mirrorArray(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
