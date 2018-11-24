package ls17.intShop;

public class Category {
    private String name;
    private String[] allProducts = {"Audi", "Honda", "BMW", "Toyota", "Aston Martin"};

    Category home = new Category();
    Category products = new Category();
    Category aboutUs = new Category();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAllProducts() {
        return allProducts;
    }

    public void setAllProducts(String[] allProducts) {
        this.allProducts = allProducts;
    }
}
