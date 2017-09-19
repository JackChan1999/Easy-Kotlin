package com.easy.kotlin;

/**
 * Created by jack on 2017/6/14.
 */
public class NullValueDemo {
    public static void testNull() {
        String str = null; // null can be assigned to String
        Integer itr = null; // you can assign null to Integer also
        Double dbl = null;  // null can also be assigned to Double

        String myStr = (String)null; // null can be type cast to String
        Integer myItr = (Integer)null; // it can also be type casted to Integer
        Double myDbl = (Double)null; // yes it's possible, no error

        //Java中，null可以赋值给引用变量，不能将null赋给基本类型变量，例如int、double、float、boolean。如果你那样做了，编译器将会报错

        //int i = null; // type mismatch : cannot convert from null to int
        //short s = null; //  type mismatch : cannot convert from null to short
        //byte b = null; // type mismatch : cannot convert from null to byte
        //double d = null; //type mismatch : cannot convert from null to double

        //但是如果将null赋值给包装类object，然后将object赋给各自的基本类型，编译器不会报，但是你将会在运行时期遇到空指针异常。这是Java中的自动拆箱导致的
        Integer nullInt = null; // this is ok
        int anotherInt = nullInt; // 编译器允许这么赋值, 但是在运行时抛 NullPointerException；Integer的默认值是null而不是0。当把null值传递给一个int型变量的时候自动装箱将会返回空指针异常。

        Integer iAmNull = null;
        if(iAmNull instanceof Integer){
            System.out.println("null is instance of Integer");

        }else{
            System.out.println("null is NOT an instance of Integer");
        }


    }
}
