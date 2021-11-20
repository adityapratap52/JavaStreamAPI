package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Increase value -> +100
public class MapStreamPart2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(36);
        list.add(4);
        list.add(81);
        list.add(25);
        list.add(64);
        list.add(400);
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        for (Integer value : list) {
            System.out.println(value+100);
        }
        System.out.println(list1);

        // You can use map method, if you want to return value
        Stream<Integer> stream = list.stream();
        List<Integer> myList = stream.map(x -> x + 100).collect(Collectors.toList());
        System.out.println(myList);

        //-----------OR-----------//
        List<Integer> myList1 = list.stream().map(x -> x + 100).collect(Collectors.toList());
        System.out.println(myList1);
    }
}
