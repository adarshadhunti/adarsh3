package assignment4;

import java.util.ArrayList;
import java.util.List;

public class assignment4_4 {
    public static void main(String[] args) {
        //Create a list of values and print the second element, second last element.
        List<Integer> l1=new ArrayList<Integer>();
        l1.add(10);
        l1.add(45);
        l1.add(90);
        l1.add(45);
        l1.add(23);
        l1.add(90);
        l1.add(44);
        System.out.println(l1.get(1));
        System.out.println(l1.get(l1.size()-2));
    }
}
