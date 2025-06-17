import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
    private static ProductDatabase instance;
    private final Map<String, Product> products = new HashMap<>();

    private ProductDatabase() {}

    public static synchronized ProductDatabase getInstance() {
        if (instance == null) {
            instance = new ProductDatabase();
        }
        return instance;
    }

    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    public Product getProduct(String id) {
        return products.get(id);
    }

    public void removeProduct(String id) {
        products.remove(id);
    }

    public void listProducts() {
        System.out.println("\nСписок товаров:");
        products.values().forEach(product ->
                System.out.println(product.getId() + ": " + product.getName() + " - " + product.getPrice() + " руб.")
        );
    }
}