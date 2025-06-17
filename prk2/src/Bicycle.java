public class Bicycle extends AbstractVehicle {
    public Bicycle(String model, double speed) {
        super(model, speed); //выз констр род класса
    }

    @Override
    public void start() {
        System.out.println("Велосипед " + model + ": начинаю крутить педали");
    }

    @Override
    public void stop() {
        System.out.println("Велосипед " + model + ": перестаю крутить педали");
    }
}