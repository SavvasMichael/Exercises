package katas;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class OddEvenTest {

    @Test
    public void printOddEvenReturnsEven(){
        //given
        OddEven oddEven = new OddEven();
        //when
        List<String> actual = oddEven.printOddEven(10,10);
        //then
        assertEquals("Even", actual.get(0));
        assertEquals(1, actual.size());
    }

    @Test
    public void printOddEvenReturnsOdd(){
        //given
        OddEven oddEven = new OddEven();
        //when
        List<String> actual = oddEven.printOddEven(9,9);
        //then
        assertEquals(1, actual.size());
        assertEquals("Odd", actual.get(0));

    }

    @Test
    public void printOddEvenReturnsListOf2ElementsOddEven(){
        //given
        OddEven oddEven = new OddEven();
        //when
        List<String> actual = oddEven.printOddEven(9,10);
        //then
        assertEquals(2, actual.size());
        assertEquals("Odd", actual.get(0));
        assertEquals("Even", actual.get(1));
    }
}