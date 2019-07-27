package com.yczuoxin.demo;

/**
 * (a) true
 * (b) false
 * (c) 编译错误
 * (d) 以上答案都不对
 */
public class Lazy {

    private static boolean initialized = false;

    static {
        Thread t = new Thread(() -> initialized = true);
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new AssertionError(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(initialized);
    }
}