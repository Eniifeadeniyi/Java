package AccountExceptions;

public class InvalidWithdrawAmountException extends AccountException {
    public InvalidWithdrawAmountException(String message) {
        super(message);
    }
}
