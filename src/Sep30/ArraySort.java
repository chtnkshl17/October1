package Sep30;

public class ArraySort {

    public static void main(String[] args) {

        int[] arr = {10, 23, 234, 343, 34};


        for (int i = 0; i < arr.length; i++) {

            int temp = 0;

            for (int j = i+1; j < arr.length; j++){

            if( arr[i]>arr[j]) {

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }

            }

        }

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }



    }
}
