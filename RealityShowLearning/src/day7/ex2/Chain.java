package day7.ex2;

public class Chain implements Validation {
    private final String message;
    private final Validation validation1;
    private final Validation validation2;

    public Chain(Validation validation1, Validation validation2, String message) {
        this.validation1 = validation1;
        this.validation2 = validation2;
        this.message = message;
    }

    @Override
    public boolean isValid(String text) {
        if (validation1.isValid(text)) {
            return validation2.isValid(text);
        } else {
            throw new IllegalArgumentException(message);
        }
    }

}
