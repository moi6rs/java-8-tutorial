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
public class ReduceToSum {
    private Integer numberLentgh;
    
    public void sumArray(int[] array){
        int sum = Arrays.stream(array).reduce(0, (x,y) -> x + y);
        System.out.println("Sum of Array: "+ sum);
    }
    
    public void sumList(List<Integer> list){
        int sum = list.stream().reduce(0, (x,y) -> x + y);
        System.out.println("Sum List: "+ sum);
    }
            
}
