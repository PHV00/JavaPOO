public class Builder{
    private static Job job;

    public static void main(String[] args) {
        configure();
        job.executeJob();
    }

    // Configuração da fábrica em tempo de execução
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            job = new JobLinux();
        } else {
            job = new JobWindows();
        }
    }
}