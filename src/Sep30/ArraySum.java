package Sep30;

public class ArraySum {

    public static void main(String[] args) {

        int[] arr = {10, 23, 234, 343, 34};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum+arr[i];

        }

        System.out.println("Sum of numbers in the array is : "+sum);

    }
}
