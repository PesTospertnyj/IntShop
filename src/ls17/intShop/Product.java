package ls17.intShop;

import java.util.Collection;
import java.util.LinkedList;

public class Product  extends Category{
    private String name;
    private double price;
    private double rating;

    public Product(String name) {
        super(name);
    }

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }

    public static void main(String[] args) {

        Collection<Product> collection = new LinkedList();
        ((LinkedList<Product>) collection).offer(new Product("TV", 750.90, 4.0));
        ((LinkedList<Product>) collection).offer(new Product ("Bag", 15.50, 3.2));
        ((LinkedList<Product>) collection).offer(new Product("Bicycle", 1750.35, 4.9));
        while (!collection.isEmpty())
        System.out.println(((LinkedList<Product>) collection).pop());
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
