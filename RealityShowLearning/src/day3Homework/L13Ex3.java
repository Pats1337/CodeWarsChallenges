package day3Homework;

public class L13Ex3 {
    public static void main(String[] args) {
        print(negativeCounter(new int[]{-1, 10, 15, -2, -3, 1000}));
        print(negativeCounter(new int[]{1, 10, 15, 2, 3, 1000}));
        print(negativeCounter(new int[]{-1}));
        print(negativeCounter(new int[]{}));
    }

    private static void print(int negativeCounter) {
        System.out.println("Количество отрицательных чисел в массиве: " + negativeCounter);
    }

    private static int negativeCounter(int[] ints) {
        int negativeCounter = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < 0) {
                negativeCounter++;
            }
        }
        return negativeCounter;
    }
}
