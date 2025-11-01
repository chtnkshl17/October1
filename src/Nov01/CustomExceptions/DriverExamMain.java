package Nov01.CustomExceptions;

import java.util.Scanner;

public class DriverExamMain {
    public static void main(String[] args) {

        System.out.println("Welcome to driver Exam");
        DriverExaminer driverExaminer = new DriverExaminer(18);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter your age");
            int age = scanner.nextInt();
            System.out.println(driverExaminer.bookTest(age));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        driverExaminer.payment();
        System.out.println("End of session");
    }
}
