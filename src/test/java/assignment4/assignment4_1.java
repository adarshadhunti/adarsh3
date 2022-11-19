package assignment4;

import java.util.ArrayList;
import java.util.List;

public class assignment4_1 {
    public static void main(String[] args) {

        List<String> l1=new ArrayList<String>();
        l1.add("Java");
        l1.add("Selenium");
        l1.add("TestNG");
        l1.add("Git");
        l1.add("Github");
        for(int i=l1.size()-1;i>=0;i--)
        {
            System.out.println(l1.get(i));
        }
    }
}
