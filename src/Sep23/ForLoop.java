package Sep23;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the value of N");
            System.out.println();
            int N = scanner.nextInt();
            int sum = 0;

            for (int i = 1;i <= N;i++){
                System.out.println(i);
                sum = sum + i;
            }
            System.out.println("Sum of N numbers : "+sum);
        }
    }
}
