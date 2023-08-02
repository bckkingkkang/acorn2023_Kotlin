package com.example.hellokotlin

import java.lang.NumberFormatException

fun main() {
    var str = "1000"
    var str2 = "천"

    val result2 = try {
        // 예외가 발생하지 않는 경우 대입
        Integer.parseInt(str)
    } catch (nfe:NumberFormatException) {
        // 예외가 발생하는 경우
        0
    }
    println("result2 : ${result2}")
}