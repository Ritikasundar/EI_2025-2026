package src;

public class MobileAppUser implements Observer {

    private String userName;

    public MobileAppUser(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String artistName, String songName) {
        System.out.println("Mobile App User [" + userName + "] notified: " + artistName 
                           + " released a new song: " + songName);
    }
}
