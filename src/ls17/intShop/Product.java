package ls17.intShop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Product {
    private String name;
    private double price;
    private double rating;

    public static void main(String[] args) {
        Auto auto = new Auto();
        Collection collection = new LinkedList();
        ((LinkedList) collection).add(0,"TV");
        ((LinkedList) collection).add(1,auto);
        ((LinkedList) collection).add(2,"Phone");
        System.out.println(collection);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
