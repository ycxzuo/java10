package com.yczuoxin.demo;

import java.util.Calendar;

/**
 * (a) Elvis wears size 0 belt.
 * (b) Elvis wears size 73 belt.
 * (c) Elvis wears size -1930 belt.
 * (d) 以上答案都不对
 */
public class Elvis2 {
    public static final Elvis2 INSTANCE = new Elvis2();
    private final int beltSize;

    private static final int CURRENT_YEAR =
            Calendar.getInstance().get(Calendar.YEAR);

    private Elvis2() {
        beltSize = CURRENT_YEAR - 1930;
    }

    public int beltSize() {
        return beltSize;
    }

    public static void main(String[] args) {
        System.out.println("Elvis wears size " +
                INSTANCE.beltSize() + " belt.");
    }
}
