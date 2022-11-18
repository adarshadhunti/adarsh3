package assignment3;

import java.util.ArrayList;
import java.util.List;

public class assignment3_7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        // Adding custom element to LinkedList
        // using add() method
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Storing it inside array of strings
        Integer[] arr = new Integer[list.size()];

        // Converting ArrayList to Array
        // using get() method
        for (int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);

        // Printing elements of array on console
        for (Integer x : arr) {
            System.out.print(x + " ");
        }
    }
}
