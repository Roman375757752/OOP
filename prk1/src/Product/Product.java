package Product;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void changePrice(double newPrice) {
        this.price = newPrice;
    }

    public void changeQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    public void displayInfo() {
        System.out.println("Продукт: " + name + ", цена: " + price + ", количество: " + quantity);
    }

    public void increaseQuantity(int amount) {
        quantity += amount;
    }

    public void decreaseQuantity(int amount) {
        quantity = Math.max(0, quantity - amount);
    }

    public boolean isAvailable() {
        return quantity > 0;
    }

    public double getPrice() {
        return price;
    }

    public void updateName(String newName) {
        this.name = newName;
    }
}