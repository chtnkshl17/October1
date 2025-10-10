package Sep20;

import java.util.Scanner;

public class TableOfAnyNumber {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the value of N for Table");
        int N= scanner.nextInt();
        int x=1;
        int mul=0;

        while (x <= 10){
            mul = N*x;
            System.out.println(N + " X " + x + " = " + mul);
            x++;
        }
    }
    }