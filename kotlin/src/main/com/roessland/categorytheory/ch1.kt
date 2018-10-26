package com.roessland.categorytheory

/*
Implement, as best as you can, the identity function in your favorite language (or the second favorite, if your favorite language happens to be Haskell).

Implement the composition function in your favorite language. It takes two functions as arguments and returns a function that is their composition.

Write a program that tries to test that your composition function respects identity.

Is the world-wide web a category in any sense? Are links morphisms?

Is Facebook a category, with people as objects and friendships as morphisms?

When is a directed graph a category?
 */

fun <T> id(v: T): T {
    return v
}

fun repeatThreeTimes(v: Int): List<Int> {
    return listOf(v, v, v)
}

fun multiplyByThree(l: List<Int>): List<Int> {
    return l.map { v -> 3*v}
}

fun <A, B, C> compose(g: (B) -> C, f: (A) -> B): (A) -> C {
    return fun (v: A) = g(f(v))
}


fun main(args: Array<String>) {
    println("Hello world!")
    println("identity of " + 5 + " is " + id(5))

    val repeat3V = multiplyByThree(repeatThreeTimes(5))
    println("three times multiplied by three is: $repeat3V")

    val repeatMultiply = compose(::multiplyByThree, ::repeatThreeTimes)
    val repeat3V_ = repeatMultiply(4)
    println("using composition: $repeat3V_")
}