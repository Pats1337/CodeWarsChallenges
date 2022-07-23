package day7.ex2;

public class NotNull implements Validation{

    @Override
    public boolean isValid(String text) {
        return text != null;
    }
}
