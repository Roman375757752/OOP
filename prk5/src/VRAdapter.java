public class VRAdapter implements ControllerInput {
    private final VRController vrController;

    public VRAdapter(VRController vrController) {
        this.vrController = vrController;
    }

    @Override
    public String getInput() {
        // Имитация получения ввода с VR-контроллера
        String input = "Gesture:Wave; Position:1.2,0.8,-0.3";
        System.out.printf("Адаптер VR преобразовал ввод: %s -> [GESTURE:WAVE, POS:1.2,0.8,-0.3]\n", input);
        return "[GESTURE:WAVE, POS:1.2,0.8,-0.3]";
    }
}
