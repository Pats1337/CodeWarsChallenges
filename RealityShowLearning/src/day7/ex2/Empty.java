package day7.ex2;

public class Empty implements Validation{
    @Override
    public boolean isValid(String text) {
        return !text.isEmpty();
    }
}
