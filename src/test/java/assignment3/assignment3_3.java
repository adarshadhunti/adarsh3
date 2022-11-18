package assignment3;

import java.util.ArrayList;
import java.util.Iterator;

public class assignment3_3 {
    public static void main(String[] args) {
        //Write a program which can store List of Integer values and print all the values using for iterator
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(2);
        list.add(18);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(80);
        list.add(90);
        list.add(130);

        // Displaying the list
        System.out.println("The list is: \n"
                + list);

        // Create an iterator for the list
        // using iterator() method
        Iterator<Integer> iter = list.iterator();

        // Displaying the values after iterating
        // through the list
        System.out.println("\nThe iterator values"
                + " of list are: ");
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}