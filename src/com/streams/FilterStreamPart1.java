package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// In this program, we will print only even number

public class FilterStreamPart1 {
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
            if (i % 2 == 0){
                list1.add(i);
            }
        }

        System.out.println(list);
        System.out.println(list1);

        // You can use stream API in this condition
        Stream<Integer> stream = list.stream();
        List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);

        //-----------OR------------//
        List<Integer> newList1 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList1);
    }
}
