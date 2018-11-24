package ls17.intShop;

import java.util.Scanner;

public class User {
    private String login;
    private String password;

    public static void main(String[] args) {
        System.out.println("Enter your login: ");
        Scanner scanner = new Scanner(System.in);
        User u = new User();
        String log = scanner.nextLine();
        System.out.println("Enter your password: ");
        String pass = scanner.nextLine();
        u.setLogin(log);
        u.setPassword(pass);

        Basket basket = new Basket();
        System.out.println("In Your Basket: " + basket.getChoicedProducts());

       /*
        System.out.println(u.getLogin());
        System.out.println(u.getPassword());
        */
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
