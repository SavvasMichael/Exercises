package com.savvas.pairing.countdowntest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountdownTest {

    @Test
    public void countdownReturnsAnArrayWith1Element(){
        //given
        Countdown countdown = new Countdown();
        //when
        int[] actual = countdown.countdown(1);
        //then
        assertEquals(1, actual.length);
    }
    @Test
    public void countdownReturnsAnArrayWith2Elements(){
        //given
        Countdown countdown = new Countdown();
        //when
        int[] actual = countdown.countdown(2);
        //then
        assertEquals(2,actual.length);
    }
    @Test
    public void countDownReturns3210(){
        //given
        Countdown countdown = new Countdown();
        //when
        int[] countdownNums = countdown.countdown(3);
        //then
        assertEquals(3,countdownNums[0]);
        assertEquals(2,countdownNums[1]);
        assertEquals(1,countdownNums[2]);
        assertEquals(0,countdownNums[3]);
    }


}