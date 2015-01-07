package katas;

public class Calculator {

    public int add(String numbers){
        String[] numbersArr = numbers.split(",");
        if(numbers.isEmpty()){
            return 0;
        }
        else if(numbers.length() == 1) {
            return Integer.parseInt(numbers);
        }
        else if(numbers.length() > 1){
            return Integer.parseInt(numbersArr[0] +
                   Integer.parseInt(numbersArr[1]));
        }
        return 0;
    }
}
