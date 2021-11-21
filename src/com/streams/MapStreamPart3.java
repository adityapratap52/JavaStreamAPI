package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapStreamPart3 {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(7.0);
        list.add(18.0);
        list.add(10.0);
        list.add(24.0);
        list.add(17.0);
        list.add(5.0);

        // Map the square root of the elements in list to a new stream.
//        Stream<Double> sqrtStream = list.stream().map((a) -> Math.sqrt(a));
                        //----------------OR----------------//
        Stream<Double> sqrtStream = list.stream().map(Math::sqrt);

        // Find the product of the square roots.
        double productOfSqRoots = sqrtStream.reduce(1.0, (a, b) -> a * b);

        System.out.println("Product of square roots is: " + productOfSqRoots);
    }
}
