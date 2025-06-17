import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("Tesla Model S", 120.0));
        vehicles.add(new Bicycle("Stels", 25.0));

        vehicles.add(new Vehicle() {
            @Override
            public void start() {
                System.out.println("Поезд отправляется");
            }

            @Override
            public void stop() {
                System.out.println("Поезд остановился");
            }

            @Override
            public double getSpeed() {
                return 100.0;
            }
        });

        vehicles.add(new Vehicle() {
            @Override
            public void start() {
                System.out.println("Катер отчаливает");
            }

            @Override
            public void stop() {
                System.out.println("Катер пристает к берегу");
            }

            @Override
            public double getSpeed() {
                return 50.0;
            }
        });

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
            vehicle.stop();
            System.out.printf("Текущая скорость: " + vehicle.getSpeed() + " км/ч \n");

            if (vehicle instanceof ElectricVehicle) {
                ((ElectricVehicle) vehicle).chargeBattery();
            }

            System.out.println("----------------------");
        }
    }
}