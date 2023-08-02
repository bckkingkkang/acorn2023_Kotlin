package com.example.hellokotlin

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    print("점수 입력 : ")
    val jumsu = scan.nextInt()

    val grade = when(jumsu) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60 until 70 -> "D"
        else -> "F"
    }
    println("점수는 $jumsu 점, 학점은 $grade")
}