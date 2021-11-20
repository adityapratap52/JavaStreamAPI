package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapStreamPart1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(9);
        list.add(5);
        list.add(8);
        list.add(20);
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        for (Integer value : list) {
            list1.add(value * value);
        }
        System.out.println(list1);

        // You can use map method, if you want to return value
        Stream<Integer> stream = list.stream();
        List<Integer> myList = stream.map(x -> x * x).collect(Collectors.toList());
        System.out.println(myList);

        //-----------OR-----------//
        List<Integer> myList1 = list.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(myList1);
    }
}
