package assignment3;

import java.util.ArrayList;
import java.util.List;

public class assignment3_1 {
    public static void main(String[] args) {
        //Write a program which can store List of Integer values and print all the values using for loop.
        List<Integer> l1=new ArrayList<Integer>();
        l1.add(2);
        l1.add(3);
        l1.add(45);
        l1.add(60);
        l1.add(70);
        for(int i=0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));
        }



    }
}
