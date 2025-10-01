package src;

public class FactoryDemo {

    public static void main(String[] args) {

        SubscriptionFactory freeFactory = new FreeSubscriptionFactory();
        Client freeClient = new Client(freeFactory);
        freeClient.getSubscription().getSubscriptionDetails();

        SubscriptionFactory premiumFactory = new PremiumSubscriptionFactory();
        Client premiumClient = new Client(premiumFactory);
        premiumClient.getSubscription().getSubscriptionDetails();

        SubscriptionFactory familyFactory = new FamilySubscriptionFactory();
        Client familyClient = new Client(familyFactory);
        familyClient.getSubscription().getSubscriptionDetails();
    }
}
