package day3Homework;

public class L14Ex10 {
    public static void main(String[] args) {
        print(crossAddition(new int[]{1, 2, 3, 4, 5}));
        print(crossAddition(new int[]{1, 2, 3, 2, 1}));
        print(crossAddition(new int[]{}));
        print(crossAddition(new int[]{1}));
    }

    private static void print(int[] crossAddition) {
        for (int j : crossAddition) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static int[] crossAddition(int[] numbers) {
        int[] newNumbers = new int[numbers.length];
        if (numbers.length == 0) {
            System.out.print("Error, array is empty!");
        } else {
            for (int i = 0; i < numbers.length; i++) {
                newNumbers[i] = numbers[i] + numbers[(numbers.length - 1) - i];
            }
        }
        return newNumbers;
    }
}
