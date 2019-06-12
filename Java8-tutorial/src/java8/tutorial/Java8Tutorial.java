/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8.tutorial;

/**
 *
 * @author ramseg
 */
import java.util.Arrays;
import java.util.List;
public class Java8Tutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        ReduceToSum newReduceToSum = new ReduceToSum();
        int[] array = {30, 10, 20, 40};
        newReduceToSum.sumArray(array);
        
        List<Integer> list = Arrays.asList(30, 10, 20, 40);
        newReduceToSum.sumList(list);
    }
    
}
