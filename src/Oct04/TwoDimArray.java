package Oct04;

import java.util.Scanner;

public class TwoDimArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                System.out.println("Enter value for : " +i+" "+j);
                arr[i][j] = scanner.nextInt();

            }

        }
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {

                System.out.print(arr[j][k]+" ");

                }
                System.out.println();
            }

    }
}
