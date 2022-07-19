package day5Homework.lesson22;

public class Duck extends Animal{
    public Duck(String nickname) {
        super(nickname);
    }

    @Override
    protected String howMoves() {
        return "летает в воздухе";
    }

    @Override
    protected String getType(){
        return "Утка";
    }
}
