package assignment4;

import java.util.ArrayList;
import java.util.List;

public class assignment4_2 {
    public static void main(String[] args) {
//Write a program which will accept List of String and produce another List of string of which will have only values which starts with git
//Input – Git, Github, GitLab,GitBash, Selenium, Java, Maven
//Output- Git, Github, Gitlab, GitBash
        List<String> l1=new ArrayList<String>();
        l1.add("Git");
        l1.add("Github");
        l1.add("GitLab");
        l1.add("GitBash");
        l1.add("Selenium");
        l1.add("Java");
        l1.add("Maven");
        List<String> l2=new ArrayList<String>();
        for(int i=0;i<l1.size();i++)
        {
            if(l1.get(i).startsWith("Git"))
            {
                l2.add(l1.get(i));
            }
        }
        System.out.println(l2);
    }
}
