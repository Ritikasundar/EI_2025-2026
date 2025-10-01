package src;

public class ProxyPremiumFeature extends PremiumFeature {

    private RealPremiumFeature realFeature = null;
    private String featureName;
    private String userSubscriptionType;

    public ProxyPremiumFeature(String featureName, String userSubscriptionType) {
        this.featureName = featureName;
        this.userSubscriptionType = userSubscriptionType;
    }

    @Override
    public void accessFeature() {
        if (!userSubscriptionType.equalsIgnoreCase("premium") &&
            !userSubscriptionType.equalsIgnoreCase("family")) {
            System.out.println("Access Denied: " + featureName + " is available only for Premium/Family users.");
            return;
        }

        if (realFeature == null) {
            realFeature = new RealPremiumFeature(featureName);
        }
        realFeature.accessFeature();
    }
}
