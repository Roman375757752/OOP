public class ExpressDeliveryDecorator extends ProductDecorator {
    public ExpressDeliveryDecorator(Product decoratedProduct) {
        super(decoratedProduct);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 500.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (Экспресс-доставка)";
    }
}
