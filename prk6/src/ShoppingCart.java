import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Product> items = new ArrayList<>();

    public void addItem(Product product) {
        items.add(product);
    }

    public void removeItem(Product product) {
        items.remove(product);
    }

    public double calculateTotal(DiscountStrategy discountStrategy) {
        double total = items.stream().mapToDouble(Product::getPrice).sum();
        return discountStrategy.applyDiscount(total);
    }

    public void showItems() {
        System.out.println("\nСодержимое корзины:");
        items.forEach(item ->
                System.out.println(item.getName() + " - " + item.getPrice() + " руб. (" + item.getDescription() + ")")
        );
    }
}