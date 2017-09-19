package com.easy.kotlin;

/**
 * Created by jack on 2017/6/15.
 */
@org.junit.runner.RunWith(org.junit.runners.JUnit4.class)
public class TypeSystemDemo {
    @org.junit.Test
    public void testVoid() {
        Object str = "abc";
        if (str instanceof String) {
            int len = ((String)str).length();
            println(str + " is instanceof String");
            println("Length: " + len);

        } else {
            println(str + " is not instanceof String");
        }

        boolean is = "1" instanceof String;
        println(is);
    }

    void println(Object obj) {
        System.out.println(obj);
    }
}
