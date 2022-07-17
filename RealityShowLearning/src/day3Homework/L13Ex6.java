package day3Homework;

public class L13Ex6 {
    public static void main(String[] args) {
        print(arithmeticProgression(new float[]{1, 2, 3, 4, 5, 6, 7}));
        print(arithmeticProgression(new float[]{2, 4, 6, 8}));
        print(arithmeticProgression(new float[]{0, 3, 6, 9, 12, 15}));
        print(arithmeticProgression(new float[]{1, 2, 3, 49, 5, 6}));
    }

    private static void print(boolean b) {
        if (b) {
            System.out.println("Последовательность элементов массива является арифмитической прогрессией.");
        } else {
            System.out.println("Последовательность элементов массива НЕ является арифмитической прогрессией.");
        }

    }

    private static boolean arithmeticProgression(float[] ints) {
        boolean b;
        float sum1 = ((ints[0] + ints[ints.length - 1]) / 2) * (ints.length);
        float sum2 = 0;
        for (int i = 0; i < ints.length; i++) {
            sum2 += ints[i];
        }
        if (sum1 == sum2) {
            b = true;
        } else {
            b = false;
        }
        return b;
    }
}
