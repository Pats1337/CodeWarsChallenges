package codingBat.logic1;

//When squirrels get together for a party, they like to have cigars.
// A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
// Unless it is the weekend, in which case there is no upper bound on the number of cigars.
// Return true if the party with the given values is successful, or false otherwise.

public class cigarPartyEx {
    public static void main(String[] args) {
        print(cigarParty(30, false));
        print(cigarParty(50, false));
        print(cigarParty(70, true));
    }

    private static void print(boolean cigarParty) {
        System.out.println(cigarParty);
    }

    private static boolean cigarParty(int cigars, boolean isWeekend) {
        boolean party = false;
        if (isWeekend) {
            if (cigars >= 40) {
                party = true;
            }
        } else {
            if (cigars <= 60 && cigars >= 40) {
                party = true;
            }
        }
        return party;
    }
}
