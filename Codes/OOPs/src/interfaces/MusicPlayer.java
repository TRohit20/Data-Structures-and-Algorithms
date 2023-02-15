package interfaces;

public class MusicPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Starting to play music now");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the music now");
    }

    @Override
    public void rewind() {
        System.out.println("Playing back the current song now");
    }

    @Override
    public void repeat() {
        System.out.println("Playing this song on loop");
    }
}
