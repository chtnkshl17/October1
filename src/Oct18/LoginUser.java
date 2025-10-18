package Oct18;

import com.sun.security.jgss.GSSUtil;

public class LoginUser {

    private String userName;
    private String password;

    public LoginUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public void loginUser(String userName, String password) {

        if (userName.equalsIgnoreCase(this.userName) && password.equals(this.password)) {

            System.out.println("You are logged in");
            System.out.println("Welcome to my App");


        } else {

            System.out.println("Authentication failed, Plaese check username or password");
        }


    }

}

