package Sep20;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
     Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the num1");
        int x= scanner.nextInt();

//        System.out.println("Enter the num2");
//        int y= scanner.nextInt();

       if (x%2==0)
       {
           System.out.println("Number is even");
       }
        else
       {
           System.out.println("Number is odd");
       }


    }
}
