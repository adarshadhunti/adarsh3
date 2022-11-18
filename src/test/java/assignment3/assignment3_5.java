package assignment3;

import java.util.ArrayList;
import java.util.List;

public class assignment3_5 {
    public static void main(String[] args) {
        //Write a program which will pick the values from Array and Store them List.
          Integer[] int1 = { 1,2,4 };
        List<Integer> l1=new ArrayList<Integer>();
        for (int i=0;i< int1.length;i++)
        {
            l1.add(int1[i]);
        }
        System.out.println(l1);
    }
}
