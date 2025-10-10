package Sep27.Array;

import java.util.Scanner;

public class StringArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] carBrands = new String [5];

        System.out.println("Enter the car Brands");

        for (int i = 0; i < carBrands.length; i++) {

            carBrands[i] = scanner.next();

        }

        for (int i = 0; i < carBrands.length; i++) {

            System.out.println(carBrands[i]);
        }


    }
}
