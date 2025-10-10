package Sep23;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 2;) {

            System.out.println("Choose the operation from the following:");
            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for Subtraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Division");
            System.out.println("Press 5 for Modulus");
            System.out.println();
            int operation = scanner.nextInt();
            System.out.println("Enter the first number");
            float num1 = scanner.nextInt();
            System.out.println("Enter the Second number");
            float num2 = scanner.nextInt();

            switch (operation) {

                case 1:
                    float sum = num1 + num2;
                    System.out.println(sum);
                    break;

                case 2:
                    float sub = num1 - num2;
                    System.out.println(sub);
                    break;

                case 3:
                    float mul = num1 * num2;
                    System.out.println(mul);
                    break;

                case 4:
                    float div = num1 / num2;
                    System.out.println(div);
                    break;

                case 5:
                    float mod = num1 % num2;
                    System.out.println(mod);
                    break;

                default:
                    System.out.println("Enter a valid operation");
            }


            System.out.println("Would you like to do another Operation");
            System.out.println("Press 1 for Yes, Press 2 for No");

            i = scanner.nextInt();

            if(i == 2 ){
                break;
            }

            }
        }

    }




