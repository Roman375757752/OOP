public class Electronics extends AbstractProduct {
    private final String warranty;

    public Electronics(String id, String name, double price, String warranty) {
        super(id, name, price);
        this.warranty = warranty;
    }

    @Override
    public String getDescription() {
        return "Электроника. Гарантия: " + warranty;
    }
}
