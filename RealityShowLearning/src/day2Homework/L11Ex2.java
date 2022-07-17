package day2Homework;

public class L11Ex2 {
    public static void main(String[] args) {
        print(checkMin(1, 2, 3, 4));
        print(checkMin(2, -1, 3, 4));
        print(checkMin(2, -1, -3, 4));
        print(checkMin(2, -1, 3, -904));
        print(checkMin(-1, -2, -1, 4));
    }

    private static int checkMin(int a, int b, int c, int d) {
        int x;
        if (a <= b & a <= c & a <= d) {
            x = a;
        } else if (b <= a & b <= c & b <= d) {
            x = b;
        } else if (c <= a & c <= b & c <= d) {
            x = c;
        } else {
            x = d;
        }
        return x;
    }

    private static void print(int x) {
        System.out.println("The lowest number received: " + x);
    }
}

