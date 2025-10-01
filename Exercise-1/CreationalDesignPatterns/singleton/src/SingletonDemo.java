package src;

/**
 * Demo class to test Singleton
 */
public class SingletonDemo {

    public static void main(String[] args) {

        // Get the single instance of MusicPlayer
        MusicPlayerSingleton player1 = MusicPlayerSingleton.getInstance();
        MusicPlayerSingleton player2 = MusicPlayerSingleton.getInstance();

        // Demonstrate that both references point to the same instance
        player1.playSong("Life goes on");
        System.out.println("Player2 current song: " + player2.getCurrentSong());

        // Stop the song using second reference
        player2.stopSong();
        System.out.println("Player1 current song: " + player1.getCurrentSong());
    }
}
