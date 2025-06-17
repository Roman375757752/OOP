public class Truck implements Vehicle {
    private final String model;

    public Truck(String model) {
        this.model = model;
    }

    @Override
    public void startEngine() {
        System.out.println("Грузовик " + model + ": двигатель запущен (Гууу-гууу!)");
    }

    @Override
    public String getModel() {
        return model;
    }
}
