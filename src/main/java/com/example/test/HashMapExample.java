package com.example.test;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Khaled");
        map.put(2, "Alaa");
        map.put(3, "Ibrahim");
        map.put(4, "Ragheb");
        map.put(5, "Mahmoud");

        System.out.println(map);
        System.out.println("Map.get(3): " + map.get(3)); // Ibrahim

        System.out.println("Map size: " + map.size());

        System.out.println("Is Map Empty: " + map.isEmpty());

        System.out.println("Is Map contains 5: " + map.containsKey(5));
        System.out.println("map.containsValue(\"Ragheb\") = " + map.containsValue("Ragheb"));

        System.out.println("map.values() = " + map.values());

        System.out.println("------------");
        map.values().forEach(element -> System.out.println(element));
        System.out.println("------------");

        List<String> list = map.values().stream().map(element -> {
            if (element.equals("Ragheb")) {
                return "Ragheb111111";
            }
            return element;
        }).toList();

        System.out.println("list = " + list);

        System.out.println("------------");

        for (Integer key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
        System.out.println("------------");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        System.out.println("------------");

        map.clear();
        System.out.println("Is Map Empty: " + map.isEmpty());
        System.out.println(map);




        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, new Student("Khaled", 25));
        studentMap.put(2, new Student("Ibrahim", 30));
        studentMap.put(3, new Student("Ragheb", 21));

        Map<Integer, List<Student>> hashMap = new HashMap<>();
        hashMap.put(1, new ArrayList<>(Arrays.asList(new Student("Khaled", 25), new Student("Ibrahim", 30), new Student("Ragheb", 21))));

        System.out.println(hashMap);

    }
}
