// https://refactoring.guru/pt-br/design-patterns/factory-method


public abstract class Job{
    // Factory Method - abstrato, será implementado nas subclasses
    public abstract Step createStep();

    // Método que usa o botão criado
    public void executeJob() {
        // Chama o Factory Method para criar um botão
        Step step = createStep();
        step.execute();
        step.cancel();
    }
}