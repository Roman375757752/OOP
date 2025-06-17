public class Clothing extends AbstractProduct {
    private final String size;

    public Clothing(String id, String name, double price, String size) {
        super(id, name, price);
        this.size = size;
    }

    @Override
    public String getDescription() {
        return "Одежда. Размер: " + size;
    }
}
