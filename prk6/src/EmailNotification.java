public class EmailNotification implements OrderObserver {
    @Override
    public void update(Order order) {
        System.out.printf("Отправка email клиенту %s: Статус заказа #%s изменен на '%s'\n",
                order.getCustomer().getEmail(), order.getId(), order.getStatus());
    }
}
