public class KeyboardAdapter implements ControllerInput {
    private final KeyboardController keyboard;

    public KeyboardAdapter(KeyboardController keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String getInput() {
        // Имитация получения ввода с клавиатуры
        String input = "W,A,S,D,Space";
        System.out.printf("Адаптер клавиатуры преобразовал ввод: %s -> [UP,LEFT,DOWN,RIGHT,JUMP]\n", input);
        return "[UP,LEFT,DOWN,RIGHT,JUMP]";
    }
}

