package assignment3;

import java.util.ArrayList;
import java.util.List;

public class assignment3_4 {
    public static void main(String[] args) {
        //Write a program which will print sum of all numbers which is stored in list.
        List<Integer> l1=new ArrayList<Integer>();
        l1.add(2);
        l1.add(3);
        l1.add(45);
        l1.add(60);
        l1.add(70);
        int j=0;
        for(int i=0;i<l1.size();i++)
        {
            j=j+l1.get(i);
        }
        System.out.println(j);
    }
}
