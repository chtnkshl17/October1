package Oct18.Abstraction;

public class ComputerMain {

    public static void main(String[] args) {

        DellComputer computer =new DellComputer();

        computer.brand = "Dell";
        System.out.println(computer.brand);

        computer.display();
        computer.typing();
        computer.biometricLogin();

        System.out.println();

        HP computer1 = new HP();
        computer1.brand = "HP";
        System.out.println(computer1.brand);

        computer1.display();
        computer1.typing();
        computer1.surfing();





    }
}
