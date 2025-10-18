package Oct18;

public class LoginDemo {

    public static void main(String[] args) {

        LoginUser loginUser = new LoginUser("Pragra", "Password");


        System.out.println("User Name : " + loginUser.getUserName());

        loginUser.setPassword("Password1");

        loginUser.loginUser("pragra", "Password");


    }
}
