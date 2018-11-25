package ls17.intShop;

public class Category {
    private String name;
    Category home = new Category("Главная");
    Category products = new Category("Товары");
    Category aboutUs = new Category("О нас");

    public Category() {
    }

    public String getName() {
        return name;
    }

    public Category(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
