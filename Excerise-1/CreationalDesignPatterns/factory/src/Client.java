package src;

public class Client {
    private Subscription subscription;

    public Client(SubscriptionFactory factory) {
        subscription = factory.createSubscription();
    }

    public Subscription getSubscription() {
        return subscription;
    }
}
