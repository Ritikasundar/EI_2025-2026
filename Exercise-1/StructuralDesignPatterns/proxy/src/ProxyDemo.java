package src;

public class ProxyDemo {

    public static void main(String[] args) {

        // Free user tries to access offline download
        PremiumFeature freeUserFeature = new ProxyPremiumFeature("Offline Download", "free");
        freeUserFeature.accessFeature(); // Output: Access Denied

        // Premium user accesses offline download
        PremiumFeature premiumFeature = new ProxyPremiumFeature("Offline Download", "premium");
        premiumFeature.accessFeature(); // Output: Loading + Accessing

        // Family user accesses high-quality streaming
        PremiumFeature familyFeature = new ProxyPremiumFeature("High-Quality Streaming", "family");
        familyFeature.accessFeature(); // Output: Loading + Accessing
    }
}
