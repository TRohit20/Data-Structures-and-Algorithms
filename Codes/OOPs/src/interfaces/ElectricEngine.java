package interfaces;

public class ElectricEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Starting the Electric engine now");
    }

    @Override
    public void stop() {
        System.out.println("Turning down/Stopping the electric engine now");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating the electric engine now");
    }
}
