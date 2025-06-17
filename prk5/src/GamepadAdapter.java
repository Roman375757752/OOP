public class GamepadAdapter implements ControllerInput {
    private final GamepadController gamepad;

    public GamepadAdapter(GamepadController gamepad) {
        this.gamepad = gamepad;
    }

    @Override
    public String getInput() {
        // Имитация получения ввода с геймпада
        String input = "L-Stick:0.5,-0.5; Button:A,B,X";
        System.out.printf("Адаптер геймпада преобразовал ввод: %s -> [MOVE:0.5,-0.5, BTN:A,B,X]\n", input);
        return "[MOVE:0.5,-0.5, BTN:A,B,X]";
    }
}
