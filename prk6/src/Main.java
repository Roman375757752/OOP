import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Инициализация базы данных товаров (Singleton)
        ProductDatabase db = ProductDatabase.getInstance();

        // Добавление тестовых товаров
        db.addProduct(ProductFactory.createProduct("electronics", "e1", "Смартфон", 25000, "12 месяцев"));
        db.addProduct(ProductFactory.createProduct("clothing", "c1", "Футболка", 1500, "L"));
        db.addProduct(ProductFactory.createProduct("book", "b1", "Java для начинающих", 1200, "Иван Иванов"));

        // Создание клиента
        Customer customer = new Customer("user1@example.com", "+79123456789");

        // Создание корзины
        ShoppingCart cart = new ShoppingCart();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nМеню интернет-магазина:");
            System.out.println("1. Просмотреть товары");
            System.out.println("2. Добавить товар в корзину");
            System.out.println("3. Просмотреть корзину");
            System.out.println("4. Оформить заказ");
            System.out.println("5. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            if (choice == 5) break;

            switch (choice) {
                case 1:
                    db.listProducts();
                    break;

                case 2:
                    System.out.print("Введите ID товара: ");
                    String id = scanner.nextLine();
                    Product product = db.getProduct(id);

                    if (product != null) {
                        System.out.println("Добавить услуги:");
                        System.out.println("1. Подарочная упаковка (+200 руб)");
                        System.out.println("2. Экспресс-доставка (+500 руб)");
                        System.out.println("3. Без дополнительных услуг");
                        System.out.print("Ваш выбор: ");
                        int service = scanner.nextInt();

                        Product decoratedProduct = product;
                        if (service == 1) {
                            decoratedProduct = new GiftWrapDecorator(product);
                        } else if (service == 2) {
                            decoratedProduct = new ExpressDeliveryDecorator(product);
                        }

                        cart.addItem(decoratedProduct);
                        System.out.println("Товар добавлен в корзину");
                    } else {
                        System.out.println("Товар не найден");
                    }
                    break;

                case 3:
                    cart.showItems();
                    break;

                case 4:
                    System.out.println("\nВыберите тип скидки:");
                    System.out.println("1. Без скидки");
                    System.out.println("2. Скидка 10%");
                    System.out.println("3. Скидка 500 руб");
                    System.out.print("Ваш выбор: ");
                    int discountType = scanner.nextInt();

                    DiscountStrategy strategy;
                    if (discountType == 2) {
                        strategy = new PercentageDiscountStrategy(10);
                    } else if (discountType == 3) {
                        strategy = new FixedAmountDiscountStrategy(500);
                    } else {
                        strategy = new NoDiscountStrategy();
                    }

                    double total = cart.calculateTotal(strategy);
                    System.out.printf("Итого к оплате: %.2f руб.\n", total);

                    // Создание заказа
                    Order order = new Order("ord123", customer);
                    cart.showItems().forEach(order::addItem);

                    // Подписка на уведомления
                    order.addObserver(new EmailNotification());
                    order.addObserver(new SMSNotification());

                    // Изменение статуса (вызовет уведомления)
                    order.setStatus("Оплачен");
                    order.setStatus("В обработке");
                    order.setStatus("Отправлен");

                    System.out.println("Заказ успешно оформлен!");
                    break;
            }
        }

        scanner.close();
    }
}