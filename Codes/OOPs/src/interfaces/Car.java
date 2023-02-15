package interfaces;

public class Car implements Brake, Engine, Media{
//    All contain abstract methods so we need to implement them
    @Override
    public void start(){
        System.out.println("This function is used to start the engine of the car");
    }

    @Override
    public void stop() {
        System.out.println("This is a function used to shut down the car");
    }

    @Override
    public void rewind() {
        System.out.println("This is a function used to playback a song or video");
    }

    @Override
    public void repeat() {
        System.out.println("This is a function used to repeat media such as songs");
    }

    @Override
    public void accelerate(){
        System.out.println("HI,the car uses this function to accelerate");
    }

    @Override
    public void brake(){
        System.out.println("This function is used to push brakes and slow down/stop the car");
    }
}
