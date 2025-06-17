public abstract class AbstractProduct implements Product {
    private final String id;
    private final String name;
    private final double price;

    protected AbstractProduct(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String getId() { return id; }
    @Override
    public String getName() { return name; }
    @Override
    public double getPrice() { return price; }
}
