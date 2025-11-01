package Nov01.CustomExceptions;

public class DriverExaminer {
    int age;

    public DriverExaminer(int age) {
        this.age = age;
    }

    public String bookTest(int age) {
        if (age < 16) {
            throw new InvalidAgeException("Invalid age for booking exam");
        }
        return "You can book exam";
    }
    public void payment(){
        System.out.println("Need to pay fee for booking the exam");
    }
}
