package com.example.hellokotlin

import java.util.Scanner

fun main() {
    // Scanner 객체 생성
    val scan = Scanner(System.`in`)

    // 숫자 입력 받기
    print("숫자 입력 : ")
    val inputNum = scan.nextInt();

    var result : String

    // 입력한 숫자가 홀수인지 짝수인지를 판별해서 결과를 변수에 담는다.
    if (inputNum % 2 == 0) {
        result="$inputNum 은(는)짝수입니다."
    } else {
        result = "$inputNum 은(는) 홀수입니다."
    }

    val result2 = if(inputNum%2 == 1) {
        "$inputNum 은 홀수"
    } else {
        "$inputNum 은 짝수"
    }

    val result3 = if(inputNum%2==1) "$inputNum 은 홀수" else "$inputNum 은 짝수"

    val result4 = if(inputNum%2==1) {
        println("작업 중...")
        // if문 블럭 내 여러 줄이 있는 경우 마지막 줄이 리턴
        "$inputNum 은 홀수입니다."
    } else {
        println("작업 중...")
        "$inputNum 은 짝수입니다."
    }

    println(result)
    println(result2)
    println(result3)
    println(result4)
}