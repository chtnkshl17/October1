package Sep30;

public class ArrayAssignment {

    public static void main(String[] args) {

        int[] arr = {10, 23, 234, 343, 34};

        int maxNumber = arr[0];
        int minNumber = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }

        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < minNumber) {
                minNumber = arr[i];
            }
        }

        System.out.println("Maximum number stored in array : "+maxNumber);
        System.out.println("Minimum number stored in array : "+minNumber);
    }

}
