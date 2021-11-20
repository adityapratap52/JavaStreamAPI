package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStreamPart3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Abhay");
        list.add("Manav");
        list.add("Tarun");
        list.add("Yansh");
        list.add("Aditya");
        list.add("Nikhil");
        list.add("Arun");
        System.out.println("List Values: " + list);
        List<String> list1 = new ArrayList<>();
        for (String value : list) {
            if (value.startsWith("A")) {
                list1.add(value);
            }
        }
        System.out.println(list1);

        //-------------OR---------------//
        List<String> myList = list.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(myList);
    }
}
