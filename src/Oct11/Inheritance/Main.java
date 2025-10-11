package Oct11.Inheritance;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();

        student.name = "Simranjeet";
        student.email = "simranjeet@java.com";
        student.course = "Java";

        System.out.println("Name :" + student.name);
        System.out.println("email :" + student.email);
        System.out.println("Course :" + student.course);

        System.out.println(student.name + " can :");

        student.walk();
        student.talk();
        student.study();


    }
}
