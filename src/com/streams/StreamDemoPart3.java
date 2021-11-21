package com.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamDemoPart3 {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(7.0);
        list.add(18.0);
        list.add(10.0);
        list.add(24.0);
        list.add(17.0);
        list.add(5.0);

        double productOfSqrRoots = list.parallelStream().reduce(1.0, (a, b) -> a * Math.sqrt(b), (a, b) -> a * b);
        System.out.println("Product of square roots: " + productOfSqrRoots);
    }
}
