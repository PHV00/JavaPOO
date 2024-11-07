public class JobLinux extends Job {
    @Override
    public Step createJob() {
        return new StepLinux();
    }
}