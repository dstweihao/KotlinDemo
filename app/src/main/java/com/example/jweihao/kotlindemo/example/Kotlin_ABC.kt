package com.example.jweihao.kotlindemo.example

/**
 * Created by weihao on 2018/3/29.
 */


    fun main(args: Array<String>) {
        println("Hello World!");
        var a = 8
        var b = 2
        println("a+b=" + plus(a, b))
        println("a-b" + sub(a, b))


    }

    // fun 固定写法 plus 函数名称（a 第一个参数，类型Int）:Int返回值是Int类型
    fun plus(a: Int, b: Int): Int {
        return a + b
    }

    fun sub(a: Int, b: Int): Int {
        return a - b
    }
