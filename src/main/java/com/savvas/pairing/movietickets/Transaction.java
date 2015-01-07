package com.savvas.pairing.movietickets;

import java.util.ArrayList;
import java.util.List;

public class Transaction implements TransactionInterface{

    private List<Double> tickets = new ArrayList<Double>();
    private double ticketPrice;
    private int ticketCounter = 0;

    public void startPurchase(){
        tickets = new ArrayList<Double>();
    }
    public void addTicket(int age, boolean isStudent){

        if (age<13){
            ticketPrice = 5.50;
            ticketCounter++;
            tickets.add(ticketPrice);
        }
        else if(age>=65){
            ticketPrice = 6.00;
            ticketCounter++;
            tickets.add(ticketPrice);
        }
        else if(isStudent){
            ticketPrice = 8.00;
            ticketCounter++;
            tickets.add(ticketPrice);
        }
        else{
            ticketPrice = 11.00;
            ticketCounter++;
            tickets.add(ticketPrice);
        }
        if (ticketCounter >= 20){
            for(int i = 0; i < tickets.size(); i++){
                tickets.set(i, 6.00);
            }
//            ticketCounter++;
//            tickets.add(ticketPrice);
        }

    }
    public double finishPurchase(){
        double finalSum = 0;
        for(int i = 0; i < tickets.size(); i++){
            finalSum += tickets.get(i);
        }
        return finalSum;
    }
}
