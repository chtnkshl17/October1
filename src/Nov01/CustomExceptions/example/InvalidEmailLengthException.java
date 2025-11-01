package Nov01.CustomExceptions.example;

public class InvalidEmailLengthException extends RuntimeException{
    public InvalidEmailLengthException(String message) {
        super(message);
    }
}
