package com.yczuoxin.demo;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * (a) 运行期异常
 * (b) true
 * (c) 程序编译错误
 * (d) 以上都不是
 */
public class Reflector {
    public static void main(String[] args) throws Exception {
        Set s = new HashSet();
        s.add("foo");
        Iterator i = s.iterator();
        Method m = i.getClass().getMethod("hasNext", new Class[0]);
        System.out.println(m.invoke(i, new Object[0]));
    }
}
