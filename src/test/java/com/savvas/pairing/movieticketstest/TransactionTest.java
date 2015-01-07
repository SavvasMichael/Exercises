package com.savvas.pairing.movieticketstest;

import com.savvas.pairing.movietickets.Transaction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransactionTest {
    @Test
    public void regularTicketCosts11Quid(){
        //given
        Transaction transaction = new Transaction();
        transaction.addTicket(25, false);
        //when
        double actual = transaction.finishPurchase();
        //then
        assertEquals(11.00, actual, 0);
    }
    @Test
    public void studentTicketCosts8Quid(){
        //given
        Transaction transaction = new Transaction();
        transaction.addTicket(18, true);
        //when
        double actual = transaction.finishPurchase();
        //then
        assertEquals(8.00, actual, 0);
    }
    @Test
    public void childTicketCosts550Quid(){
        //given
        Transaction transaction = new Transaction();
        transaction.addTicket(4, false);
        //when
        double actual = transaction.finishPurchase();
        //then
        assertEquals(5.50, actual, 0);
    }
    @Test
    public void elderlyTicketCosts6Quid(){
        //given
        Transaction transaction = new Transaction();
        transaction.addTicket(80, false);
        //when
        double actual = transaction.finishPurchase();
        //then
        assertEquals(6.00, actual, 0);
    }
    @Test
    public void groupTicketCosts6Quid(){
        //given
        Transaction transaction = new Transaction();
        for(int i = 0; i < 20; i++) {
            transaction.addTicket(25, false);
        }
        //when
        double actual = transaction.finishPurchase();
        //then
        assertEquals(120.00, actual, 0);
    }
    @Test
    public void finishPurchaseReturnsChildAndElderlyTicketsPricesSummed(){
        //given
        Transaction transaction = new Transaction();
        transaction.addTicket(12,true);
        transaction.addTicket(80,false);
        //then
        double actual = transaction.finishPurchase();
        //when
        assertEquals(11.50, actual,0);
    }
}