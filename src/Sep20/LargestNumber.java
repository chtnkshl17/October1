package Sep20;

import javax.swing.*;
import java.util.Scanner;

public class LargestNumber
{
    public static void main(String[] args)

    {
       Scanner scanner= new Scanner(System.in);

        System.out.println("Enter value of x: ");
        int x= scanner.nextInt();

        System.out.println("Enter value of y: ");
        int y= scanner.nextInt();

        System.out.println("Enter value of z: ");
        int z= scanner.nextInt();

        if(x>y && x>z)
        {
            System.out.println("x is largest");
        }
         else if (y>z)
        {
            System.out.println("y is largest");
        }
         else
        {
            System.out.println("z is largest");

        }



    }
}

