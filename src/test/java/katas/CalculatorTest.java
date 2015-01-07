package katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void addReturnsZero(){
        //given
        Calculator calculator = new Calculator();
        //when
        int actual = calculator.add("");
        //then
        assertEquals(0, actual);
    }
    @Test
    public void addReturnsOneInt(){
        //given
        Calculator calculator = new Calculator();
        //when
        int actual = calculator.add("1");
        //then
        assertEquals(1, actual);
    }
    @Test
    public void addReturnsSumOfTwoInts(){
        //given
        Calculator calculator = new Calculator();
        //when
        int actual = calculator.add("1,2");
        //then
        assertEquals(3,actual);
    }


}