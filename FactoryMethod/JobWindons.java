public class JobWindows extends Job {
    @Override
    public Step createJob() {
        return new StepWindows();
    }
}