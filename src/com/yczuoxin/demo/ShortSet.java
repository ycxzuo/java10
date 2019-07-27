package com.yczuoxin.demo;

import java.util.HashSet;
import java.util.Set;

/**
 *  A: 1
 *  B: 100
 *  C: Throws exception
 *  D: None of the above
 */
public class ShortSet {
    public static void main(String args[]) {
        Set<Short> s = new HashSet<Short>();
        for (short i = 0; i < 100; i++) {
            s.add(i);
            s.remove(i - 1);
        }
        System.out.println(s.size());
    }
}