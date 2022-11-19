package assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class assignment4_3 {
    public static void main(String[] args) {
//Write a program that will remove duplicate values from List
//Input – Java, TestNG, Maven, Java,
//Output – Java, TestNG, Maven
        ArrayList<String> numbers = new ArrayList<String>(Arrays.asList("Java","TestNG","Maven","Java"));
        System.out.println("ArrayList with duplicate elements: " + numbers);
        Set<String> set = new LinkedHashSet<String>();
        set.addAll(numbers);
        numbers.clear();
        numbers.addAll(set);
        System.out.println("ArrayList without duplicate elements: " + numbers);
    }
}
