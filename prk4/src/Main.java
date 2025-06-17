import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Получаем экземпляр реестра (Singleton)
        VehicleRegistry registry = VehicleRegistry.getInstance();
        Scanner scanner = new Scanner(System.in); // для чтения с клавы

        while (true) {
            System.out.println("\nВыберите тип транспортного средства:");
            System.out.println("1. Автомобиль");
            System.out.println("2. Мотоцикл");
            System.out.println("3. Грузовик");
            System.out.println("4. Показать зарегистрированные транспортные средства");
            System.out.println("5. Выход");
            System.out.print("Ваш выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            if (choice == 5) {
                break;
            }

            switch (choice) {
                case 1:
                    createAndRegisterVehicle(new CarFactory(), scanner, registry);
                    break;
                case 2:
                    createAndRegisterVehicle(new MotorcycleFactory(), scanner, registry);
                    break;
                case 3:
                    createAndRegisterVehicle(new TruckFactory(), scanner, registry);
                    break;
                case 4:
                    registry.listVehicles();
                    break;
                default:
                    System.out.println("Неверный выбор, попробуйте снова");
            }
        }

        scanner.close();
    }

    private static void createAndRegisterVehicle(VehicleFactory factory, Scanner scanner, VehicleRegistry registry) {
        System.out.print("Введите модель: ");
        String model = scanner.nextLine();

        Vehicle vehicle = factory.createVehicle(model);
        vehicle.startEngine();
        registry.registerVehicle(vehicle);
    }
}