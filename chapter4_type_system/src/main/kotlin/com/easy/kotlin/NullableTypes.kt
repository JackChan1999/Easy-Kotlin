package com.easy.kotlin

/**
 * Created by jack on 2017/6/13.
 */


fun testNullable1(x: String, y: String?): Int {
    return x.length
}

fun testNullable2(x: String, y: String?): Int? {
    return y?.length
}

fun testNullable3(x: String, y: String?): Int? {
    return y!!.length
}


fun nullPlus(){
    null.plus(null)
}
