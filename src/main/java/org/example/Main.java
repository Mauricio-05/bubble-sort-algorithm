package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>(List.of(1,3));

        List<Integer> list2 = new ArrayList<Integer>(List.of(2,1));

        List<Integer> mergedList = new ArrayList<>(list1);

        mergedList.addAll(list2);

        for (int i = 0; i < mergedList.size(); i++) {
            for (int j = 0; j < (mergedList.size() - i - 1); j++) {
                if(mergedList.get(j) > mergedList.get(j+1)) {
                    Integer temp = mergedList.get(j);
                    mergedList.set(j, mergedList.get(j + 1));
                    mergedList.set(j + 1, temp);
                }
            }

        }
        System.out.println(mergedList);
    }
}