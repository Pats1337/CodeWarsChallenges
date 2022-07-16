package Day2Homework;

public class L11Ex13 {
    public static void main(String[] args) {
        print(avgScore(4f, 5f, 5f, 4f, 4f));
        print(avgScore(5f, 5f, 5f, 5f, 5f));
        print(avgScore(3f, 3f, 5f, 3f, 3f));
        print(avgScore(2f, 2f, 2f, 4f, 4f));
        print(avgScore(-1f, 5f, 5f, 4f, 4f));
        print(avgScore(4f, 5f, 5f, 6f, 4f));
    }

    private static void print(int avgScore) {
        if (avgScore == -1) {
            System.out.println("Error! Incorrect grades were entered.");
        } else if (avgScore == 2) {
            System.out.println("You are an underachiever.");
        } else if (avgScore == 3) {
            System.out.println("You're a C- student.");
        } else if (avgScore == 4) {
            System.out.println("You're a B- student.");
        } else {
            System.out.println("You are an honors student.");
        }
    }

    private static int avgScore(float i, float i1, float i2, float i3, float i4) {
        int avgScore;
        float x = (i + i1 + i2 + i3 + i4) / 5;
        if ((i > 5 || i <= 0) ||
                (i1 > 5 || i1 <= 0) ||
                (i2 > 5 || i2 <= 0) ||
                (i3 > 5 || i3 <= 0) ||
                (i4 > 5 || i4 <= 0)) {
            avgScore = -1;
        } else if (x < 3) {
            avgScore = 2;
        } else if (x < 4) {
            avgScore = 3;
        } else if (x < 5) {
            avgScore = 4;
        } else {
            avgScore = 5;
        }
        return avgScore;
    }
}
