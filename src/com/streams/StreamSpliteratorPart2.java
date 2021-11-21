package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamSpliteratorPart2 {
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

        // Now, split the first iterator.
        Spliterator<String> splitItr = spliterator.trySplit();

        // If spliterator could be split, use splitItr first.
        if (splitItr != null) {
            System.out.println("Output from splitItr: ");
            splitItr.forEachRemaining((n) -> System.out.println(n));
        }

        // Now, use the spliterator
        System.out.println("\nOutput from spliterator: ");
        spliterator.forEachRemaining((n) -> System.out.println(n));
    }
}
