package ls17.intShop;

public class Auto extends Product {
    public static void main(String[] args) {
        Product p = new Product();
        p.setName("BMW");
        p.setPrice(1500.75);
        p.setRating(5.0);
        getInfo(p);
    }

    public static void getInfo(Product p) {
        System.out.println(p.getName() + p.getPrice() + p.getRating());
    }
}
