import java.util.ArrayList;
import java.util.List;

public class VehicleRegistry {
    // Единственный экземпляр класса
    private static volatile VehicleRegistry instance; //созд. 1 общ. переменная для всего класса и хранит ед. объеут
    private final List<Vehicle> vehicles = new ArrayList<>();

    // Приватный конструктор
    private VehicleRegistry() {}

    // Метод для получения экземпляра
    public static VehicleRegistry getInstance() {
        if (instance == null) {
            instance = new VehicleRegistry();
        }
        return instance;
    }

    // Регистрация транспортного средства
    public void registerVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Транспортное средство " + vehicle.getModel() + " зарегистрировано");
    }

    // Вывод списка зарегистрированных транспортных средств
    public void listVehicles() {
        System.out.println("\nСписок зарегистрированных транспортных средств:");
        if (vehicles.isEmpty()) {
            System.out.println("Нет зарегистрированных транспортных средств");
        } else {
            for (Vehicle vehicle : vehicles) {
                //мя класса без пакета
                System.out.println("- " + vehicle.getModel() + " (" + vehicle.getClass().getSimpleName() + ")");
            }
        }
    }
}