package Nov01.CustomExceptions;

public class InvalidAgeException extends RuntimeException{

    public InvalidAgeException(String message) {
        super(message);
    }
}
