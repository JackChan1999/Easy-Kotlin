package com.easy.kotlin

/**
 * Created by jack on 2017/6/30.
 */


class Book<T>(val v: T)

val b1: Book<Int> = Book<Int>(1)
val b2: Book<Int> = Book(1)
val b3 = Book(1)

open class Vehicle

class Bicycle : Vehicle()
class Train : Vehicle()
class Airplane : Vehicle()




