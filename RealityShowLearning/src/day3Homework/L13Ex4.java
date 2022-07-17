package day3Homework;

public class L13Ex4 {
    public static int NUMBER;

    public static void main(String[] args) {
        NUMBER = 13;
        print(findInt(NUMBER, new int[]{10, 11, 12, 13, 13, 13, 1, 13, 13}));
        NUMBER = 2;
        print(findInt(NUMBER, new int[]{10, 11, 12, 13}));
        NUMBER = 11;
        print(findInt(NUMBER, new int[]{10, 11, 12, 13, 13, 13, 1, 13, 13}));
        NUMBER = 1;
        print(findInt(NUMBER, new int[]{10, 1}));
    }

    private static void print(int n) {
        System.out.println("Число " + NUMBER + " встречается в массиве " + n + " раз.");
    }

    private static int findInt(int num, int[] ints) {
        int n = 0;
        for (int i = 0; i < ints.length; i++) {
            if (NUMBER == ints[i]) {
                n++;
            }
        }
        return n;
    }
}
