package day3Homework;

public class L14Ex4 {
    public static void main(String[] args) {
        print(findMinMax(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        print(findMinMax(new int[]{}));
        print(findMinMax(new int[]{-1000, 10, 11, 1000, 121314, 0}));
    }

    private static void print(int diff) {
        System.out.println("Разница максимального и минимального элементов массива: " + diff);
    }

    private static int findMinMax(int[] numbers) {
        int min;
        int max;
        int diff;
        if (numbers.length == 0) {
            System.out.print("Error, array is empty! ");
            diff = 0;
        } else {
            min = numbers[0];
            max = numbers[0];
            for (int number : numbers) {
                if (number <= min) {
                    min = number;
                }
                if (number >= max) {
                    max = number;
                }
            }
            diff = max - min;
        }
        return diff;
    }
}
