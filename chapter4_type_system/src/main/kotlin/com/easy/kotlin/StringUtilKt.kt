package com.easy.kotlin

/**
 * Created by jack on 2017/6/13.
 */
class StringUtilKt {

    fun getLength1(str: String): Int {
        return str.length
    }

    fun getLength2(str: String?): Int? {
        return str?.length
    }

    fun getLength3(str: String?): Int? {
        return str!!.length
    }

}
