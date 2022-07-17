package day3Homework;

public class L14Ex9 {
    public static void main(String[] args) {
        print(addingUpElements(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        print(addingUpElements(new int[]{1}));
        print(addingUpElements(new int[]{}));
        print(addingUpElements(new int[]{10, 100, 1000}));
    }

    private static void print(int[] addingUpElements) {
        for (int i = 0; i < addingUpElements.length; i++) {
            System.out.print(addingUpElements[i] + " ");
        }
        System.out.println();
    }

    private static int[] addingUpElements(int[] numbers) {
        int[] newNumbers = new int[numbers.length];
        if (numbers.length == 0) {
            System.out.print("Error, array is empty!");
        } else {
            newNumbers[newNumbers.length - 1] = numbers[numbers.length - 1];
            for (int i = 0; i < numbers.length - 1; i++) {
                newNumbers[i] = numbers[i] + numbers[i + 1];
            }
        }
        return newNumbers;
    }
}
