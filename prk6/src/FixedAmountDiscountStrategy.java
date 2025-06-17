public class FixedAmountDiscountStrategy implements DiscountStrategy {
    private final double amount;

    public FixedAmountDiscountStrategy(double amount) {
        this.amount = amount;
    }

    @Override
    public double applyDiscount(double originalPrice) {
        return Math.max(0, originalPrice - amount);
    }
}
