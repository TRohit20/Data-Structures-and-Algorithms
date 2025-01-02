package interfaces;

public class CustomCar {
    private Engine engine;
    private Media musicPlayer = new MusicPlayer();

    CustomCar(){
        engine = new NormalEngine();
    }

    CustomCar(Engine engine){
        this.engine = engine;
    }

    public void startCar(){
        engine.start();
    }

    public void stopCar(){
        engine.stop();
    }

    public void startMusic(){
        musicPlayer.start();
    }
    public void stopMusic(){
        musicPlayer.stop();
    }

    public void upgradeEngine(){
        engine = new ElectricEngine();
        System.out.println("Upgraded the engine to Electric now");
    }
}
