package Nov04.Collections.ArraylistTopic;

import java.util.ArrayList;

public class MaxMinArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(73);
        list.add(63);
        list.add(55);
        list.add(65);
        list.add(525);
        list.add(22);

        int maxnumber = list.getFirst();
        int minnumber = list.getFirst();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maxnumber) {
                maxnumber = list.get(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < minnumber) {
                minnumber = list.get(i);
            }
        }
        System.out.println("Maximum number in arraylist :" + maxnumber);
        System.out.println("Minimum number in arraylist :" + minnumber);

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        System.out.println("Sum of all the numbers in arraylist :" + sum);

        float avg = (float)sum / list.size();
        System.out.println("Average of the numbers in arraylist :" + avg);

        int numberOfOddNumbers = 0;
        int numberOfEvenNumbers = 0;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) % 2 == 0) {
                numberOfEvenNumbers = numberOfEvenNumbers + 1;
            } else {
                numberOfOddNumbers = numberOfOddNumbers + 1;
            }
        }

        System.out.println("Number of odd Numbers in arraylist :" + numberOfOddNumbers);
        System.out.println("Number of Even Numbers in arraylist :" + numberOfEvenNumbers);

        System.out.println("Arraylist :" + list);
        for (int i = 0; i < list.size() / 2; i++) {
            int j = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set((list.size() - 1 - i), j);
        }
        System.out.println("Reverse Arraylist :" + list);
    }
}
