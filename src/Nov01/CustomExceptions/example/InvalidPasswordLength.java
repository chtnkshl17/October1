package Nov01.CustomExceptions.example;

public class InvalidPasswordLength extends RuntimeException{
    public InvalidPasswordLength(String message) {
        super(message);
    }
}
