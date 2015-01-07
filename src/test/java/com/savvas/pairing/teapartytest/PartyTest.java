package com.savvas.pairing.teapartytest;

import com.savvas.pairing.teaparty.Party;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PartyTest {

    @Test
    public void welcomeReturnsStringWithAbbreviationMs(){
        //given
        Party party = new Party();
        String welcomeMessage = "Hello Ms. Johnson";
        //when
        String person = party.welcome("Johnson",true,false);
        //then
        assertEquals(welcomeMessage,person);
    }
    @Test
    public void welcomeReturnsStringWithAbbreviationSir(){
        //given
        Party party = new Party();
        String welcomeMessage = "Hello Sir Birdley";
        //when
        String person = party.welcome("Birdley",false,true);
        //then
        assertEquals(welcomeMessage, person);
    }
    @Test
    public void welcomeReturnsStringWithAbbreviationMr() {
        //given
        Party party = new Party();
        String welcomeMessage = "Hello Mr. Donovan";
        //when
        String person = party.welcome("Donovan", false, false);
        //then
        assertEquals(welcomeMessage, person);
    }
}