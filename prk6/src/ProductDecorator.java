public abstract class ProductDecorator implements Product {
    protected Product decoratedProduct;

    public ProductDecorator(Product decoratedProduct) {
        this.decoratedProduct = decoratedProduct;
    }

    @Override
    public String getId() { return decoratedProduct.getId(); }
    @Override
    public String getName() { return decoratedProduct.getName(); }
    @Override
    public double getPrice() { return decoratedProduct.getPrice(); }
    @Override
    public String getDescription() { return decoratedProduct.getDescription(); }
}

