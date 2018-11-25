package ls17.intShop;


import java.util.LinkedList;
import java.util.Queue;

public class Basket {
    Queue choicedProducts = new LinkedList();

    public void addToBasket(Product product) {
        choicedProducts.add(product);
    }
}