package day7.ex2;

public class NotNullChain extends Chain {

    public NotNullChain(Validation next) {
        super(new NotNull(),
                next,
                "Пароль пуст");
    }

}
