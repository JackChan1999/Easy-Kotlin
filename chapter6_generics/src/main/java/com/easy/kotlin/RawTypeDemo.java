package com.easy.kotlin;

import java.util.Arrays;

/**
 * Created by jack on 2017/6/30.
 */
public class RawTypeDemo {

    public static void main(String[] args) {
        RawArrayList rawArrayList = new RawArrayList(4);
        rawArrayList.add(0, "a");
        rawArrayList.add(1, "b");
        System.out.println(rawArrayList);

        String a = (String)rawArrayList.get(0);
        System.out.println(a);

        String b = (String)rawArrayList.get(1);
        System.out.println(b);

        rawArrayList.add(2, 200);
        rawArrayList.add(3, 300);
        System.out.println(rawArrayList);

        int c = (int)rawArrayList.get(2);
        int d = (int)rawArrayList.get(3);
        System.out.println(c);
        System.out.println(d);

        //Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
        String x = (String)rawArrayList.get(2);
        System.out.println(x);

    }

}

class RawArrayList {
    public int length = 0;
    private Object[] elements;

    public RawArrayList(int length) {
        this.length = length;
        this.elements = new Object[length];
    }

    public Object get(int index) {
        return elements[index];
    }

    public void add(int index, Object element) {
        elements[index] = element;
    }

    @Override
    public String toString() {
        return "RawArrayList{" +
            "length=" + length +
            ", elements=" + Arrays.toString(elements) +
            '}';
    }
}
