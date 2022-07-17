package day2Homework;

public class L10Ex2 {
    public static void main(String[] args) {
        whatToDrink(3.20f, 5.75f, 15f);
        whatToDrink(3.20f, 5.75f, 4f);
        whatToDrink(3.20f, 5.75f, 5.75f);
        whatToDrink(3.20f, 5.75f, 1f);
    }

    private static void whatToDrink(float beerPrice, float wiskeyPrice, float myBudget) {
        if (myBudget >= wiskeyPrice + beerPrice) {
            print("Whiskey and beer, please! ");
        } else if (myBudget >= wiskeyPrice) {
            print("It's probably a great day for whiskey. Bartender, one whiskey, please!");
        } else if (myBudget >= beerPrice) {
            print("Eh, not enough whiskey today, so I'll have a beer. Buddy, pour me a mug of Guiness.");
        } else {
            print("Unfortunately, we don't have any money left for booze. I'm going home. ");
        }
    }

    private static void print(String text) {
        System.out.println(text);
    }
}
