package katas;

import java.util.ArrayList;
import java.util.List;

public class OddEven {
    public List<String> printOddEven(int firstNum, int lastNum) {
        List<String> numbers = new ArrayList<String>();
        for(int i = firstNum; i <= lastNum; i++) {
            if (i % 2 == 0) {
                numbers.add("Even");
            } else if (i % 2 != 0) {
                numbers.add("Odd");
            }
        }
        return numbers;
    }
}
