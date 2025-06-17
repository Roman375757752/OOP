public class KeyboardController implements GameObserver {
    private final String name;

    public KeyboardController(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.printf("Клавиатура '%s' получила событие: %s\n", name, event);
    }
}

