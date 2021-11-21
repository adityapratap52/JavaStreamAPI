package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class NamePhoneEmail1 {
    String name;
    String phoneNum;
    String email;

    NamePhoneEmail1 (String n, String p, String e) {
        name = n;
        phoneNum = p;
        email = e;
    }
}

class NamePhone1 {
    String name;
    String phoneNum;

    NamePhone1 (String n, String p) {
        name = n;
        phoneNum = p;
    }
}

public class CollectorMethods {
    public static void main(String[] args) {
        // A list of name, phone numbers, and e-mail addresses.
        ArrayList<NamePhoneEmail1> myList = new ArrayList<>();

        myList.add(new NamePhoneEmail1("Larry", "555-5555", "Larry@Herabsl.com"));
        myList.add(new NamePhoneEmail1("Larry", "555-4444", "Picay@erabsl.com"));
        myList.add(new NamePhoneEmail1("Larry", "555-3333", "Rarry@rabsl.com"));

        // Map just the names and phone numbers to a new stream.
        Stream<NamePhone1> nameAndPhone = myList.stream().map((a) -> new NamePhone1(a.name, a.phoneNum));

        // Use collect to create a List of the names and phone numbers.
        List<NamePhone1> npList = nameAndPhone.collect(Collectors.toList());

        System.out.println("Names and phone numbers in a List: ");
        for (NamePhone1 e : npList) {
            System.out.println(e.name + " " + e.phoneNum);
        }

        // Obtain another mapping of the names and phone numbers.
        nameAndPhone = myList.stream().map((a) -> new NamePhone1(a.name, a.phoneNum));

        // Now, create a Set by use of collect().
        Set<NamePhone1> npSet = nameAndPhone.collect(Collectors.toSet());

        System.out.println("\nNames and phone numbers in a Set: ");
        for (NamePhone1 e : npSet) {
            System.out.println(e.name + " " + e.phoneNum);
        }
    }
}
