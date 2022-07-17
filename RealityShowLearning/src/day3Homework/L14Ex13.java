package day3Homework;

public class L14Ex13 {
    public static void main(String[] args) {
        print(arrayMultiplication(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
        print(arrayMultiplication(new int[]{2, 2, 2, 2}, new int[]{2, 2, 2, 2}));
        print(arrayMultiplication(new int[]{1}, new int[]{3}));
        print(arrayMultiplication(new int[]{}, new int[]{2, 122}));
    }

    private static void print(int[] arrayMultiplication) {
        for (int j : arrayMultiplication) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static int[] arrayMultiplication(int[] numbers1, int[] numbers2) {
        int[] multiNumbers = new int[numbers1.length];
        if (numbers1.length != numbers2.length || numbers1.length == 0) {
            System.out.println("Error, invalid value");
        } else {
            for (int i = 0; i < numbers1.length; i++) {
                multiNumbers[i] = numbers1[i] * numbers2[i];
            }
        }
        return multiNumbers;
    }
}
