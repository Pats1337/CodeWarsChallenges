package day2Homework;

public class L11Ex18 {
    private static int currentPlayer = 1;

    public static void main(String[] args) {
        doStep(1);
        doStep(2);
        doStep(1);
        doStep(1);
        doStep(2);
        doStep(2);
    }

    private static void doStep(int numberPlayer) {
        if (numberPlayer == currentPlayer) {
            print("Player " + numberPlayer + " do step");
            if (currentPlayer == 1){
                currentPlayer = 2;
            } else {
                currentPlayer = 1;
            }
        }
    }

    private static void print(String text) {
        System.out.println(text);
    }
}
