package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamSpliterator {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Alpha");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Phi");
        myList.add("Omega");

        // Obtain a Stream to the array list.
        Stream<String> myStream = myList.stream();

        // Obtain a Spliterator
        Spliterator<String> spliterator = myStream.spliterator();

        // Iterate the elements of the stream.
//        while (spliterator.tryAdvance((n) -> System.out.println(n)));
        while (spliterator.tryAdvance(System.out :: println));
    }
}
