public class Car extends AbstractVehicle implements ElectricVehicle {
    public Car(String model, double speed) {
        super(model, speed); //выз констр род класса
    }

    @Override
    public void start() {
        System.out.println("Машина " + model + " завелась");
    }

    @Override
    public void stop() {
        System.out.println("Машина " + model + " остановилась");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Машина " + model + " подключена к зарядке");
    }
}