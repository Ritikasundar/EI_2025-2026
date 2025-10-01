package src;

/**
 * Singleton class for Music Player
 */
public class MusicPlayerSingleton {

    // Static variable holds only one instance
    private static MusicPlayerSingleton instance;

    // Example attribute
    private String currentSong;

    // Private constructor to prevent instantiation
    private MusicPlayerSingleton() {
        currentSong = "No song playing";
    }

    // Public method to provide global access
    public static synchronized MusicPlayerSingleton getInstance() {
        if (instance == null) {
            instance = new MusicPlayerSingleton();
        }
        return instance;
    }

    // Getter and Setter
    public String getCurrentSong() {
        return currentSong;
    }

    public void playSong(String song) {
        this.currentSong = song;
        System.out.println("Playing song: " + song);
    }

    public void stopSong() {
        System.out.println("Stopping song: " + currentSong);
        this.currentSong = "No song playing";
    }
}
