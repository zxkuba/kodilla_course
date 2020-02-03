package collection;

import java.util.ArrayList;

/**
 * Ta poniższa logika chyba nie ma sensu.
 */

public class OddNumbersExterminator {

    public ArrayList<ArrayList<Integer>> exterminate(ArrayList<Integer> numbers) {
        ArrayList<ArrayList<Integer>> even = new ArrayList<>();
        int temp = 0;
        for(int n=0; n<numbers.size(); n++){
            temp = numbers.get(n);
            if(temp % 2 == 0){
                even.add(numbers);
            }
        }
           return even;
    }
}
