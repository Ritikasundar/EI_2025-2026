package src;

import java.util.ArrayList;
import java.util.List;

public class MusicArtist implements Subject {

    private String name;
    private List<Observer> followers = new ArrayList<>();

    public MusicArtist(String name) {
        this.name = name;
    }

    @Override
    public void addObserver(Observer observer) {
        followers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        followers.remove(observer);
    }

    @Override
    public void notifyObservers(String songName) {
        for (Observer observer : followers) {
            observer.update(name, songName);
        }
    }

    // New song release
    public void releaseSong(String songName) {
        System.out.println("\n" + name + " released a new song: " + songName);
        notifyObservers(songName);
    }
}
