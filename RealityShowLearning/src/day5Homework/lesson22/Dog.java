package day5Homework.lesson22;

public class Dog extends Animal{

    protected Dog(String nickname) {
        super(nickname);
    }

    @Override
    protected String howMoves() {
        return "бегает по земле";
    }

    @Override
    protected String getType(){
        return "Собака";
    }

}
