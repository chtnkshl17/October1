package Oct07;

import java.util.Scanner;

public class StringRev {

    public static void main(String[] args) {


        String city = "Toronto";

        char[] chars = city.toCharArray();

        for (char ch : chars) {

            System.out.print(ch);

        }

        for (int i = 0; i < chars.length / 2; i++) {


            char temp = chars[i];

            chars[i] = chars[chars.length - 1 - i];

            chars[chars.length - 1 - i] = temp;

        }

        System.out.println();
        System.out.println();

        for (char ch : chars) {

            System.out.print(ch);

        }

        System.out.println();
       
        if (city.equalsIgnoreCase("otnorot")) {

            System.out.println("String is palindrome");


        } else {
            System.out.println("String is not palindrome");
        }


    }

}
