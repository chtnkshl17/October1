package Oct04;

import java.util.Scanner;

public class TwoDimArrProblem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] arr3 = new int[3][3];


        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {

                System.out.println("Enter value for Array 1: " + i + " " + j);
                arr1[i][j] = scanner.nextInt();

            }

        }

        for (int j = 0; j < arr2.length; j++) {
            for (int k = 0; k < arr2.length; k++) {

                System.out.println("Enter value for Array 2: " + j + " " + k);
                arr2[j][k] = scanner.nextInt();

            }
        }

        for (int l = 0; l < arr3.length; l++) {
            for (int m = 0; m < arr3.length; m++) {

                arr3[l][m] = arr1[l][m] + arr2[l][m];

            }

        }

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {

                System.out.print(arr3[i][j] + " ");

            }
            System.out.println();

        }



    }


}

