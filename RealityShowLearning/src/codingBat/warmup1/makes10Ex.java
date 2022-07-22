package codingBat.warmup1;

//Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

public class makes10Ex {
    public static void main(String[] args) {
        print(makes10(9, 10));
        print(makes10(9, 9));
        print(makes10(1, 9));
        print(makes10(12, -2));
        print(makes10(8, 3));
    }

    private static void print(boolean makes10) {
        System.out.println(makes10);
    }

    private static boolean makes10(int a, int b) {
        int sum = a + b;
        return sum == 10 || a == 10 || b == 10;
    }
}
