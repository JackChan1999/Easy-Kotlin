package com.easy.kotlin

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Created by jack on 2017/6/15.
 */
@RunWith(JUnit4::class)
class UnitDemoTest {
    @Test fun testUnitDemo() {
        val ur1 = unitReturn1()
        println(ur1) // kotlin.Unit
        val ur2 = unitReturn2()
        println(ur2) // kotlin.Unit
        val ur3 = unitReturn3()
        println(ur3) // kotlin.Unit
    }

    fun unitReturn1() {

    }

    fun unitReturn2() {
        return Unit
    }

    fun unitReturn3(): Unit {
    }
}
