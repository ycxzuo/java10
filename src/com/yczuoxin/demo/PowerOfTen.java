package com.yczuoxin.demo;

/**
 * (a) one ten hundred
 * (b) one ten 100
 * (c) 编译错误
 * (d) 以上都不是
 */
public enum PowerOfTen {
    ONE(1), TEN(10),
    HUNDRED(100) {
        @Override
        public String toString() {
            return Integer.toString(super.val);
        }
    };
    private final int val;

    PowerOfTen(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(ONE + " " + TEN + " " + HUNDRED);
    }
}