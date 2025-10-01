# Flyweight Pattern - Song Metadata Management

## Description
This module demonstrates the **Flyweight Design Pattern** using an Online Music Streaming App.
Millions of songs can share common **metadata (artist, album, duration)** to reduce memory usage.

## Classes
1. **Song.java** - Flyweight object representing a song (extrinsic state: title, intrinsic state: metadata).
2. **SongMetadata.java** - Intrinsic state shared among multiple songs.
3. **SongFactory.java** - Flyweight factory managing shared metadata objects.
4. **FlyweightDemo.java** - Client demonstrating usage and shared metadata.

## How to Run
1. Navigate to the flyweight folder
2. Compile:
javac -d bin src/*.java
3. Run:
java -cp bin src.FlyweightDemo