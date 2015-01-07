package com.savvas.pairing.circletest;

import com.savvas.pairing.circle.Circle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {


    @Test
    public void getAreaReturnsArea3Point14(){
        //given
        Circle circle = new Circle(1);
        double expected = 3.14;
        double delta = -1;
        //when
        double actual = circle.getArea();
        //then
        assertEquals(expected,actual,delta);
    }
    @Test
    public void getPerimeterReturnsPerimeter6Point28(){
        //given
        Circle circle = new Circle(1);
        double expected = 6.28;
        double delta = -1;
        //when
        double actual = circle.getPerimeter();
        //then
        assertEquals(expected,actual,delta);
    }
    @Test
    public void getAreaReturns345Point4(){
        //given
        Circle circle = new Circle(55);
        double expected = 345.40000000000003;
        double delta = -1;
        //when
        double actual = circle.getPerimeter();
        //then
        assertEquals(expected,actual,delta);
    }

}