# Exercise 1: Design Patterns Implementation

To demonstrate the patterns, I decided to choose a real-world system and try to implement it. I picked a music streaming application because it naturally involves multiple components like users, subscriptions, songs, and recommendations — providing a realistic scenario for applying design patterns.

- **Creational Patterns:**  
  - *Singleton* ensures only one Music Player instance exists throughout the app.  
  - *Factory* allows dynamic creation of subscription plans (Free, Premium, Family) without hard-coded logic, following SOLID principles.  

- **Behavioural Patterns:**  
  - *Observer* notifies users when new songs or albums from their favorite artists are released.  
  - *Strategy* provides different recommendation strategies (by genre, artist, or popularity), allowing dynamic switching of algorithms.  

- **Structural Patterns:**  
  - *Proxy* controls access to premium features based on subscription type.  
  - *Flyweight* efficiently manages millions of songs' metadata by sharing common data, reducing memory usage.  


