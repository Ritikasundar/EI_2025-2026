package src;

public class RecommendationContext {

    private RecommendationStrategy strategy;

    public RecommendationContext(RecommendationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RecommendationStrategy strategy) {
        this.strategy = strategy;
    }

    public void recommendSongs(String userName) {
        strategy.recommend(userName);
    }
}
