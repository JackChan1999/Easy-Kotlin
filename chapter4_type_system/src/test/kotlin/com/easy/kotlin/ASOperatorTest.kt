package com.easy.kotlin

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Created by jack on 2017/6/15.
 */
@RunWith(JUnit4::class)
class ASOperatorTest {
    @Test fun testAS() {
        val foo = Foo()
        val goo = Goo()
        println(foo is Foo) //true 自己
        println(goo is Foo)// 子类 is 父类 = true
        println(foo is Goo)//父类 is 子类 = false
        println(goo is Goo)//true 自己

        val fg = foo as Goo // java.lang.ClassCastException: com.easy.kotlin.Foo cannot be cast to com.easy.kotlin.Goo
        val gf = goo as Foo
        println(fg)
        println(gf)

    }
}


open class Foo
class Goo : Foo()
