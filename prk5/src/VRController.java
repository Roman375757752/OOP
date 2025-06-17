public class VRController implements GameObserver {
    private final String name;

    public VRController(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.printf("VR-контроллер '%s' получил событие: %s\n", name, event);
    }
}
