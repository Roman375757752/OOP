import java.util.ArrayList;
import java.util.List;

public class GameEngine {
    private final List<GameObserver> observers = new ArrayList<>();
    private String currentGameState = "Ожидание";

    public void subscribe(GameObserver observer) {
        if (!observers.contains(observer)) { //сли в списке observers нет такого observer
            observers.add(observer);
            System.out.println("Контроллер подключен");
        } else {
            System.out.println("Этот контроллер уже подключен");
        }
    }

    public void unsubscribe(GameObserver observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
            System.out.println("Контроллер отключен");
        } else {
            System.out.println("Этот контроллер не был подключен");
        }
    }

    public void notifyObservers(String event) {
        currentGameState = event; //нов. сост. игры для всех обсерверов
        for (GameObserver observer : observers) {
            observer.update(event);
        }
    }

    public void startGame() {
        notifyObservers("Начало игры");
    }

    public void pauseGame() {
        notifyObservers("Пауза");
    }

    public void endGame() {
        notifyObservers("Конец игры");
    }
}