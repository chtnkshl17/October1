package Sep20;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

            Scanner scanner= new Scanner(System.in);
            System.out.println("Enter the value of N");
            System.out.println();
          int N= scanner.nextInt();

          int x = 1;
          int sum=0;
            while (x <= N) {
                System.out.println(x);
                sum= sum+x;
                x++;
            }
            System.out.println();
            System.out.println("Sum of numbers: "+sum);

            int y = 1;
            int sume = 0;
            int sumo = 0;

            while(y <= N) {

                if (y % 2 == 0) {
                    sume = sume + y;
                    y++;
                }
                else {
                    sumo = sumo + y;
                    y++;
                }
            }

                System.out.println("Sum of even numbers: " + sume);
                System.out.println("Sum of odd numbers: " + sumo);


    }
}
