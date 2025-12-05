package AccountExceptions;

public class IncorrectPasswordException extends AccountException{
    public IncorrectPasswordException(String message){
        super(message);
    }
}
