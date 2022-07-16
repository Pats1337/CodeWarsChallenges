package Day2Homework;

public class L11Ex16 {
    public static void main(String[] args) {
        checkSquare(1, 2, 3, 4);
        checkSquare(2, 2, 2, 2);
        checkSquare(1, 2, 1, 2);
    }

    private static void print(String text) {
        System.out.println(text);
    }

    private static void checkSquare(int AB, int BC, int CD, int DA) {
        if (AB <= 0 || BC <= 0 || CD <= 0 || DA <= 0) {
            print("Incorrect data");
        } else if (AB == CD && BC == DA) {
            if (AB == BC) {
                print("It's a square");
            } else {
                print("It's a rectangle");
            }
        } else {
            print("It's a quadrangle");
        }
    }
}
