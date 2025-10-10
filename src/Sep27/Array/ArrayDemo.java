package Sep27.Array;

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] rollNo = new int[10];

        System.out.println("Enter the roll numbers");

        for (int i = 0; i < rollNo.length; i++) {

            rollNo[i] = scanner.nextInt();
        }

        for (int i = 0; i < rollNo.length ; i++) {

            System.out.println(rollNo[i]);

        }
    }
}
