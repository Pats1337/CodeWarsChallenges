package day5Homework.lesson22;

public abstract class Animal {
    protected final String nickname;

    protected Animal(String nickname) {
        this.nickname = nickname;
    }

    protected abstract String howMoves();

    protected String getType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return getType() + " по кличке " + nickname + ", " + howMoves() + ".";
    }
}
