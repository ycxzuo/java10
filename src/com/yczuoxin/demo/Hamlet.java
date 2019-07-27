package com.yczuoxin.demo;

import java.util.Random;

/**
 * (a) 3
 * (b) 1.0
 * (c) Throws exception
 * (d) None of the above
 */
public class Hamlet {
    public static void main(String[] args) {
        Random rnd = new Random();
        boolean toBe = rnd.nextBoolean();
        Number result = (toBe || !toBe) ?
                new Integer(3) : new Float(1);
        System.out.println(result);
    }
}