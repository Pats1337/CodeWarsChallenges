package Day2Homework;

public class L10Ex1 {
    public static void main(String[] args) {
        agonyOfChoice(true, true);
        agonyOfChoice(true, false);
        agonyOfChoice(false, true);

    }

    private static void agonyOfChoice(boolean isTodayFriday, boolean aLotOfMoney) {
        if (isTodayFriday && aLotOfMoney) {
            print("We go to the bar alone and drink delicious beer!");
        } else if (isTodayFriday) {
            print("I don't have any money, but I have some good friends. Let's invite him to the bar, because it's Friday night!");
        } else {
            print("It's not Friday, it's not time to drink, it's time to work!");
        }
    }

    private static void print(String text) {
        System.out.println(text);
    }
}
