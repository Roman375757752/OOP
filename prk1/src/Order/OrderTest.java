package Order;

public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order("ORD123", "2025-05-19", 850.50);

        order1.displayInfo();

        System.out.println("Увеличим сумму на 300");
        order1.increaseAmount(300);
        order1.displayInfo();

        System.out.println("Это дорогой заказ? " + (order1.isExpensive() ? "Да" : "Нет"));

        System.out.println("Уменьшим сумму на 1200 (проверка на ограничение ниже 0)");
        order1.decreaseAmount(1200);
        order1.displayInfo();

        System.out.println("Изменим сумму на 1500");
        order1.changeAmount(1500);
        order1.displayInfo();
        System.out.println("Это дорогой заказ? " + (order1.isExpensive() ? "Да" : "Нет"));

        System.out.println("Текущая дата заказа: " + order1.getDate());
        System.out.println("Обновим дату на 2025-06-01");
        order1.changeDate("2025-06-01");
        order1.displayInfo();

        System.out.println("Обновим номер заказа на ORD999");
        order1.updateOrderNumber("ORD999");
        order1.displayInfo();
    }
}
