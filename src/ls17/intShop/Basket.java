package ls17.intShop;

import java.util.Collection;
import java.util.LinkedList;

public class Basket extends Product{
    Collection choicedProducts = new LinkedList();

    public void addToBasket(){
    }

    public Basket(String name, double price, double rating) {
        super(name, price, rating);
    }
}
