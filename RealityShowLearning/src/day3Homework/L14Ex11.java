package day3Homework;

public class L14Ex11 {
    public static void main(String[] args) {
        print(arrayDoubling(new int[]{1, 2, 3}));
        print(arrayDoubling(new int[]{1, 2, 3, 4}));
        print(arrayDoubling(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        print(arrayDoubling(new int[]{1, 2}));
        print(arrayDoubling(new int[]{1}));
        print(arrayDoubling(new int[]{}));
    }

    private static void print(int[] arrayDoubling) {
        for (int j : arrayDoubling) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static int[] arrayDoubling(int[] numbers) {
        int[] doubleNumbers = new int[numbers.length * 2];
        if (numbers.length == 0){
            System.out.println("Error, array is empty!");
        } else {
            doubleNumbers[0] = numbers[0];
            doubleNumbers[1] = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                doubleNumbers[i * 2] = numbers[i];
                doubleNumbers[(i * 2) + 1] = numbers[i];
            }
        }
        return doubleNumbers;
    }
}
