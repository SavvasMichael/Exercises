package com.savvas.pairing.fizzbuzz;

public class FizzBuzz implements FizzBuzzInterface {

    public String answer(int number){
        String numberString = "";
        if(number % 3 != 0 && number % 5 != 0){
            numberString = String.valueOf(number);
            return numberString;
        }
        else if(number % 3 == 0 && number % 5 == 0){
            return "fizzbuzz";
        }
        else if(number % 3 == 0){
            return "fizz";
        }
        else if(number % 5 == 0){
            return "buzz";
        }
        else
        return "";
    }
}
