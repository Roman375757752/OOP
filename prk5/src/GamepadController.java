public class GamepadController implements GameObserver {
    private final String name;

    public GamepadController(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.println("Геймпад '" + name + "' получил событие: " + event);
    }
}
