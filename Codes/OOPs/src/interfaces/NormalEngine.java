package interfaces;

public class NormalEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Starting the Normal engine now");
    }

    @Override
    public void stop() {
        System.out.println("Turning down/Stopping the normal engine now");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating now");
    }

}
