package com.example.test;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add(null);
        set.add("3");
        set.add("4");
        set.add("4");

        System.out.println(set);

        System.out.println("--------");
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add("1");
        list.add("1");

        System.out.println(list);


        // Remove the duplication for the following list
        List<Integer> arrayList = new ArrayList<>(Arrays.asList( 2, 1, 3, 5, 4, 3, 1));
        Set<Integer> set1 = new HashSet<>(arrayList);

        System.out.println(set1);
    }
}
