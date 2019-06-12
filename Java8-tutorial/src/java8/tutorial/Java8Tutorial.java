package java8.tutorial;

import java.util.Arrays;
import java.util.List;
public class Java8Tutorial {

    public static void main(String[] args) {
        
        // TODO code application logic here
        ReduceToSum newReduceToSum = new ReduceToSum();
        int[] array = {30, 10, 20, 40};
        newReduceToSum.sumArray(array);
        
        List<Integer> list = newReduceToSum.createLisNumberSquared(2);
        newReduceToSum.sumList(list);
        
        
        
    }
    
}
