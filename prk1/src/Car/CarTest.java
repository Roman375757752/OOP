package Car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2015, 60000);

        car1.displayInfo();

        System.out.println("Это старый автомобиль? " + (car1.isOld() ? "Да" : "Нет"));
        System.out.println("Это большой пробег? " + (car1.isHighMileage() ? "Да" : "Нет"));

        car1.increaseMileage(5000);
        System.out.print("После увеличения пробега: ");
        car1.displayInfo();

        car1.updateModel("Corolla");
        System.out.print("После смены модели: ");
        car1.displayInfo();
    }
}
