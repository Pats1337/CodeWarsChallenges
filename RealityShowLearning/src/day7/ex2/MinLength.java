package day7.ex2;

public class MinLength extends Validation.Abstract {

    private final int minLength;

    public MinLength(int minlength) {
        super("Недостаточное количество символов");
        this.minLength = minlength;
    }

    @Override
    protected boolean isValidInner(String text) {
        return text.length() >= minLength;
    }
}
