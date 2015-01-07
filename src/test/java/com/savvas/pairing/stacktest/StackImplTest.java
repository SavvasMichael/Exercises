package com.savvas.pairing.stacktest;

import com.savvas.pairing.stack.StackImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackImplTest {

    @Test
    public void pushReturnsElementAddedToTheStack(){
        //given
        StackImpl<Integer> integerStack = new StackImpl<Integer>();
        Integer expectedInteger = 50;
        //when
        Integer pushedElement = integerStack.push(expectedInteger);
        //then
        assertEquals(expectedInteger, pushedElement);
    }

    @Test
    public void popReturnsLastElementAdded(){
        //given
        StackImpl<Integer> integerStack = new StackImpl<Integer>();
        Integer expectedInteger = 50;
        integerStack.push(50);
        //when
        Integer poppedInteger = integerStack.pop();
        //then
        assertEquals(expectedInteger, poppedInteger);
    }

    @Test
    public void popRemovesReturnedElementFromStack(){
        //given
        StackImpl<Integer> integerStack = new StackImpl<Integer>();
        integerStack.push(25);
        //when
        integerStack.pop();
        //then
        int size = integerStack.size();
        assertEquals(0, size);
    }

    @Test
    public void sizeReturns0forEmptyStack(){
        //given
        StackImpl<String> stringStack = new StackImpl<String>();
        //when
        int stackSize = stringStack.size();
        //then
        assertEquals(0, stackSize);
    }

    @Test
    public void sizeReturnsNumberOfElementsInTheStack(){
        //given
        StackImpl<Integer> integerStack = new StackImpl<Integer>();
        integerStack.push(90);
        //when
        int stackSize = integerStack.size();
        //then
        assertEquals(1, stackSize);
    }
}