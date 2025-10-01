# Proxy Pattern - Control Access to Premium Features

## Description
This module demonstrates the **Proxy Design Pattern** in an Online Music Streaming App.
The **ProxyPremiumFeature** controls access to premium features like offline downloads and high-quality streaming based on the user's subscription type.

## Classes
1. **PremiumFeature.java** - Abstract Subject for premium features.
2. **RealPremiumFeature.java** - Real implementation of premium features.
3. **ProxyPremiumFeature.java** - Proxy controlling access based on subscription.
4. **ProxyDemo.java** - Client demonstrating the pattern.

## How to Run
1. Navigate to the proxy folder
2. Compile:
javac -d bin src/*.java
3. Run:
java -cp bin src.ProxyDemo
