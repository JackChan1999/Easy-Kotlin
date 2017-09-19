package com.easy.kotlin;

import org.junit.Test;

/**
 * Created by jack on 2017/6/13.
 */
@org.junit.runner.RunWith(org.junit.runners.JUnit4.class)
public class StringUtilTest {
    @Test
    public void testGetLength1() {
        StringUtil util = new StringUtil();
        util.getLength1(null);
    }

    @Test
    public void testGetLength2() {
        StringUtil util = new StringUtil();
        try {
            util.getLength2(null);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
