package codingBat.logic1;

//You are driving a little too fast, and a police officer stops you.
// Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket.
// If speed is 60 or less, the result is 0.
// If speed is between 61 and 80 inclusive, the result is 1.
// If speed is 81 or more, the result is 2.
// Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.

public class caughtSpeedingEx {
    public static void main(String[] args) {
        print(caughtSpeeding(60,false));
        print(caughtSpeeding(85,false));
        print(caughtSpeeding(40,false));
        print(caughtSpeeding(65,false));
        print(caughtSpeeding(65,true));
    }

    private static void print(int caughtSpeeding) {
        System.out.println(caughtSpeeding);
    }

    private static int caughtSpeeding(int speed, boolean isBirthday) {
        int penaltyChance = 0;
        if (isBirthday){
            if(speed <= 65){
                penaltyChance = 0;
            } else if(speed <= 85){
                penaltyChance = 1;
            }else{
                penaltyChance = 2;
            }
        }else{
            if(speed <= 60){
                penaltyChance = 0;
            } else if(speed <= 80){
                penaltyChance = 1;
            }else{
                penaltyChance = 2;
            }
        }
        return penaltyChance;
    }
}
