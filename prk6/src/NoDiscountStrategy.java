public class NoDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double originalPrice) {
        return originalPrice;
    }
}
