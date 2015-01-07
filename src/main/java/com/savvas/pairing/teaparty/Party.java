package com.savvas.pairing.teaparty;

public class Party implements TeaParty {

    public String welcome(String lastName, boolean isWoman, boolean isSir){
        if(isWoman){
            return "Hello Ms. " + lastName;
        }
        else if(isSir){
            return "Hello Sir " + lastName;
        }
        else{
            return "Hello Mr. " + lastName;
        }
    }
}
