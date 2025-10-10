package Sep23;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of N");
        System.out.println();
        int N= scanner.nextInt();

        int x = 1;
        int sum =0;

        do{
            System.out.println(x);
            sum = sum + x;
            x++;
        }
        while(x <= N );

        System.out.println("Sum of N numbers : "+sum);
        }
    }

