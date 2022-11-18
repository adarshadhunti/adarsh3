package assignment3;

import java.util.ArrayList;
import java.util.List;

public class assignment3_2 {
    //Write a program which can store List of Integer values and print all the values using for for loop.
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<Integer>();
        l1.add(2);
        l1.add(3);
        l1.add(45);
        l1.add(60);
        l1.add(70);
        for(int s: l1)
        {
            System.out.println(s);
        }
    }
}
