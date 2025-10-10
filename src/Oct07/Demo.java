package Oct07;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        String name = "Pragra";


        System.out.println(name.length());

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.isEmpty());

        char[] chars = name.toCharArray();

        for (char ch : chars) {
            System.out.println(ch);
        }

        System.out.println(name.equalsIgnoreCase("pragra"));

        System.out.println(name.charAt(3));
        System.out.println(name.substring(3));



    }

}
