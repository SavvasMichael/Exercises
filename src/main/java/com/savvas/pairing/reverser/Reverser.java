package com.savvas.pairing.reverser;

public class Reverser implements Reverse {
    public String reverse(String word){
        String reversedWord = "";
        for (int i = word.length()-1; i >= 0; i--){
            reversedWord += word.charAt(i);
        }
        return reversedWord;
    }
}
