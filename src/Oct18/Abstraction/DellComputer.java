package Oct18.Abstraction;

public class DellComputer extends Computer{



    @Override
    public void display() {
        System.out.println("4k Display running");
    }

    @Override
    public void typing() {

        System.out.println("Typing can be done using Dell computer");
    }

    public void biometricLogin(){

        System.out.println("You can log in using biometrics ");
    }
}
