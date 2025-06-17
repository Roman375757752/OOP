public class SMSNotification implements OrderObserver {
    @Override
    public void update(Order order) {
        System.out.printf("Отправка SMS клиенту %s: Статус заказа #%s изменен на '%s'\n",
                order.getCustomer().getPhone(), order.getId(), order.getStatus());
    }
}
