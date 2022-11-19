package assignment4;

import java.util.*;

public class assignment4_5 {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i = 0; i< 10; i++){
            List<Integer> integers = new ArrayList<Integer>();
            for(int j=0; j<5; j++){
                Random random = new Random();
                integers.add(random.nextInt());
            }
            list.add(integers);
        }
        int[][] array = new int[list.size()][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[list.get(i).size()];
        }
        for(int i=0; i<list.size(); i++){
            for (int j = 0; j < list.get(i).size(); j++) {
                array[i][j] = list.get(i).get(j);
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}

