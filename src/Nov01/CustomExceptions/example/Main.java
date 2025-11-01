package Nov01.CustomExceptions.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        OnlineWebApp onlineWebApp = new OnlineWebApp();
        System.out.println("Enter the email address ");
        String email = scanner.next();

        System.out.println("Enter the userName ");
        String userName = scanner.next();

        //  user 1
        onlineWebApp.ecomApp(email, userName, PaymentMethod.CREDIT_CARD);


        // user 2
        onlineWebApp.ecomApp(email, userName, PaymentMethod.MASTER_CARD);


        // password, paymentMethod, phoneNumber
        System.out.println("browse more..");
        System.out.println("End of app");

    }
}
