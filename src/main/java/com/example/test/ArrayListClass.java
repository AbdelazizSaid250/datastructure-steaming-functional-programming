package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                System.out.println(list.get(i));
            }
        }

        System.out.println("-----------------");
        for (Integer element : list) {
            System.out.println(element);
        }

        System.out.println("-----------------");

        /*Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(list);

        System.out.println("-----------------");*/

        // Method Reference
        list.forEach(ArrayListClass::printEvenNumber);

        System.out.println("-----------------");

        // Lambda Expression
        list.forEach(element -> {
            if (element % 2 == 0) {
                System.out.println(element);
            }
        });

        System.out.println("-----------------");

        TestInterface welcomeMessage1 = () -> {
            System.out.println("Welcome to the testInterface");
            System.out.println("Welcome1");
        };
        printWelcome(welcomeMessage1);
    }

    public static void printEvenNumber(Integer element) {
        if (element % 2 == 0) {
            System.out.println(element);
        }
    }

    public static void printWelcome(TestInterface testInterface) {
        testInterface.welcome();
    }
}
