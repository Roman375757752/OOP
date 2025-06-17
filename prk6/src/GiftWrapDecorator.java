public class GiftWrapDecorator extends ProductDecorator {
    public GiftWrapDecorator(Product decoratedProduct) {
        super(decoratedProduct);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 200.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (Подарочная упаковка)";
    }
}
