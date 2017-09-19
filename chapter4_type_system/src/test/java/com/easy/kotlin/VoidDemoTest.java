package com.easy.kotlin;

/**
 * Created by jack on 2017/6/15.
 */
@org.junit.runner.RunWith(org.junit.runners.JUnit4.class)
public class VoidDemoTest {
    @org.junit.Test
    public void testVoid() {
        VoidDemo voidDemo = new VoidDemo();
        Void v = voidDemo.voidDemo();
        System.out.println(v);
    }
}
