package Oct11;

public class StringBfrRev {

    public static void main(String[] args) {

        String s = "Hello I am learning java";

        String[] words = s.split(" ");


        StringBuilder result = new StringBuilder();


        for (String word : words) {

            result.append(new StringBuilder(result.reverse()));

        }

        System.out.println(result);


    }
}
