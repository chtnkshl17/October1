package Oct28;

import java.util.Scanner;

public class DemoException {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        try {
            for (int i = 0; i < 6; i++) {
                arr[i] = scanner.nextInt();
            }

        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }


        for (int n : arr) {

            System.out.println(n);
        }
    }


}
