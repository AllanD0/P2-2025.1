package Hotel.src.Exception;

public class CheckoutErrorException extends RuntimeException {
    public CheckoutErrorException(String message) {
      super(message);
    }
}
