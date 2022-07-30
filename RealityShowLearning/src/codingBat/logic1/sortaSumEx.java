package codingBat.logic1;

//Given 2 ints, a and b, return their sum.
// However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.

public class sortaSumEx {
    public static void main(String[] args) {
        print(sortaSum(3,4));
        print(sortaSum(9,4));
        print(sortaSum(10,11));
    }

    private static void print(int sortaSum) {
        System.out.println(sortaSum);
    }

    private static int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19){
            sum = 20;
        }
        return sum;
    }
}
