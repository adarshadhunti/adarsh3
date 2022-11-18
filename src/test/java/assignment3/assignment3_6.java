package assignment3;

import java.util.ArrayList;
import java.util.List;

public class assignment3_6 {
    public static void main(String[] args) {

        //Create a list of numbers 33,44,55,66,77,88 and perform below operation
        //	Remove second element from list using index
        //	Remove second element from list using value
        //	Add 90 at index 3
        //	Get the length of list
        //	Print all values from list using any values
        //	Convert List into array.


//Create a list of numbers 33,44,55,66,77,88 and perform below operation
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(33);
        l1.add(44);
        l1.add(55);
        l1.add(66);
        l1.add(88);


//	Remove second element from list using index
        l1.remove(2);
        //Remove second element from list using value
        while (l1.contains(55)) {
            l1.remove(55);
        }
//Add 90 at index 3
        l1.add(90, 3);

        //Get the length of list
        System.out.println(l1.size());

//Print all values from list using any values

        for(int i=0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));
        }


    }
}