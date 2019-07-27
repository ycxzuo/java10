package com.yczuoxin.demo;

/**
 * (a) Animals are equal: true
 * (b) Animals are equal: false
 * (c) 编译错误
 * (d) 以上答案都不对
 */
public class AnimalFarm {

    public static void main(String[] args) {
        final String pig = "length: 10";
        final String dog = "length: " + pig.length();
        System.out.println("Animals are equal: " + pig == dog);
    }
}