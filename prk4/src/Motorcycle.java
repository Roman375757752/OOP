public class Motorcycle implements Vehicle {
    private final String model;

    public Motorcycle(String model) {
        this.model = model;
    }

    @Override
    public void startEngine() {
        System.out.println("Мотоцикл " + model + ": двигатель запущен (Бррр-бррр!)");
    }

    @Override
    public String getModel() {
        return model;
    }
}
