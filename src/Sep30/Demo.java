package Sep30;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of x");
        int x = scanner.nextInt();
        System.out.println("Enter value of y");
        int y = scanner.nextInt();

        System.out.println("Before Swapping");
        System.out.println("x : "+x);
        System.out.println("y : "+y);


        int z = x;
        x = y;
        y = z;

        System.out.println("After Swapping");
        System.out.println("x : "+x);
        System.out.println("y : "+y);
    }
}
