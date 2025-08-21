package Banco.Exception;

public class WithDrawLimitException extends RuntimeException {
    public WithDrawLimitException(String message) {
        super(message);
    }
}
