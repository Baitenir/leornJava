package abstraction.task2;

public abstract class Product {
    private String name;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int getPrice();

    public abstract String getDetails();
}
