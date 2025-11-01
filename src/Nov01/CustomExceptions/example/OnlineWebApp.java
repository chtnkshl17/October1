package Nov01.CustomExceptions.example;

public class OnlineWebApp {

    public void register(String email) throws InvalidEmailLengthException {
        if(email.length() < 5){
            throw new InvalidEmailLengthException("invalid email exception");
        }
        // if user is trying to add phone number instead of email, then throw exception
    }

    public void emailConfirmation(String email) throws InvalidEmailLengthException {
        register(email);

        System.out.println("Email notification Sent");
    }

    public void login(String email, String userName) throws InvalidEmailLengthException {
        if(userName.equals(email)){
            throw new InvalidCredentialsException("Invalid Username");
        }
        emailConfirmation(email);
        System.out.println("User is able to login");
    }

    public void shop(String email, String userName) throws InvalidEmailLengthException {
        login(email, userName);
        System.out.println("Find item to shop and checkout");
    }

    public void payment(String email, String userName, PaymentMethod paymentMethod) throws InvalidEmailLengthException {
        shop(email, userName);
        System.out.println("Make Payment");
    }

    public void ecomApp(String email, String userName, PaymentMethod paymentMethod) {
        try {
            payment(email, userName, paymentMethod);
        }catch (InvalidEmailLengthException e){
            e.printStackTrace();
        }
    }
}
