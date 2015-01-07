package com.savvas.pairing.fizzbuzztest;

import com.savvas.pairing.fizzbuzz.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void answerReturns1AsString(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.answer(1);
        //then
        assertEquals("1", actual);
    }
    @Test
    public void answerReturnsFizz(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.answer(3);
        //then
        assertEquals("fizz", actual);
    }
    @Test
    public void answerReturnsBuzz(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.answer(5);
        //then
        assertEquals("buzz", actual);
    }
    @Test
    public void answerReturnsFizzBuzz(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String actual = fizzBuzz.answer(15);
        //then
        assertEquals("fizzbuzz", actual);
    }

}