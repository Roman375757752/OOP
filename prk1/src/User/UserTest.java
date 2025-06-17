package User;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User("Анна", "anna@example.com", false);

        user1.displayInfo();

        System.out.println("Пользователь активен? " + (user1.isActive() ? "Да" : "Нет"));

        System.out.println("Активируем пользователя");
        user1.activate();
        user1.displayInfo();

        System.out.println("Пользователь активен? " + (user1.getStatus() ? "Да" : "Нет"));

        System.out.println("Деактивируем пользователя");
        user1.deactivate();
        user1.displayInfo();

        System.out.println("Изменим email на anna.new@example.com");
        user1.updateEmail("anna.new@example.com");
        user1.displayInfo();

        System.out.println("Изменим имя на Аня");
        user1.updateName("Аня");
        user1.displayInfo();

        System.out.println("Вывод через toString(): " + user1.toString());
    }
}
