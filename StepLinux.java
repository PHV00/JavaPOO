public class StepLinux implements Step {
    @Override
    public void run() {
        System.out.println("Ajustando Linux.");
    }

    @Override
    public void cancel() {
        System.out.println("Cancelando operação Linux!");
    }
}