package com.savvas.pairing.movietickets;

public interface TransactionInterface {
    void startPurchase();
    void addTicket(int age, boolean isStudent);
    double finishPurchase();

}
