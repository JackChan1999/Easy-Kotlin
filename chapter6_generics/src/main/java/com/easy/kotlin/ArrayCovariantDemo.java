package com.easy.kotlin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jack on 2017/7/1.
 */
public class ArrayCovariantDemo {

    public static void main(String[] args) {
        Integer[] ints = new Integer[3];
        ints[0] = 0;
        ints[1] = 1;
        ints[2] = 2;
        Number[] numbers = new Number[3];
        numbers = ints;
        for (Number n : numbers) {
            System.out.println(n);
        }

        List<Integer> integerList = new ArrayList<>();
        integerList.add(0);
        integerList.add(1);
        integerList.add(2);
        List<Number> numberList = new ArrayList<>();
        //numberList = integerList;

        List<? extends Number> list = new ArrayList<Number>();
        //list.add(new Integer(1)); //error

        // 可以安全的读取数据 out T
        List<? extends Number> list1 = new ArrayList<Integer>();
        List<? extends Number> list2 = new ArrayList<Float>();

        list1.add(null);
        list2.add(null);

        //list1.add(new Integer(1)); // error
        //list2.add(new Float(1.1f)); // error

        // 可以安全的写入数据 in T
        List<? super Number> list3 = new ArrayList<Number>();
        List<? super Number> list4 = new ArrayList<Object>();
        list3.add(new Integer(3));
        list4.add(new Integer(4));

    }

}
