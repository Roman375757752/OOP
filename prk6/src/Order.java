import java.util.ArrayList;
import java.util.List;

public class Order {
    private final String id;
    private final Customer customer;
    private final List<Product> items = new ArrayList<>();
    private String status;
    private final List<OrderObserver> observers = new ArrayList<>();

    public Order(String id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.status = "Создан";
    }

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public double calculateTotal(DiscountStrategy discountStrategy) {
        double total = items.stream().mapToDouble(Product::getPrice).sum();
        return discountStrategy.applyDiscount(total);
    }

    // Геттеры и другие методы
}

