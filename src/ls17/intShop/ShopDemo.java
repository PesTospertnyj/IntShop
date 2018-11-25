package ls17.intShop;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ShopDemo {
    public static void main(String[] args) {
        Category home = new Category("Главная");
        Category products = new Category("Товары");
        Category aboutUs = new Category("О нас");

        Queue<Product> collection = new LinkedList<>();
        collection.offer(new Product("TV", 750.90, 4.0));
        collection.offer(new Product("Bag", 15.50, 3.2));
        collection.offer(new Product("Bicycle", 1750.35, 4.9));

        //products.setProducts(collection);

        while (!collection.isEmpty()) {
            System.out.println(((LinkedList<Product>) collection).pop());
            System.out.println("Enter your login: ");

            Scanner scanner = new Scanner(System.in);
            User u = new User();
            String log = scanner.nextLine();
            System.out.println("Enter your password: ");
            String pass = scanner.nextLine();
            u.setLogin(log);
            u.setPassword(pass);
        }
    }
}
