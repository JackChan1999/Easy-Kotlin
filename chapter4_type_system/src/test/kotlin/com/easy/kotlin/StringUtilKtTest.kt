package com.easy.kotlin

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Created by jack on 2017/6/13.
 */
@RunWith(JUnit4::class)
class StringUtilKtTest {

    @Test fun testGetLength1() {
        val StringUtilKt = StringUtilKt()
        //StringUtilKt.getLength1(null)
        Assert.assertTrue(3 == StringUtilKt.getLength1("abc"))
    }

    @Test fun testGetLength2() {
        val StringUtilKt = StringUtilKt()
        println(StringUtilKt.getLength2(null)) //null
        Assert.assertTrue(3 == StringUtilKt.getLength2("abc"))
    }

    @Test fun testGetLength3() {
        val StringUtilKt = StringUtilKt()
        println(StringUtilKt.getLength3(null))
        Assert.assertTrue(3 == StringUtilKt.getLength3("abc"))
    }


    @Test fun testIS() {
        val len = strlen("abc")
        println(len) // 3
        val lens = strlen(1)
        println(lens) // 1
    }

    fun strlen(ani: Any): Int {
        if (ani is String) {
            return ani.length
        } else if (ani is Number) {
            return ani.toString().length
        } else if (ani is Char) {
            return 1
        } else if (ani is Boolean) {
            return 1
        }


        print("Not A String")
        return -1
    }

}
