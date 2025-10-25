package Oct25.interfacedemo.Example1;

public class YoutubeMusicPlayer implements AudioMediaPlayer{
    @Override
    public void play() {

        System.out.println("Music is being played..");
    }

    @Override
    public void pause() {

        System.out.println("Music paused");
    }

    @Override
    public void stop() {

        System.out.println("Music playing stopped");
    }

    @Override
    public void rewind() {
        System.out.println("Music rewind to -5 seconds");
    }

    @Override
    public void fastForward() {
        System.out.println("Music forwarded +5 seconds");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume increased by 1 unit");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume decreased by 1 unit");
    }
}
