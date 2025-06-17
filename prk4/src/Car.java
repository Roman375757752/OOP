public class Car implements Vehicle {
    private final String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void startEngine() {
        System.out.println("Автомобиль " + model + ": двигатель запущен (Врум-врум!)");
    }

    @Override
    public String getModel() {
        return model;
    }
}

