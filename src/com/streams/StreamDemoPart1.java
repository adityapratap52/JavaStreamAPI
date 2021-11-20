package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemoPart1 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        myList.add(5);

        System.out.println("Original list: " + myList);

        // obtain the Stream to the array list.
        Stream<Integer> myStream = myList.stream();

        // Obtain the minimum and maximum value by use of min(),
        // max(), isPresent(), and get().
        Optional<Integer> minVal = myStream.min(Integer :: compare);

//        System.out.println("Value is: " + minVal);

        // isPresent true -> if one or more values present in list
        // if value is not present then false
//        System.out.println(minVal.isPresent());

        if (minVal.isPresent()) System.out.println("Minimum Value: " + minVal.get());

        // Must obtain a new stream because previous call to min()
        // is a terminal operation that consumed the stream.
        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer :: compare);

//        if (maxVal.isPresent()) System.out.println("Maximum Value: " + maxVal.get());
        // you can use lambda expression instead of if()
        maxVal.ifPresent(integer -> System.out.println("Maximum Value: " + integer));

        // Sort the stream by use of sorted().
        Stream<Integer> sortedStream = myList.stream().sorted();
        System.out.println("Sorted stream: ");
        sortedStream.forEach((n) -> System.out.print(n + " "));
        System.out.println();
    }
}
