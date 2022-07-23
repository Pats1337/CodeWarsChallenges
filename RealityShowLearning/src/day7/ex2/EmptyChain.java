package day7.ex2;

public class EmptyChain extends Chain {

    public EmptyChain(Validation next) {
        super(new Empty(),
                next,
                "Вы не ввели пароль");
    }

}
