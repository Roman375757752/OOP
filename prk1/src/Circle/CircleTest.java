package Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0, "Красный");

        circle1.displayInfo();
        System.out.println("Площадь: " + circle1.calculateArea());
        System.out.println("Периметр: " + circle1.calculatePerimeter());
        System.out.println("Это большой круг? " + (circle1.isBig() ? "Да" : "Нет"));

        circle1.changeColor("Синий");
        System.out.print("После смены цвета: ");
        circle1.displayInfo();

        circle1.increaseRadius(3.0);
        System.out.print("После увеличения радиуса: ");
        circle1.displayInfo();
        System.out.println("Новая площадь: " + circle1.calculateArea());
        System.out.println("Теперь это большой круг? " + (circle1.isBig() ? "Да" : "Нет"));

        circle1.decreaseRadius(2.0);
        System.out.print("После уменьшения радиуса: ");
        circle1.displayInfo();

        circle1.decreaseRadius(10.0);
        System.out.print("После попытки уменьшить радиус слишком сильно: ");
        circle1.displayInfo();
    }
}
