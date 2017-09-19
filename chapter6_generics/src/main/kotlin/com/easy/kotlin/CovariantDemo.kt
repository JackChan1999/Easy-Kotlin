package com.easy.kotlin

/**
 * Created by jack on 2017/7/1.
 */


interface Source<out T> {
    fun <T> nextT();
}

fun demo(str: Source<String>) {
    val obj: Source<Any> = str // 合法的类型协变
}
