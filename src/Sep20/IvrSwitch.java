package Sep20;

import java.util.Scanner;

public class IvrSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press 1 for English");
        System.out.println("Press 2 for french");
        System.out.println();

        int lang = scanner.nextInt();

        if (lang == 1) {
            System.out.println("English Selected");
            System.out.println();
            System.out.println("Press 1 for Sales");
            System.out.println("Press 2 for Tech Support");
            System.out.println("Press 3 for Billing");
            System.out.println("Press 4 for Feedback");
            System.out.println();
            System.out.println("Make selection:");

            int selection = scanner.nextInt();

            switch (selection) {
                case 1:

                    System.out.println("Sales");
                    System.out.println("Press 1 for Offers");
                    System.out.println("Press 2 for Mobile");
                    System.out.println();
                    System.out.println("Select option");
                    int selectOption1 = scanner.nextInt();

                    switch (selectOption1) {
                        case 1:
                            System.out.println("Offers");
                            break;
                        case 2:
                            System.out.println("Mobile");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Tech Support");
                    System.out.println("1. Internet issue");
                    System.out.println("2. Network issue");
                    System.out.println();
                    System.out.println("Select option");
                    int selectOption2 = scanner.nextInt();

                    if (selectOption2 == 1) {
                        System.out.println("Internet issue");
                    } else {
                        System.out.println("Network issue");
                    }
                    break;
                case 3:
                    System.out.println("Billing");
                    System.out.println("1. Payment plan");
                    System.out.println("2. Bill payment");
                    System.out.println();
                    System.out.println("Select option");
                    int selectOption3 = scanner.nextInt();

                    if (selectOption3 == 1) {
                        System.out.println("Payment plan");
                    } else {
                        System.out.println("Bill payment");
                    }
                    break;
                case 4:
                    System.out.println("Feedback");
                    break;
            }
        } else {
            System.out.println("French Selected");
            System.out.println();
        }
    }
}
