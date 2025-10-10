package Sep30;

public class ArraySwapping {

    public static void main(String[] args) {

        int[] arr = {10 , 20 , 30 ,40,50,60,70,80,90,100};

        for (int i = 0; i < arr.length/2; i++) {


            int j = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = j;

        }

        for (int element : arr){
            System.out.println(element);
        }

    }
}
