public class StepWindows implements Step {
    @Override
    public void execute() {
        System.out.println("Ajustando Windows.");
    }

    @Override
    public void cancel() {
        System.out.println("Cancelando operação Windows!");
    }
}