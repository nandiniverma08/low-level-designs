package Adapter;

//Problem: Do incompatible interfaces ko work together karwana.
// Solution: Beech mein Adapter class banao.
//Adapter: Client ke expected interface ko implement karta hai aur actual request ko existing class
// tak forward karta hai.
//Real use cases: Legacy systems, third-party APIs, payment SDK integrations.

public interface Payment {

    void pay(double amount);
}
