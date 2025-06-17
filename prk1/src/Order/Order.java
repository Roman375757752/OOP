package Order;

public class Order {
    private String orderNumber;
    private String date;
    private double amount;

    public Order(String orderNumber, String date, double amount) {
        this.orderNumber = orderNumber;
        this.date = date;
        this.amount = amount;
    }

    public void changeDate(String newDate) {
        this.date = newDate;
    }

    public void changeAmount(double newAmount) {
        this.amount = newAmount;
    }

    public void displayInfo() {
        System.out.println("Заказ #" + orderNumber + ", дата: " + date + ", сумма: " + amount);
    }

    public void increaseAmount(double value) {
        amount += value;
    }

    public void decreaseAmount(double value) {
        amount = Math.max(0, amount - value);
    }

    public boolean isExpensive() {
        return amount > 1000;
    }

    public String getDate() {
        return date;
    }

    public void updateOrderNumber(String newOrderNumber) {
        this.orderNumber = newOrderNumber;
    }
}
