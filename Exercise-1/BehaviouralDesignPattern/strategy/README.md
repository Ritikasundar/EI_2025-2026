# Strategy Pattern - Music Recommendation Strategies

## Description
This module demonstrates the **Strategy Design Pattern** using an Online Music Streaming App example.
Different recommendation strategies can be applied dynamically: By Genre, By Artist, and By Popularity.

## Classes
1. **RecommendationStrategy.java** - Strategy interface for recommendations.
2. **ByGenreStrategy.java** - Concrete strategy recommending songs by genre.
3. **ByArtistStrategy.java** - Concrete strategy recommending songs by favorite artists.
4. **ByPopularityStrategy.java** - Concrete strategy recommending popular songs.
5. **RecommendationContext.java** - Context class holding the current strategy.
6. **StrategyDemo.java** - Demo to change and apply strategies.

## How to Run
1. Navigate to the strategy folder:
2. Compile:
javac -d bin src/*.java
3. Run:
java -cp bin src.StrategyDemo

