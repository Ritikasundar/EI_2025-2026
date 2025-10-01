# Observer Pattern - Music App Notifications

## Description
This module demonstrates the **Observer Design Pattern** using an Online Music Streaming App example.
Users (observers) are notified when a favorite artist releases a new song or album.

## Classes
1. **Observer.java** - Observer interface.
2. **Subject.java** - Subject interface.
3. **MusicArtist.java** - ConcreteSubject representing an artist releasing songs.
4. **MobileAppUser.java** - ConcreteObserver receiving notifications via mobile app.
5. **EmailUser.java** - ConcreteObserver receiving notifications via email.
6. **ObserverDemo.java** - Demo to show observer notifications.

## How to Run
1. Navigate to the observer folder
2. Compile:
javac -d bin src/*.java
3. Run:
java -cp bin src.ObserverDemo

