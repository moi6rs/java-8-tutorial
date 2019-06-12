package java8.tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceToSum {

    private Integer numberLentgh;

    public void sumArray(int[] array) {
        int sum = Arrays.stream(array).reduce(0, (x, y) -> x + y);
        System.out.println("Sum of Array: " + sum);
    }

    public void sumList(List<Integer> list) {
        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum List: " + sum);
    }

    public List<Integer> createLisNumberSquared(int numberLength) {
        List<Integer> newListNumber = new ArrayList<Integer>();
        for (int i = 1; i <= numberLength; i++) {
            double num = Math.pow(i, 2);
            newListNumber.add((int) num);
        }
        return newListNumber;
    }
}
