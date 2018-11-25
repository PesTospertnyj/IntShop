package ls17.intShop;

import java.util.Queue;

public class Category {
    private String name;
    private Queue<Product> products;

    public Category(String name, Queue<Product> products) {
        this.name = name;
        this.products = products;
    }

    public Category(String name) {
        this.name = name;
    }

    public Category() {
    }
}
