package Oct21;

public class BankMain {

    public static void main(String[] args) {

        BankofCanada bankofCanada = new ScotiaBank();

        System.out.println("Scotiabank rate of interest :" + bankofCanada.rateOfInterest());


        BankofCanada bankofCanada1 = new TDBank();

        System.out.println(bankofCanada1.rateOfInterest());


        BankofCanada bankofCanada2 = new PragraBank();

        System.out.println(bankofCanada2.rateOfInterest());


    }
}
