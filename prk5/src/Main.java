import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем игровой движок
        GameEngine gameEngine = new GameEngine();
        Scanner scanner = new Scanner(System.in);

        // Создаем контроллеры
        KeyboardController keyboard = new KeyboardController("Razer ");
        GamepadController gamepad = new GamepadController("PS4");
        VRController vr = new VRController("Oculus Touch");

        // Создаем адаптеры
        ControllerInput keyboardInput = new KeyboardAdapter(keyboard);
        ControllerInput gamepadInput = new GamepadAdapter(gamepad);
        ControllerInput vrInput = new VRAdapter(vr);

        while (true) {
            System.out.println("\nМеню управления игровыми контроллерами:");
            System.out.println("1. Подключить клавиатуру");
            System.out.println("2. Подключить геймпад");
            System.out.println("3. Подключить VR-контроллер");
            System.out.println("4. Отключить клавиатуру");
            System.out.println("5. Отключить геймпад");
            System.out.println("6. Отключить VR-контроллер");
            System.out.println("7. Начать игру");
            System.out.println("8. Поставить игру на паузу");
            System.out.println("9. Завершить игру");
            System.out.println("10. Получить ввод с контроллера");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                    gameEngine.subscribe(keyboard);
                    break;
                case 2:
                    gameEngine.subscribe(gamepad);
                    break;
                case 3:
                    gameEngine.subscribe(vr);
                    break;
                case 4:
                    gameEngine.unsubscribe(keyboard);
                    break;
                case 5:
                    gameEngine.unsubscribe(gamepad);
                    break;
                case 6:
                    gameEngine.unsubscribe(vr);
                    break;
                case 7:
                    gameEngine.startGame();
                    break;
                case 8:
                    gameEngine.pauseGame();
                    break;
                case 9:
                    gameEngine.endGame();
                    break;
                case 10:
                    System.out.println("\nВыберите контроллер для получения ввода:");
                    System.out.println("1. Клавиатура");
                    System.out.println("2. Геймпад");
                    System.out.println("3. VR-контроллер");
                    System.out.print("Ваш выбор: ");
                    int inputChoice = scanner.nextInt();

                    switch (inputChoice) {
                        case 1:
                            System.out.println("Ввод: " + keyboardInput.getInput());
                            break;
                        case 2:
                            System.out.println("Ввод: " + gamepadInput.getInput());
                            break;
                        case 3:
                            System.out.println("Ввод: " + vrInput.getInput());
                            break;
                        default:
                            System.out.println("Неверный выбор");
                    }
                    break;
                default:
                    System.out.println("Неверный выбор, попробуйте снова");
            }
        }

        scanner.close();
    }
}