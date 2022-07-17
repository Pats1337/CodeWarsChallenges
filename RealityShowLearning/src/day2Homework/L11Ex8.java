package day2Homework;

public class L11Ex8 {
    private static int count;
    public static void main(String[] args) {
        print(callCounter());
        print(callCounter());
        print(callCounter());
        print(callCounter());
        print(callCounter());
        print(callCounter());
    }

    private static void print(int x) {
        if (x == 1) {
            System.out.println("The callCounter method was called " + count + " times");
        } else {
            System.out.println("You are over the limit.");
        }
    }

    private static int callCounter() {
        int x;
        count = count + 1;
        if (count >= 5){
            x = -1;
        } else {
            x = 1;
        }
        return x;
    }
}
