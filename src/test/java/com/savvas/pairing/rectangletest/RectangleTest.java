package com.savvas.pairing.rectangletest;

import com.savvas.pairing.rectangle.Rectangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void getPerimeterReturnsPerimeter4(){
        //given
        Rectangle rectangle = new Rectangle(1,1);
        double delta = -1;
        //when
        double actual = rectangle.getPerimeter();
        //then
        assertEquals(4, actual, delta);
    }
    @Test
    public void getAreaReturnsArea2(){
        //given
        Rectangle rectangle = new Rectangle(1,2);
        double delta = -1;
        //when
        double actual = rectangle.getArea();
        //then
        assertEquals(2,actual,delta);
    }
    @Test
    public void getAreaReturnsArea100(){
        //given
        Rectangle rectangle = new Rectangle(10,10);
        double delta = -1;
        //when
        double actual = rectangle.getArea();
        //then
        assertEquals(100, actual, delta);
    }
    @Test
    public void getPerimeterReturnsPerimeter200(){
        //given
        Rectangle rectangle = new Rectangle(50,50);
        double delta = -1;
        //when
        double actual = rectangle.getPerimeter();
        //then
        assertEquals(200,actual,delta);
    }

}