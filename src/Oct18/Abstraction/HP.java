package Oct18.Abstraction;

public class HP extends Computer{
    @Override
    public void display() {
        System.out.println("Full HD Display running");
    }

    @Override
    public void typing() {

        System.out.println("Typing can be done using Dell computer");

    }

    public void surfing(){

        System.out.println("Internet surfing can be done");
    }
}
