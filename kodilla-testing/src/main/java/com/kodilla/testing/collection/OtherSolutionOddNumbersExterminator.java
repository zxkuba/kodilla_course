package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OtherSolutionOddNumbersExterminator {

    public List<Integer> exterminate2(List<Integer> numbers){
        List<Integer> result = new ArrayList<>();
        for(int n=0; n<numbers.size(); n++){
            int temp = numbers.get(n);
            if(temp % 2 == 0){
                result.add(temp);
            }
        }
        return result;
    }
}
