package day2Homework;

public class L11Ex17 {
    public static void main(String[] args) {
        wannaLearn(1, true);
        wannaLearn(1, false);
        wannaLearn(98, true);
        wannaLearn(2, false);
        wannaLearn(-1, true);
        wannaLearn(121, true);
    }

    private static void wannaLearn(int lessonNumber, boolean isUserPremium) {
        if (lessonNumber >= 1 && lessonNumber <= 100) {
            if (lessonNumber > 1 && isUserPremium) {
                print("Lesson number " + lessonNumber + " is available, welcome!");
            } else if (lessonNumber == 1) {
                print("Lesson number " + lessonNumber + " is available to all, good luck!");
            } else {
                print("Sorry, to view lesson number " + lessonNumber + ", activate your premium subscription.");
            }
        } else {
            print("Incorrect data");
        }
    }

    private static void print(String text) {
        System.out.println(text);
    }
}
