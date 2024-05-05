package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streaming {
    public static void main(String[] args) {

        // Using Normal Functions
        List<Integer> list = new ArrayList<>(Arrays.asList( 2, 1, 3, 5, 4, 3, 1));
        List<Integer> list1 = removeDuplicates(list);
        List<Integer> list2 = sortList(list1);
        List<Integer> list3 = findValuesGreaterThanTwo(list2);
        System.out.println(list3);

        System.out.println("-------------");

        // Using Streaming
        list.stream()
                .filter(element -> element >= 2)
                .distinct()
                .sorted()
                .limit(3)
                .forEach(System.out::println);
    }

    public static List<Integer> removeDuplicates(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!result.contains(list.get(i))) {
                result.add(list.get(i));
            }
        }
        return result;
    }

    public static List<Integer> sortList(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        // Do Sorting Algorithm

        return new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    }

    public static List<Integer> findValuesGreaterThanTwo(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        // Do Sorting Algorithm

        return new ArrayList<>(Arrays.asList(3, 4, 5));
    }
}
