package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// In this program, we print only >= 20

public class FilterStreamPart2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(67);
        list.add(12);
        list.add(90);
        list.add(56);
        list.add(8);
        list.add(20);

        List<Integer> list1 = new ArrayList<>();

        for (Integer i : list){
            if (i >= 20){
                list1.add(i);
            }
        }

        System.out.println(list);
        System.out.println(list1);

        List<Integer> newList1 = list.stream().filter(i -> i >= 20).collect(Collectors.toList());
        System.out.println(newList1);
    }
}
