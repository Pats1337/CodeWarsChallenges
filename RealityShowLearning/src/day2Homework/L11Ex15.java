package day2Homework;

public class L11Ex15 {
    public static void main(String[] args) {
        module(10);
        module(-10);
        module(0);
    }

    private static int module(int i) {
        int status;
        if (i == 0) {
            System.out.println("It's ZERO!");
            status = i;
        } else if (i > 0) {
            status = i;
        } else {
            status = i * -1;
        }
        return status;
    }
}
