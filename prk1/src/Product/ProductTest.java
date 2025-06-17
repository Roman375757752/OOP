package Product;

public class ProductTest {
    public static void main(String[] args) {
        Product product1 = new Product("Молоко", 79.90, 10);

        product1.displayInfo();

        System.out.println("Увеличим количество на 5");
        product1.increaseQuantity(5);
        product1.displayInfo();

        System.out.println("Уменьшим количество на 12");
        product1.decreaseQuantity(12);  // Проверка на то, что не уходит в минус
        product1.displayInfo();

        System.out.println("Продукт доступен? " + (product1.isAvailable() ? "Да" : "Нет"));

        System.out.println("Изменим цену на 89.90");
        product1.changePrice(89.90);
        System.out.println("Новая цена: " + product1.getPrice());

        System.out.println("Установим количество в 20");
        product1.changeQuantity(20);
        product1.displayInfo();

        System.out.println("Переименуем продукт в 'Йогурт'");
        product1.updateName("Йогурт");
        product1.displayInfo();
    }
}
