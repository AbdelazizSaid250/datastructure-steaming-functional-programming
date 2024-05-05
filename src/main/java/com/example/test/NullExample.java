package com.example.test;

public class NullExample {

    static String value = null;

    public static void main(String[] args) {
        String str = null;

        // Bad approach. You can use Optional
        if (str != null) {
            // do whatever you need
        }

        if (value != null) {
            // do whatever you need
        }
    }
}
