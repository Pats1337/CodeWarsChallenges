package day3Homework;

public class L13Ex2 {
    public static void main(String[] args) {
        print(arrayMultiplication(new int[]{2, 2, 2, 2, 2}));
        print(arrayMultiplication(new int[]{-1, 2, 2, 2, 2}));
        print(arrayMultiplication(new int[]{2, 2, 2}));
    }

    private static void print(int arrayMultiplication) {
        System.out.println("Произведение всех элементов массива: " + arrayMultiplication);
    }

    private static int arrayMultiplication(int[] ints) {
        int multi = ints[0];
        for (int i = 1; i < ints.length; i++){
            multi = multi * ints[i];
        }
        return multi;
    }
}
