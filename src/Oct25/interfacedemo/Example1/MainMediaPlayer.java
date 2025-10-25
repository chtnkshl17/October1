package Oct25.interfacedemo.Example1;

public class MainMediaPlayer {
    public static void main(String[] args) {
        // netflix
        System.out.println("Welcome to My Streaming Services");
        System.out.println("If you want to download, please select the service with payment option");

        Netflix netflix = new Netflix();
        System.out.println("Here are the features available for netflix");
        netflix.play();
        netflix.pause();
        netflix.videoSpeed();
        netflix.downloadFeature();
        netflix.liveStreaming();
        netflix.resolution();
        netflix.streamable();

        // Youtube Music

        System.out.println();
        System.out.println("Welcome to Youtube music");

        YoutubeMusicPlayer youtubeMusicPlayer = new YoutubeMusicPlayer();
        System.out.println("features available on youtube music are:");
        youtubeMusicPlayer.play();
        youtubeMusicPlayer.pause();
        youtubeMusicPlayer.stop();
        youtubeMusicPlayer.fastForward();
        youtubeMusicPlayer.rewind();


        // Amazon Prime Video

        System.out.println();
        System.out.println("Welcome to Prime Video");
        AmazonPrimeVideo amazonPrimeVideo = new AmazonPrimeVideo();
        System.out.println("Prime video have these features");
        amazonPrimeVideo.play();
        amazonPrimeVideo.pause();
        amazonPrimeVideo.stop();
        amazonPrimeVideo.videoSpeed();
        amazonPrimeVideo.resolution();
        amazonPrimeVideo.fastForward();
        amazonPrimeVideo.rewind();


        // Hotstar

        System.out.println();
        System.out.println("Welcome to hotstar");

        Hotstar hotstar = new Hotstar();
        System.out.println("Hotstar have following feature");
        hotstar.play();
        hotstar.pause();
        hotstar.stop();
        hotstar.resolution();
        hotstar.videoSpeed();


        // Spotify

        System.out.println();
        System.out.println("Spotify");

        Spotify spotify = new Spotify();

        spotify.play();
        spotify.pause();
        spotify.stop();
        spotify.rewind();
        spotify.fastForward();
        spotify.playAudioBooks();


        // Audible

        System.out.println();
        System.out.println("Audible");

        Audible audible = new Audible();

        audible.playAudioBooks();



    }
}
