package Sep27;

public class ComputerMain {

    public static void main(String[] args) {

        Computer computer = new Computer();

        computer.brand = "Dell";
        computer.color = "Silver";
        computer.memory = 2;
        computer.type = "Laptop";

        computer.programming();
        computer.surfInternet();
        computer.calculations();
        computer.gaming();
    }
}
