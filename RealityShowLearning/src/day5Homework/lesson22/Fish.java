package day5Homework.lesson22;

public class Fish extends Animal{

    protected Fish(String nickname) {
        super(nickname);
    }

    @Override
    protected String howMoves() {
        return "плавает в воде";
    }

    @Override
    protected String getType(){
        return "Рыба";
    }


}
