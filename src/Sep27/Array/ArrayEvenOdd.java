package Sep27.Array;

import java.lang.reflect.Array;

public class ArrayEvenOdd {

    public static void main (String[] args){

        int[] arr = {10, 23, 234, 343, 34};

        System.out.println("Even numbers in the array :");
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] % 2 == 0){
                System.out.println(arr[i]);
            }
        }
        System.out.println("Odd numbers in the array : ");
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] % 2 != 0){
                System.out.println(arr[i]);
            }

        }


    }
}
