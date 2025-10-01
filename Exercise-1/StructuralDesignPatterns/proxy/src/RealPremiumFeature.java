package src;

public class RealPremiumFeature extends PremiumFeature {

    private String featureName;

    public RealPremiumFeature(String featureName) {
        this.featureName = featureName;
        loadFeature();
    }

    private void loadFeature() {
        System.out.println("Loading premium feature: " + featureName);
    }

    @Override
    public void accessFeature() {
        System.out.println("Accessing premium feature: " + featureName);
    }
}
