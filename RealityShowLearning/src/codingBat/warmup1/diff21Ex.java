package codingBat.warmup1;

// Given an int n, return the absolute difference between n and 21,
// except return double the absolute difference if n is over 21.

public class diff21Ex {
    public static void main(String[] args) {
        print(diff21(19));
        print(diff21(10));
        print(diff21(21));
        print(diff21(22));
        print(diff21(25));
        print(diff21(30));
        print(diff21(-1));
        print(diff21(-2));
        print(diff21(50));
    }

    private static void print(int x) {
        System.out.println(x);
    }

    private static int diff21(int n) {
        int x;
        if (n <= 21) {
            x = 21 - n;
        } else {
            x = (n - 21) * 2;
        }
        return x;
    }
}
