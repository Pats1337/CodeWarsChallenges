package codingBat.logic1;

//The squirrels in Palo Alto spend most of the day playing.
// In particular, they play if the temperature is between 60 and 90 (inclusive).
// Unless it is summer, then the upper limit is 100 instead of 90.
// Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.

public class squirrelPlayEx {
    public static void main(String[] args) {
        print(squirrelPlay(70,false));
        print(squirrelPlay(95,false));
        print(squirrelPlay(95,true));
    }

    private static void print(boolean squirrelPlay) {
        System.out.println(squirrelPlay);
    }

    private static boolean squirrelPlay(int temp, boolean isSummer) {
        boolean playing = false;
        if (isSummer){
            if(temp >= 60 && temp <= 100){
                playing = true;
            }
        }else {
            if(temp >= 60 && temp <= 90){
                playing = true;
            }
        }
        return playing;
    }
}
