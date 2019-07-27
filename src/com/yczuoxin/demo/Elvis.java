package com.yczuoxin.demo;
/**
 *  A: Hound Dog
 *  B: Heartbreak Hotel
 *  C: It varies
 *  D: None of the above
 */
public class Elvis {
    // Singleton pattern: there's only one Elvis
    public static final Elvis ELVIS = new Elvis();

    private Elvis() {
    }

    private static final Boolean LIVING = true;
    private final Boolean alive = LIVING;

    public final Boolean lives() {
        return alive;
    }

    public static void main(String[] args) {
        System.out.println(ELVIS.lives() ?
                "Hound Dog" : "Heartbreak Hotel");
    }
}