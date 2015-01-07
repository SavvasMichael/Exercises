package com.savvas.pairing.reversertest;

import com.savvas.pairing.reverser.Reverser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverserTest {
    @Test
    public void reverseReturnsWordMobileReversed(){
        //given
        Reverser reverser = new Reverser();
        String expected = "eliboM";
        //when
        String word = reverser.reverse("Mobile");
        //then
        assertEquals(expected, word);
    }

}