package Sep23;

import javax.swing.*;
import java.util.Scanner;

public class Break {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a number between 1 to 100");

        int luckyNum=78;


        for (int attempt = 1; attempt <= 3;attempt++){

            System.out.println("Attempt :" + attempt);
            int N= scanner.nextInt();

            if(N == luckyNum){

                System.out.println("YOU WON");
                break;
            }else
            {
                if(attempt<3) {
                    System.out.println("TRY AGAIN");
                }else {
                    System.out.println("Attempts finished YOU LOST");
                }
            }

            }

        }


    }

