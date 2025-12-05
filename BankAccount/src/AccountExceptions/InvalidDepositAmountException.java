package AccountExceptions;

public class InvalidDepositAmountException extends AccountException {

    public InvalidDepositAmountException(String message) {
        super(message);
    }
}
