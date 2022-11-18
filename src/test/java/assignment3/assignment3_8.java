package assignment3;

import java.util.ArrayList;
import java.util.List;

public class assignment3_8 {

    public static void main(String[] args) {
        //Write a program which will display true if list contains Mobile else prints false
        //	List  - Web Automation, API Automation, Mobile Automation.
        //	Output – True

        List<String> l1=new ArrayList<String>();
        l1.add("Web Automation");
        l1.add("API Automation");
        l1.add("Mobile Automation");
        Boolean b1=false;
        for(int i=0;i<l1.size();i++)
        {
            if(l1.get(i).contains("Mobile"))
            {
                b1=true;
            }

        }
        if(b1)
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
