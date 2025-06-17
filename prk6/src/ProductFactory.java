public class ProductFactory {
    public static Product createProduct(String type, String id, String name, double price, String... params) {
        return switch (type.toLowerCase()) {
            case "electronics" -> new Electronics(id, name, price, params[0]);
            case "clothing" -> new Clothing(id, name, price, params[0]);
            case "book" -> new Book(id, name, price, params[0]);
            default -> throw new IllegalArgumentException("Неизвестный тип продукта: " + type);
        };
    }
}
